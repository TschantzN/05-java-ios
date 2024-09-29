# Report

## Binary R/W

| Time in ms         | 1B  | 1KiB | 1MiB | 5MiB
|:-------------------|-----|------|------|-----
| WRITING            | 128 | 130  | 1050 |4075
| WRITING BUFFERED   | 125 | 125  | 150  |200
| READING            | 125 | 127  | 370  |1350
| READING BUFFERED   | 122 | 125  | 145  |195

## Text R/W

| Time in ms        | 1B  | 1KiB | 1MiB | 5MiB
|:------------------|-----|------|------|-----
| WRITING           | 130 | 127  | 190  |330
| WRITING BUFFERED  | 125 | 127  | 150  |210
| READING           | 122 | 130  | 190  |320
| READING BUFFERED  | 125 | 125  | 150  |205

### Conclusion

for any file under 1Mib the times are very close. For anything above,
buffering should be used.Buffering is faster because it open the file only 
once no matter the quantity of data to process. The difference between binary 
vs text file is that binary file are made to be more efficiently used by programs. 
Text file on the other hand are filled with human-readable text. Character 
encoding is assigning values to characters to transmit text. The way of encoding 
and decoding as to be the same between two computer discussing. The methodology is 
important because it allows us to compare the different stream in different situation
and to replicate the measures, on another machine for example.