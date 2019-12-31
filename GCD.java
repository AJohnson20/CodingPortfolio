/**
 * Adrienne Johnson
 * 11/27/18
 * APCS period 3
 * GCD
 */
//This program has a method called getGCD() that, when called, 
//prompts the user to enter a smaller integer followed by a larger integer
//and then prints each step in the process using the Euclidean algorithm
//to find the greatest common divisor

import java.util.Scanner;
public class GCD
{
  private int low;
  private int high;

  public GCD()
  {
    low = 1;
    high = 1;
  }
        
  public void getGCD()
  {   
     Scanner reader = new Scanner (System.in);
     while(true)  
    {System.out.print("Enter the smaller integer: ");
     low = reader.nextInt();
     //assert low > 0;
     System.out.print("Enter the larger integer: ");
     high = reader.nextInt();
     //assert high > 0;
     if(low <= 0)
      System.out.print("Both integers must be positive");
     if(high <= 0)
      System.out.print("Both integers must be positive");
     //assert low <= high;
     //write a loop on if the numbers are right and if they are break the loop
     if(low > 0 && high > 0)
     break;
    }
    int remainder = high%low;
      //right now this is an infinite loop because remainder is never reassigned
      //in the loop, reassign remainder, low and high
    while(remainder > 0)
    {
      System.out.println("Step A: The remainder is " + remainder);
      high = low;
      low = remainder;
      remainder = high%low;
      System.out.println("Step B: The larger is " + low + "and the smaller is " + remainder); 
      if(remainder == 0)
      {
        System.out.println("The GCD is " + low);
      }
    }
  }
}