# algorithm-art

A collection of source for personal research in computer algorithms.

# naming
Every single algorithm has its own package. Inside, there is a naming scheme for the implementations. Examples are
+ StdQuicksortCpbl
+ TailRecursiveQuicksortSmpl
+ StdMergesortSmpl

The name of the algorithm should in most cases be in one word without any kind of camel case. There is a prefix like 'Std' indicating if it is the commmon standard implementation or if it has some kind of optimization. Yet, there are no combinations of optimizations, but the idea stays that the prefix should express all of it.
There is a suffix as well, which indicates if it deals with simple data ('Smpl') or if it uses the Comparable interface ('Cpbl') or the Comparator interface ('Cptr').

# tests
There are usually several tests per algorithm, which proof correctness of the sorted output and are (for me personally) an indicator showing behaviour of optimizations. The test are not (yet) useful for benchmarking in a more serious sense.

# data formats / test data
Test data is given in text files containing white space separated integers. For the use with Comparable the ints are augmented with their index in the input file to be able to proof if a sort is stable.