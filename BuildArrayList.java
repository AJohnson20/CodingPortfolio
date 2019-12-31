/* 2-20-19
 * Adrienne Johnson 
 */
//include a comment about what this program does here
import java.util.ArrayList;
import java.util.Scanner;
public class BuildArrayList
{
    public static void main(String[] args)
    {
       Scanner reader = new Scanner(System.in);
       ArrayList<String> myArrayList = new ArrayList<String>();//You must declare and instantiate an ArrayList object here
       
       loadArrayList(myArrayList);                                         
        
       System.out.println("\nThe ArrayList is loaded with the following words: ");
       printArrayList(myArrayList);                                        
       System.out.println("\nThe size of the ArrayList is: " + myArrayList.size()); //modify this return the size of myArrayList
       
       addWords(myArrayList);
       printArrayList(myArrayList);
       evenReplace(myArrayList);
       printArrayList(myArrayList);
       deleteSecond(myArrayList);
       printArrayList(myArrayList);
       mathToCompSci(myArrayList);
       printArrayList(myArrayList);
       
           
       //other methods go here
    }

    //Loads an ArrayList passed in as a parameter following the 
    //guidelines in the assignment objectives   
    //Finish the header for the method (it is not correct)
    //Write the code following the guidelines in the assignment objectives
    
    public static void loadArrayList(ArrayList<String> A)  
    {
       //Load your arrayList with five words that the user types in after prompted to enter a word
       int counter = 0;
       Scanner reader = new Scanner(System.in);
       while(counter < 5)
       { System.out.print("Enter a word: ");
         A.add(reader.nextLine());
         counter++;
       }
    }

    // displays ArrayList A to the terminal window
    // moves cursor to next line

    public static void printArrayList(ArrayList<String> A)  //modify header and body to work with ArrayLists
    {
       for(int k = 0; k < A.size(); k++)
       {
         System.out.println(A.get(k) + " ");
       }
       System.out.println();
    }

    //your methods go below here
    public static void addWords(ArrayList<String> A)
    {
       int counter = 0;
       Scanner reader = new Scanner(System.in);
       while(counter < 2)
       { System.out.print("Enter a word: ");
         A.add(reader.nextLine());
         counter++;
       }
    }

    public static void evenReplace(ArrayList<String> A)
    {
       for(int k = 0; k < A.size(); k++)
       {
         if(k%2 == 0)
         A.set(k,"even");
       }
    }
    
    public static void deleteSecond(ArrayList<String> A)
    {
        A.remove(1);
    }
    
    public static void mathToCompSci(ArrayList<String> A)
    {
        for(int k = 0; k < A.size(); k++)
        {
            if((A.get(k)).compareTo("m")<0)
            A.set(k, "compsci");
        }
    }
}
