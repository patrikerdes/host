## host

Reads from standard input, and if an URL is found, the host part of the URL is written to standard output.
If the line can not be parsed as an URL, nothing is written to standard output.

## Running

    $ cat example.txt
    http://www.example.com/example1
    http://example.com/example2
    $ ./host < example.txt
    www.example.com
    example.com

## Building

Create a host.jar file and put it in the same directory as the file host, which is a bash script that just runs the jar.

