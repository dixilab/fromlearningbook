package basics;

/**
 * -------------------------------------------------
 * Exercise 1.2.28.
 * Order checking (ascending, descending)
 * 07.01.2021
 * version:1.0
 * Dinar I. <idmaratovich@gmail.com>
 * -------------------------------------------------
 Thanks to the book
 "Computer Science An Interdisciplinary Approach"
 by Robert Sedgewick and Kevin Wayne
 */

// ascending (x<y<z) or descending (x>y>z)- true
// otherwise - false

public class OrderChecking {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);
        boolean OC = ((x < y) && (y < z)) || ((x > y) && (y > z));
        System.out.println(OC);
    }
}

/*
Example:
-----------
compilation and run:
$ javac src\basics\OrderChecking.java
$ java -cp src basics.OrderChecking 1 2 3
$ java -cp src basics.OrderChecking 3 2 1
$ java -cp src basics.OrderChecking 2 3 1
-----------
out:
true
true
false
*/