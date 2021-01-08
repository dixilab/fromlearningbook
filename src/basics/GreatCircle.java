package basics;

/**
 * -------------------------------------------------
 * Exercise 1.2.33.
 * Great-circle
 * 08.01.2021
 * version:1.0
 * Dinar I. <idmaratovich@gmail.com>
 * -------------------------------------------------
 Thanks to the book
 "Computer Science An Interdisciplinary Approach"
 by Robert Sedgewick and Kevin Wayne
 */

/*
Great-circle distance between two point
Paris (48,87N -2,33W) and San-Francisco (37,8N 122,4W)
d = 60 * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
use Math.toDegrees() and Math.toRadians()
 */

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0])); //degrees to radians for x1
        double y1 = Math.toRadians(Double.parseDouble(args[1])); //degrees to radians for y1
        double x2 = Math.toRadians(Double.parseDouble(args[2])); //degrees to radians for x2
        double y2 = Math.toRadians(Double.parseDouble(args[3])); //degrees to radians for y2
        // radians to degrees, 1 degree = 60 nautical miles
        double d = 60 * Math.toDegrees(Math.acos(Math.sin(x1) * Math.sin(x2)
                + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
        System.out.println("Distance: " + d + " NM");
    }
}

/*
Example:
-----------
arguments:
Paris
1) latitude = 48.87
2) longitude = -2.33
San-Francisco
3) latitude = 37.8
4) longitude = 122.4
-----------
compilation and run:
$ javac src\basics\GreatCircle.java
$ java -cp src basics.GreatCircle 48.87 -2.33 37.8 122.4
-----------
out:
Distance: 4828.241014908645 NM
*/
