package basics;

/**
 * -------------------------------------------------
 * Exercise 1.2.31.
 * Mercator projection
 * 08.01.2021
 * version:1.0
 * Dinar I. <idmaratovich@gmail.com>
 * -------------------------------------------------
 Thanks to the book
 "Computer Science An Interdisciplinary Approach"
 by Robert Sedgewick and Kevin Wayne
 */

// x = lmd - lmd0
// y = 1/2 * ln((1 + sin(phi)) / (1 - sin(phi)))
// lmd - longitude, phi - latitude

public class MercatorProjection {
    public static void main(String[] args) {
        double lmd = Double.parseDouble(args[0]); //longitude in radians
        double phi = Double.parseDouble(args[1]); //latitude in radians
        double lmd0 = 0;
        // converting longitude and latitude to (x,y)
        double x = lmd - lmd0;
        double y = 0.5 * Math.log((1 + Math.sin(phi)) / (1 - Math.sin(phi)));
        System.out.println("("+x+", "+y+")");
    }
}

/*
Example:
-----------
arguments:
1) lmd = -1.292
2) phi = 0.733
-----------
compilation and run:
$ javac src\basics\MercatorProjection.java
$ java -cp src basics.MercatorProjection -1.292 0.733
-----------
out:
(-1.292, 0.8091157114590967)
*/