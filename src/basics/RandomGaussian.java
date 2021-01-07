package basics;

/**
 * -------------------------------------------------
 * Exercise 1.2.27.
 * Random Gaussian
 * 07.01.2021
 * version:1.0
 * Dinar I. <idmaratovich@gmail.com>
 * -------------------------------------------------
 Thanks to the book
 "Computer Science An Interdisciplinary Approach"
 by Robert Sedgewick and Kevin Wayne
 */

// Box-Muller transform:
// r = sin(2Pi * v) * (-2ln * u)^(1/2)

public class RandomGaussian {
    public static void main(String[] args) {
        double v = Math.random(); // use random methode
        double u = Math.random();
        double r = Math.sin(2*Math.PI*v)*Math.pow((-2*Math.log(u)),(0.5));
        System.out.println("v = "+v+"; u = "+u); //for show random values
        System.out.println("r = " +r);
    }
}

/*
Example:
-----------
compilation and run:
$ javac src\basics\RandomGaussian.java
$ java -cp src basics.RandomGaussian
-----------
out:
v = 0.43145702279644704; u = 0.9724979458129622
r = 0.0985943568631353
*/