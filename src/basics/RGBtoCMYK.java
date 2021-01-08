package basics;

import java.util.Locale;

/**
 * -------------------------------------------------
 * Exercise 1.2.32.
 * Converting colors
 * 08.01.2021
 * version:1.0
 * Dinar I. <idmaratovich@gmail.com>
 * -------------------------------------------------
 Thanks to the book
 "Computer Science An Interdisciplinary Approach"
 by Robert Sedgewick and Kevin Wayne
 */

/*
* RGB to CMYK
* w = max (r / 255, g / 255, b / 255)
* c = (w - (r / 255)) / w
* m = (w - (g / 255)) / w
* y = (w - (b / 255)) / w
* k = 1 - w
 */

public class RGBtoCMYK {
    public static void main(String[] args) {
        double r = Double.parseDouble(args[0]) / 255;
        double g = Double.parseDouble(args[1]) / 255;
        double b = Double.parseDouble(args[2]) / 255;
        double w = Math.max((Math.max(r,g)),b);
        double c = (w - r) / w;
        double m = (w - g) / w;
        double y = (w - b) / w;
        double k = (1 - w);
        System.out.printf(Locale.ROOT,"(%.2f", c);
        System.out.printf(Locale.ROOT,",%.2f", m);
        System.out.printf(Locale.ROOT,",%.2f", y);
        System.out.printf(Locale.ROOT,",%.2f", k);
        System.out.print(")");
    }
}

/*
Example:
-----------
arguments:
1) r = 50
2) g = 110
3) b = 200
-----------
compilation and run:
$ javac src\basics\RGBtoCMYK.java
$ java -cp src basics.RGBtoCMYK 50 110 200
-----------
out:
(0.75,0.45,0.00,0.22)
*/