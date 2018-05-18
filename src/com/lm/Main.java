package com.lm;

import com.challenge.series.Series;

public class Main {

    public static void main(String[] args) {
        //  Created by Laura Macia: May 18, 2018
        //  Udemy - Complete Java Masterclass with Tim Buchalka
        //  Challenge: Packages
        //
        // Create a suitably named package containing a class called Series
        // with the following static methods:
        // nSum(int n) returns the sum of all numbers from 0 to n. The first 10 numbers are:
        // 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55.
        //
        // factorial(int n) returns the product of all numbers from 1 to n
        //      i.e. 1 * 2 * 3 * 4 ... * (n - 1) * n.
        // The first 10 factorials are:
        // 0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800.
        //
        // fibonacci(n) returns the nth Fibonacci number. These are defined as:
        // f(0) = 0
        // f(1) = 1
        // f(n) = f(n-1) + f(n-2)
        // (so f(2) is also 1. The first 10 fibonacci numbers are:
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
        //
        // When you have tested your functions, delete the Main class and
        // produce a jar file.
        //
        // Create a new project and add your Series library, then test the
        // three methods in the main() method of your new project.


        // For challenge, I created Series class and JAR library in another project/package,
        // then created this new project, imported created JAR library (see above),
        // copied the Main I had used for testing underneath
        // 

        Series test = new Series();
        System.out.println(test.nSum(10));
        System.out.println(test.factorial(1));
        System.out.println(test.factorial(2));
        System.out.println(test.factorial(3));
        System.out.println(test.factorial(4));
        System.out.println(test.factorial(5));
        System.out.println(test.factorial(6));
        System.out.println(test.factorial(7));

        System.out.println(test.fibonacci(0));
        System.out.println(test.fibonacci(1));
        System.out.println(test.fibonacci(2));
        System.out.println(test.fibonacci(3));
        System.out.println(test.fibonacci(4));
        System.out.println(test.fibonacci(5));
        System.out.println(test.fibonacci(6));
        System.out.println(test.fibonacci(7));
        System.out.println(test.fibonacci(8));
        System.out.println(test.fibonacci(9));
        System.out.println(test.fibonacci(10));
    }
}
