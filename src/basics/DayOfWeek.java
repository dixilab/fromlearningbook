package basics;

/**
 * -------------------------------------------------
 * Exercise 1.2.29.
 * Day of the week
 * 07.01.2021
 * version:1.0
 * Dinar I. <idmaratovich@gmail.com>
 * -------------------------------------------------
 Thanks to the book
 "Computer Science An Interdisciplinary Approach"
 by Robert Sedgewick and Kevin Wayne
 */

// (year) y0 = y - (14 - m) / 12
// x = y0 + y0 / 4 - y0 / 100 + y0 / 400
// (month) m0 = m + 12 * ((14 - m) / 12) - 2
// january-1,february-2,march-3,...,december-12
// (day of week ) d0 = (d + x + (31 * m0) / 12) % 7
// sunday-0,monday-1,tuesday-2,...,saturday-6

public class DayOfWeek {
    public static void main(String[] args) {
        int d = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        System.out.println("Day of the week: " + d0);
    }
}

/*
Example:
-----------
arguments:
1) day = 7
2) month = 1
3) year = 2021
-----------
compilation and run:
$ javac src\basics\DayOfWeek.java
$ java -cp src basics.DayOfWeek 7 1 2021
-----------
out:
Day of the week: 4
*/