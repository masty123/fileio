# Testing File Input and Output
In this repository will test the copying speed by HP Omen 16

## File that use for Testing
Big-Alice-in-Wonderland.txt sized 2,101560 bytes

| Type of testing | Total time |
|:----------------|-----------:|
|Copy the file one byte at a time|8.752 seconds|
|Copy a file using a byte of array of size 1KB|0.013 seconds|
|Copy a file using a byte of array of size 4KB|0.006 seconds|
|Copy a file using a byte of array of size 64KB|0.003 seconds|
|Copy a file using BufferedReader and PrintWriter to copy lines of text|0.059 seconds|

# Copy byte by byte
This  is the slowest way to copy the file, the cursor ran by the character and wrote the new file so it take a long time to finish.
# Copy by 1 kilobyte
copy by 1,024 byte per round is 1000 times faster.
# Copy by 4 kilobyte
copy by 4,096 byte per round is faster than 1 kilobyte.
# Copy By 64 kilobyte
copy by 64k byte per round, this must be the fastest way of the experiment,
# Copy by BufferedReader
copy by BufferedReader is copying by a line.
