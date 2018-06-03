import java.util.*;
import java.io.*;
/**
*Description: This is the ProjectDemo Class
*@author  Kirubel Moges
*@version 0.0.0
*/ 
public class ProjectDemo
{
    /**
     * Description: This is the main function responsible for executing all methods
     * @param args a String array
     * @return Nothing
     * @throws Nothing
     */
    public static void main ( String [] args )
    {
        if ( args.length < 3 ) // check if length of parameter string is less than 3. 
        {
            String tempFileName;
            Scanner keyboard = new Scanner ( System.in ); // Create instance of Scanner Class
            MyFileReader fileReaderObject;    // Create instance of MyFileReader Class
            ArrayList <String> tempCardData = new ArrayList <String> ();
            
            if ( args.length == 0 ) //User did not run program through command line. Execute the normal program
        {
            java.lang.System.out.println("Hello! This program verifies the list of credit card numbers in your file. "
                                    + "\nEnter the name of the file containing the card numbers: " );
            
            tempFileName = keyboard.nextLine();
            
            fileReaderObject = new MyFileReader ( tempFileName );
        }
        
        else if ( args.length == 1 ) // if user enters file name from the command line
        {
            fileReaderObject = new MyFileReader ( args [ 0 ] );
        }
        
        else  // if user enters both input and output file name from command line
        {
            fileReaderObject = new MyFileReader ( args [ 0 ], args [ 1 ] );
        }//endif
        
            if ( fileReaderObject.isFileExists )
            {
                if ( ! fileReaderObject.isFileEmpty )
                {
                    //Card cardObject = new Card ();                    
                    fileReaderObject.getMessage(); // Get message concerning user's output file, if it exists
                    
                    tempCardData = fileReaderObject.getCardNumEntries(); // Get the array representing all card numbers in input file
                    
                    CreditCard creditCardObject = new CreditCard ( tempCardData );
                    
                    //get an array of all valid card numbers and send the array to verify card method of the Credit Card class
                    creditCardObject.verifyCreditCard ( creditCardObject.getValidCardsArray() );
                    
                    
                    System.out.println( "Number of cards in input file: " 
                                        + fileReaderObject.getCardNumEntries().size() );       
                                  
                    
                    try
                    {                
                        PrintToFile printer = new PrintToFile ( creditCardObject );                        
                    }
                    
                    catch (FileNotFoundException e )
                    {
                        System.out.println ( "Output File Not Found! Program Terminated! " );
                        System.exit (0);
                    }
                    
                    java.lang.System.out.println("Card numbers have been verified, sorted, and written to their respective files! " );
                    java.lang.System.out.println ("Would you like to see a list of possible runtime errors from your inputfile? (y/n)");
                    char response = Character.toLowerCase(keyboard.nextLine().charAt(0));
                                   
                    if (response == 'y')
                     {
                         if(creditCardObject.isErrorFound)
                         {  
                             java.lang.System.out.println ( creditCardObject.getMessage() );
                             java.lang.System.out.println ( "Thank you for using this program!");
                         }
                         
                         else
                         {
                             java.lang.System.out.println ("Great News! No errors where found during runtime!\nThank you for using this program!");
                         }
                     }
                    
                    else if (response == 'n')
                     {
                         java.lang.System.out.println ( "Thank you for using this program!");
                     }
                    
                    else
                    {
                        java.lang.System.out.println ("Wrong input! Thank you for using this program!");
                    }         
                    
                }
                
                else
                {
                    java.lang.System.out.println( "Empty File! Insert card numbers and run program again!" );
                    System.exit (0);
                }
            }
            
            else
            {
                java.lang.System.out.println ( "File does not exists! Place file in same directory and run program again! " );
                System.exit (0);
            }
        }
        
        else // args length is greater than 2. Not allowed! Program terminated!
        {
            java.lang.System.out.println("More than the allowed number of input & output files have been sent to the main function! Program Terminated!" );
        }//endif 
    }
}
