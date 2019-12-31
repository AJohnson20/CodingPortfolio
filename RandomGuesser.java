//Adrienne Johnson 
//10/9/18
// User imput to guess the random number 

import java.util.Scanner;

public class RandomGuesser
{
    public static void main(String[]args)
    {
        Scanner reader= new Scanner(System.in);
        int atempts = 0;
        int num;
        System.out.print("Guess a number between 1 and 100, inclusive: ");
        num = reader.nextInt();
        int guess =(int)(100*Math.random()+1);
        //for (int atempts = 0; num == guess; atempts++)
        while (num > 1)
        {  
           if(num>guess)
           {
             System.out.println("Your guess is too high, guess a number smaller than " + num);
             System.out.print("Guess a number(again): ");
             num = reader.nextInt();
             atempts++;
           }   
           if(num<guess)
           {
             System.out.println("Your guess is too low, guess a number larger than " + num);
             System.out.print("Guess a number(again): ");
             num = reader.nextInt();
             atempts++;
           }
           if (num==guess)
            {
             System.out.println("You got it right! The random number was " + guess);
             System.out.print("It took you " + atempts + " atempts to guess my number!");
             break;
           }
        }
    }
}