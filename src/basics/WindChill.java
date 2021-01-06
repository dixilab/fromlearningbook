package basics;

/**
 * -------------------------------------------------
 * Exercise 1.2.25.
 * Wind chill
 * 06.01.2021
 * version:1.0
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
        double t = ((Math.random() * (50 + 60)) - 60); // -60 > t > 50
        double v = ((Math.random() * (120 - 3)) + 3); // 3 > v > 120
        System.out.println("Temperature (F) = " + t + ". Wind speed (mph) = " + v);
        System.out.print("Wind chill (US index) = "); // show random value
        System.out.print(35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v,0.16));
    }
}

/*
Example:
-----------
compilation and run:
javac src/basics/WindChill.java
java -cp src basics.WindChill
-----------
out:
Temperature (F) = 38.9507734450129. Wind speed (mph) = 58.366227865412114
Wind chill (US index) = 23.339052218902452
*/