# Touch

touch implemenmtation in Java

## Build

with maven:
```
mvn package
```

with gradle
```
gradle shadowJar
```

https://stackoverflow.com/questions/1406473/simulate-touch-command-with-java


## Todo
* [_]  implement -a
* [_]  implement -c
* [_]  implement -d
* [_]  implement -h
* [_]  implement -m
* [_]  implement -r
* [_]  implement -c
* [_]  implement -t
* [_]  implement -w

## man touch

```
NAME
       touch - change file timestamps

SYNOPSIS
       touch [OPTION]... FILE...

DESCRIPTION

       Update the access and modification times of each FILE to the current time.

       A FILE argument that does not exist is created empty, unless -c or -h is supplied.

       A FILE argument string of - is handled specially and causes touch to change the times of the file associated with standard output.

       Mandatory arguments to long options are mandatory for short options too.

       -a     change only the access time

       -c, --no-create
              do not create any files

       -d, --date=STRING
              parse STRING and use it instead of current time

       -f     (ignored)

       -h, --no-dereference
              affect each symbolic link instead of any referenced file (useful only on systems that can change the timestamps of a symlink)

       -m     change only the modification time

       -r, --reference=FILE
              use this file's times instead of current time

       -t STAMP
              use [[CC]YY]MMDDhhmm[.ss] instead of current time

       --time=WORD
              change the specified time: WORD is access, atime, or use: equivalent to -a WORD is modify or mtime: equivalent to -m

       --help display this help and exit

       --version
              output version information and exit

       Note that the -d and -t options accept different time-date formats.

DATE STRING
       The --date=STRING is a mostly free format human readable date string such as "Sun, 29 Feb 2004 16:21:42 -0800" or "2004-02-29 16:21:42"
       or even "next Thursday".  A date string may contain items indicating calendar date, time of day, time zone, day of week, relative time,
       relative date, and numbers.  An empty string indicates the beginning of the day.  The date string format is more complex than is easily
       documented here but is fully described in the info documentation.
```
