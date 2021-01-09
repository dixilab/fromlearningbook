package basics;

/*****************************************************\
 * Exercise 1.2.34.
 * Sorting triplets
 * 08.01.2021
 * version:1.0
 * Dinar I. <idmaratovich@gmail.com>
 *****************************************************
 Thanks to the book
 "Computer Science An Interdisciplinary Approach"
 by Robert Sedgewick and Kevin Wayne
\*****************************************************/

/*====================================================
Sorting triplets in ascending values
use Math.min() and Math.max()
====================================================*/

public class SortingTriplets {
    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        int max, min, mid;
        max = Math.max(Math.max(a,b),c); // maximum value
        min = Math.min(Math.min(a,b),c); // minimum value
        mid = a + b + c - max - min; // middle value
        System.out.print(min + ", " + mid + ", " + max);
    }
}

/*
Example:
-----------
arguments:
1) a = 27364
2) b = 646
3) c = 389
-----------
compilation and run:
javac src\basics\SortingTriplets.java
java -cp src basics.SortingTriplets 27364 646 389
-----------
out:
389, 646, 27364
*/