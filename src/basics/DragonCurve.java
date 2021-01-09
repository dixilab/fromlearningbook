package basics;

/*****************************************************\
 * Exercise 1.2.35.
 * Dragon Curve
 * 09.01.2021
 * version:1.0
 * Dinar I. <idmaratovich@gmail.com>
 *****************************************************
 Thanks to the book
 "Computer Science An Interdisciplinary Approach"
 by Robert Sedgewick and Kevin Wayne
\*****************************************************/

/*====================================================
0 = F
1 = FLF
2 = FLFLFRF
3 = FLFLFRFLFLFRFRF
4 = FLFLFRFLFLFRFRFLFLFLFRFRFLFRFRF
5 = FLFLFRFLFLFRFRFLFLFLFRFRFLFRFRFLFLFLFRFLFLFRFRFRFLFLFRFRFLFRFRF
====================================================*/

public class DragonCurve {
    public static void main(String[] args) {
        String x0 = "F";
        String y0 = "F";
        String x1 = x0 + "L" + y0;
        String y1 = x0 + "R" + y0;
        String x2 = x1 + "L" + y1;
        String y2 = x1 + "R" + y1;
        String x3 = x2 + "L" + y2;
        String y3 = x2 + "R" + y2;
        String x4 = x3 + "L" + y3;
        String y4 = x3 + "R" + y3;
        String x5 = x4 + "L" + y4;
        System.out.println("0 = " + x0);
        System.out.println("1 = " + x1);
        System.out.println("2 = " + x2);
        System.out.println("3 = " + x3);
        System.out.println("4 = " + x4);
        System.out.println("5 = " + x5);
    }
}

/*
Example:
-----------
compilation and run:
$ javac src\basics\DragonCurve.java
$ java -cp src basics.DragonCurve
-----------
out:
0 = F
1 = FLF
2 = FLFLFRF
3 = FLFLFRFLFLFRFRF
4 = FLFLFRFLFLFRFRFLFLFLFRFRFLFRFRF
5 = FLFLFRFLFLFRFRFLFLFLFRFRFLFRFRFLFLFLFRFLFLFRFRFRFLFLFRFRFLFRFRF
 */