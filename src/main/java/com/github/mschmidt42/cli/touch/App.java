package com.github.mschmidt42.cli.touch;

import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.stream.Stream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.concurrent.Callable;

import picocli.CommandLine;
import picocli.CommandLine.*;

@Command(name = "touch", mixinStandardHelpOptions = true, version = "cat 1.0",
	description = "touch")
public class App  implements Callable<Integer> 
{
    @Parameters(arity = "0..*", description = "input file(s)")
    String[] fileNames;

    @Option( names = {"-d", "--debug"}, description="print debug messages")
    boolean debug = false;

    public static void main( String[] args )
    {
    	int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }

    public static void touch(final Path path) throws IOException {
        Objects.requireNonNull(path, "path is null");
        try {
            Files.createFile(path);
        } catch (FileAlreadyExistsException e) {
            Files.setLastModifiedTime(path, FileTime.from(Instant.now()));
        }
    }

    public Integer call() throws Exception {
        if(fileNames != null) {
            for (String filename : fileNames) {
                touch(Path.of(filename));
            }
        } 

        return 0;
    }
}
