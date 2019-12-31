/**
 * Adrienne Johnson
 * 12/11/18
 * APCS period 1
 * NumberList
 */

//This program creates and manipulates an array of 
//randomly generated numbers in various ways


import java.util.Scanner;
public class NumberList
{
    public static void main(String[] args)
    {
        //creates a call to the getSizeOfArray() method, which is correctly implemented in a method down below
        int arraySize = getSizeOfArray();
        //You must declare and instantiate an array called myArray 
        //using the arraySize variable 
        int [] myArray = new int [arraySize];
        
        //You will create methods with the names below

        loadArray(myArray);              //This method call needs myArray created above as a parameter  
        System.out.print("\nThe array is loaded with the following random numbers: \n");
        printArray(myArray);             //This method call needs myArray created above as a parameter

        System.out.print("\n\nThe even numbers in the array are: \n");
        evenArray(myArray);        //Displays the elements of myArray that contain even numbers

        System.out.print("\n\nThe odd numbers in the array are: \n");
        oddArray(myArray);         //Displays the elements of myArray that contain odd numbers

        System.out.print("\n\nThe negative numbers in the array are: \n");
        negativeArray(myArray);    //Displays the elements of myArray that contain negative numbers

        //other methods go here
        System.out.print("\n\nThe reverse array is: \n");
        reverseArray(myArray);
        
        System.out.print("\n\nThe min in the array is: \n");
        findMin(myArray);
        
        System.out.print("\n\nThe max in the array is: \n");
        findMax(myArray);

    }

    //Loads an array passed in as a parameter following the 
    //guidelines in the assignment objectives   
    //Finish the header for the method (it is not correct)
    //Write the code following the guidelines in the assignment objectives
    public static void loadArray(int[]myArray)  //method header not correct
    {
        //Load your array with random numbers
        for(int i = 0; i < myArray.length; i++)
        {myArray[i] = (int)(19 * Math.random()) -9;}
    }

    //Displays on one line the elements of the array to the terminal window
    //Then moves cursor to next line
    public static void printArray(int[] A)
    {
        for(int i = 0; i < A.length; i++)
        {
            System.out.print(A[i] + " ");
        }
    }

    //Gets the size of the array from the user.
    //I suggest testing between 15-30, so that the entire array is 
    //seen when printed to the terminal window.
    public static int getSizeOfArray()
    {
        Scanner reader = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter positive integer for size of array to build: ");
            int size = reader.nextInt();
            if (size > 0)
                return size;
        }
    }

    //Create a method below that loops through the array
    //being passed in as a parameter and prints on one line 
    //all the elements that contain *even* numbers
    //Finish the method header below and write code

    public static void evenArray(int [] myArray)//finish method header 
    {
        for (int i = 0; i < myArray.length; i++)
        {
            if (myArray[i]%2 == 0)
            System.out.print(myArray[i] + " ");
        }
    }
    
    //Create a method below that loops through the array
    //being passed in as a parameter and prints on one line 
    //all the elements that contain *odd* numbers
    //Finish the method header below and write code

    public static void oddArray(int [] myArray)       
    {
        for(int i = 0; i<myArray.length; i++)
        {   
            if(myArray[i]%2 != 0)
            System.out.print(myArray[i] + " ");
        }
    }

    //Create a method below that loops through the array
    //being passed in as a parameter and prints on one line 
    //all the elements that contain *negative* numbers
    //Finish the method header below and write code

    public static void negativeArray(int [] myArray)      
    {
        for(int i = 0; i<myArray.length; i++)
        {
            if(myArray[i] < 0)
            System.out.print(myArray[i] + " ");
        }
    }

    //Extras can go below
    //Here is what you might use for reverseList example

    public static void reverseArray(int[] myArray)
    {
        for(int i = myArray.length -1; i >= 0; i--)
        {
            System.out.print(myArray[i] + " ");
        }
    }
    
    public static void findMax(int [] myArray)//finish method header 
    {
        int max = myArray[0];
        for (int element: myArray)
        {
            if (element > max)
            max = element;
        }
        System.out.println(max);
    }
    
    public static void findMin(int [] myArray)//finish method header 
    {
        int min = myArray[0];
        for (int element: myArray)
        {
            if (element < min)
            min = element;
        }
        System.out.println(min);
    }
}
