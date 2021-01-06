package basics;

/**
 * -------------------------------------------------
 * Exercise 1.2.26.
 * Polar coordinates
 * 07.01.2021
 * version:1.0
 * Dinar I. <idmaratovich@gmail.com>
 * -------------------------------------------------
 Thanks to the book
 "Computer Science An Interdisciplinary Approach"
 by Robert Sedgewick and Kevin Wayne
 */

// Converting Cartesian coordinates to polar coordinates.
// for radial coordinate (r): r^2 = y^2 + x^2
// for angular coordinate (o): use atan2 method

public class PolarCoordinates {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double r = Math.sqrt(Math.pow(y,2) + Math.pow(x,2));
        double o = Math.atan2(y,x);
        System.out.println("r = " + r + "; o = " + o);
    }
}

/*
Example:
-----------
arguments:
1) x = 2
2) y = 3
-----------
compilation and run:
$ javac src/basics/PolarCoordinates.java
$ java -cp src basics.PolarCoordinates 2 3
-----------
out:
r = 3.605551275463989; o = 0.982793723247329
*/