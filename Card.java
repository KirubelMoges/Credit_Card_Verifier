import java.util.*;
/**
*Description: This is the Card class used to perform operations on values read from input file
*@author  Kirubel Moges
*@version 0.0.0
*/ 
public class Card
{
    // Create an 3 ArrayLists to be inherited by the CreditCard Class, to store values
    protected ArrayList <String> invalidCreditCards = new ArrayList <String> ();
    protected ArrayList <String> finalValidCardNumbers = new ArrayList <String> ();
    protected ArrayList <String> finalCardIssuer = new ArrayList <String> ();
    protected ArrayList <String> finalCardInitials = new ArrayList <String> ();
    protected ArrayList <String> preValidCreditCards = new ArrayList <String> ();
    
    // Create 2 ArrayLists to store valid and invalid card numbers
    private ArrayList <String> invalidCards = new ArrayList <String> ();
    private ArrayList <String> validCards = new ArrayList <String> ();
    protected String message = "";
    protected boolean isErrorFound = false;
    
    /**
     * Description: This is the no-args constructor of the Card Class
     * @param nothing
     * @return Nothing
     * @throws Nothing
     */
    public Card ()
    {
        return;
    }    
    
    /**
     * Description: This is the constructor of the Card Class
     * @param entriesArray ArrayList <String> 
     * @return Nothing
     * @throws Nothing
     */
    public Card ( ArrayList <String> entriesArray )
    {
        //send array by reference
        this.verifyCard( entriesArray ); // verifiy the length of the cards, length must be between 13 - 19 digits
    }
    
    /**
     * Description: This method checks if the contents of the input file is length consistent with 
     *              card number (between 13 & 19)
     * @param entriesArray ArrayList <String> type
     * @return Nothing
     * @throws Nothing
     */
    public void verifyCard ( ArrayList <String> entriesArray )
    {
        String tempString = "";
        
        
        for ( int i = 0; i < entriesArray.size(); i++ )
        {
           tempString = entriesArray.get ( i );
           if ( tempString.length() >= 13 && tempString.length() <=19 )
           {
                validCards.add ( tempString );               
           }
           
           else
           {
               isErrorFound = true;
               invalidCards.add ( tempString ); //card numbers of length less than 13 and greater than 19 are invalid
               message += tempString + " : This card number is either too short or too long  \n";
           }
        }
    }
    
    /**
     * Description: This method returns the invalidCards String array
     * @param Nothing
     * @return invalidCards ArrayList <String> type
     * @throws Nothing
     */
    public ArrayList <String> getInvalidCards ()
    {
        return invalidCards;
    }
    
    /**
     * Description: This method returns the finalCardIssuer String array
     * @param Nothing
     * @return finalCardIssuer ArrayList <String> type
     * @throws Nothing
     */
    public ArrayList <String> getFinalCardIssuer ()
    {
        return finalCardIssuer;
    }
    
    /**
     * Description: This method returns the finalValidCardNumbers Integer array
     * @param Nothing
     * @return cardEntries 
     * @throws Nothing
     */
    public ArrayList <String> getFinalValidCardNumbers ()
    {
        return finalValidCardNumbers;
    }
    
    /**
     * Description: This method returns the invalidCreditCards String array
     * @param Nothing
     * @return invalidCreditCards ArrayList <String> type
     * @throws Nothing
     */
    public ArrayList <String> getInvalidCreditCards ()
    {
        return invalidCreditCards;
    }
    
    /**
     * Description: This method returns the finalCardInitials array
     * @param Nothing
     * @return finalCardInitials ArrayList <String> type
     * @throws Nothing
     */
    public ArrayList <String> getFinalCardInitials ()
    {
        return finalCardInitials;
    }
    
    /**
     * Description: This method returns the message variable
     * @param Nothing
     * @return message
     * @throws Nothing
     */
    public String getMessage ()
    {
        return message;
    }
    
    /**
     * Description: This method returns the validCards String ArrayList
     * @param Nothing
     * @return validCards an ArrayList <String> type
     * @throws Nothing
     */
    public ArrayList <String> getValidCardsArray ()
    {
        return validCards;
    }
    
    
    /**
     * Description: This method returns the preValidCreditCards array
     * @param Nothing
     * @return preValidCreditCards an ArrayList <String> type
     * @throws Nothing
     */
    public ArrayList <String> getPreValidCreditCards ()
    {
        return preValidCreditCards;
    }
}
