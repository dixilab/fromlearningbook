package basics;

/**
 * -------------------------------------------------
 * Exercise 1.2.30.
 * Random numbers with a uniform distribution
 * 07.01.2021
 * version:1.0
 * Dinar I. <idmaratovich@gmail.com>
 * -------------------------------------------------
 Thanks to the book
 "Computer Science An Interdisciplinary Approach"
 by Robert Sedgewick and Kevin Wayne
 */

//use method max and min
//arithmetic mean = (x1 + x2 + x3 + x4 + x5) / 5

public class RandomNumbers {
    public static void main(String[] args) {
        double x1 = Math.random();
        double x2 = Math.random();
        double x3 = Math.random();
        double x4 = Math.random();
        double x5 = Math.random();
        double min1 = Math.min(x1,x2); // minimum value
        double min2 = Math.min(x3,x4);
        double min3 = Math.min(min1,min2);
        double min4 = Math.min(min3,x5);
        double max1 = Math.max(x1,x2); // maximum value
        double max2 = Math.max(x3,x4);
        double max3 = Math.max(max1,max2);
        double max4 = Math.max(max3,x5);
        double am = (x1 + x2 + x3 + x4 +x5) / 5; // arithmetic mean
        System.out.println("Minimum value: " + min4);
        System.out.println("Maximum value: " + max4);
        System.out.println("Arithmetic mean: " + am);

    }
}

/*
Example:
-----------
compilation and run:
$ javac src/basics/RandomNumbers.java
$ java -cp src basics.RandomNumbers
-----------
out:
Minimum value: 0.06123404036439084
Maximum value: 0.9818267386204885
Arithmetic mean: 0.4167309267438862
*/