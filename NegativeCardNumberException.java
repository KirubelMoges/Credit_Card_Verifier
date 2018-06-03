
/**
*Description: This is the NegativeCardNumberException Class that handles negative numbers. 
*@author  Kirubel Moges
*@version 0.0.0
*/ 
public class NegativeCardNumberException extends Exception
{
    /**
     * Description: This is the constructor for the NegativeCardNumberException Class extending Exception Class
     * @param mess A String
     * @return Nothing
     * @throws Nothing
     */
    
    public NegativeCardNumberException (String mess)
    {
        super(mess); // send to parent class
    }

}
