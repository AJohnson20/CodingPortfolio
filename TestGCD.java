/**
 * Adrienne Johnson
 * 11/30/18
 * APCS period 3
 * TestGCD
 */

//This program tests the GCD program by creating a new GCD object and
//sending the getGCD() method to that object
//to find the greatest common divisor.

import java.util.Scanner;
public class TestGCD
{
    public static void main (String []args)
    {
        Scanner reader = new Scanner (System.in);

        GCD test = new GCD();
        test.getGCD();
    }
}