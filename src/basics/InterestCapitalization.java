package basics;

/**
 * -------------------------------------------------
 * Exercise 1.2.24.
 * Interest capitalization
 * 05.01.2021
 * version:1.0
 * Dinar I. <idmaratovich@gmail.com>
 * -------------------------------------------------
 Thanks to the book
 "Computer Science An Interdisciplinary Approach"
 by Robert Sedgewick and Kevin Wayne
 */

// IC (Interest Capitalization) = dollars * e ^ (percent * years)

public class InterestCapitalization {
    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]); // dollars
        double r = Double.parseDouble(args[1]) / 100; // percent
        double t = Double.parseDouble(args[2]); // years
        System.out.printf ("IC = %.2f %n" , ( p * Math.exp(r * t)));
    }
}

/*
Example:
-----------
arguments:
1) dollars p = 100000
2) percent r = 5
3) years t = 15
-----------
compilation and run:
javac src/basics/InterestCapitalization.java
java -cp src basics.InterestCapitalization 100000 15 5
-----------
out:
IC = 211700,00
*/
