package basics;

/**
 * -------------------------------------------------
 * Exercise 1.2.25.
 * Wind chill
 * 07.01.2021
 * version:1.1
 * Dinar I. <idmaratovich@gmail.com>
 * -------------------------------------------------
 Thanks to the book
 "Computer Science An Interdisciplinary Approach"
 by Robert Sedgewick and Kevin Wayne
 */

// WC = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * v ^ 0.16
// WC = Wind chill (US index), t = temperature (Fahrenheit), v = wind speed (mph)

public class WindChill {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]); // t < 50
        double v = Double.parseDouble(args[1]); // 3 < v < 120
        System.out.print("Wind chill (US index) = ");
        System.out.print(35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v,0.16));
    }
}

/*
Example:
-----------
arguments:
!!! only use t < 50, 3 < v < 120 !!!
1) temperature (F) t = 38
2) wind speed (mph) v = 58
-----------
compilation and run:
$ javac src/basics/WindChill.java
$ java -cp src basics.WindChill 38 58
-----------
out:
Wind chill (US index) = 22.006670830488815
*/