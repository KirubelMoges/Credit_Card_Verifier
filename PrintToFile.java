import java.util.*;
import java.io.*;
/**
*Description: This is the PrintToFile Class responsible for printing to output files
*@author  Kirubel Moges
*@version 0.0.0
*/ 
public class PrintToFile
{
    Card cardObject = new Card (); // Create instance of Card Class for polymorphism
    int number = 0;
    /**
     * Description: This is the constructor of the PrintToFile Class
     * @param tempObject an instance of CreditCard Class
     * @return Nothing
     * @throws FileNotFoundException
     */
    public PrintToFile (CreditCard tempObject) throws FileNotFoundException
    {
        cardObject = tempObject; //Polymorphism
        
        this.printInvalids(); //This method prints all invalid entires to invalid_numbers.txt
        
        this.printValids(); // This prints all valid entries to valid_numbers.txt
        
        if ( MyFileReader.isUserOutputFileExists ) // check if user has their own output file
        {
            this.printToOutputFile ( MyFileReader.getUserOutputFileName () ); // print to user output file
        }
    }
    
    /**
     * Description: This is method prints the invalid numbers 
     * @param Nothing
     * @return Nothing
     * @throws FileNotFoundException
     */
    private void printInvalids () throws FileNotFoundException
    {
        File fileObject = new File ( MyFileReader.getDefaultOutputFileInvalid () );
        PrintWriter printerObject = new PrintWriter ( fileObject );
        
        printerObject.println ( "The following are invalid entries from the " + MyFileReader.getDefaultInputFile () + " document: " );
        
        for ( int i = 0; i < cardObject.getInvalidCards ().size(); i++ )
        {
            printerObject.println ( cardObject.getInvalidCards ().get ( i ) );
        }
        
        for ( int j = 0; j < cardObject.getInvalidCreditCards ().size () ; j++ )
        {
            printerObject.println ( cardObject.getInvalidCreditCards (). get ( j ) );
        }
        
        printerObject.close();
        
    }
    
    /**
     * Description: This method prints valid cards
     * @param Nothing
     * @return Nothing
     * @throws FileNotFoundException
     */
    private void printValids () throws FileNotFoundException
    {
        File fileObject = new File ( MyFileReader.getDefaultOutputFileValid () );
        PrintWriter printerObject = new PrintWriter ( fileObject );
        
        printerObject.println ( "The following are identified and correct Credit Card numbers from the " + MyFileReader.getDefaultInputFile () + " document: \n" );
        
        for ( int i = 0; i < cardObject.getFinalValidCardNumbers (). size (); i++ )
        {
            printerObject.println ( cardObject.getFinalValidCardNumbers ().get ( i ) + " -- " +  cardObject.getFinalCardInitials ().get ( i )
                                    + " -- " + cardObject.getFinalCardIssuer ().get ( i )  );                                     
        }
        
        printerObject.println ( "The following are valid Credit Card numbers, with unknown issuers: \n" );
        for ( int j = 0; j < cardObject.getPreValidCreditCards (). size (); j++ )
        {
            printerObject.println ( cardObject.getPreValidCreditCards ().get ( j ) + " -- " + "Valid Credit Card" + " -- " 
                                    + " Unknown Credit Card Issuer ");
        }
        printerObject.close();
        
    }
    
    /**
     * Description: This method prints to useroutputfile if it exists
     * @param outputName String type
     * @return Nothing
     * @throws FileNotFoundException
     */
    private void printToOutputFile ( String outputName ) throws FileNotFoundException
    {
        File fileObject = new File ( MyFileReader.getUserOutputFileName () );
        PrintWriter printerObject = new PrintWriter ( fileObject );
        
        printerObject.println ( "The following are identified and correct Credit Card numbers from the " + MyFileReader.getDefaultInputFile () + " document: \n" );
        
        for ( int i = 0; i < cardObject.getFinalValidCardNumbers (). size (); i++ )
        {
            printerObject.println ( cardObject.getFinalValidCardNumbers ().get ( i ) + " -- " +  cardObject.getFinalCardInitials ().get ( i )
                                    + " -- " + cardObject.getFinalCardIssuer ().get ( i )  );                                     
        }
        
        printerObject.println ( "\nThe following are valid Credit Card numbers, with unknown issuers: \n" );
        for ( int j = 0; j < cardObject.getPreValidCreditCards (). size (); j++ )
        {
            printerObject.println ( cardObject.getPreValidCreditCards ().get ( j ) + " -- " + "Valid Credit Card" + " -- " 
                                    + " Unknown Credit Card Issuer ");
        }       
        
        printerObject.println ( "\nThe following are invalid entries from the " + MyFileReader.getDefaultInputFile () + " document: \n" );
        
        for ( String i: cardObject.getInvalidCards () ) //Enhanced for loops
        {
            printerObject.println ( i );
        }
        
        for ( String j:cardObject.getInvalidCreditCards () )
        {
            printerObject.println ( j );
        }
        printerObject.close();
    }
}
