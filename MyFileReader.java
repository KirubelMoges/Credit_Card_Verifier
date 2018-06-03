import java.io.*; //For File Class and FileNotFoundException
import java.util.*;

/**
*Description: This is the MyFileReader class used to access the file that contains the card number documents
*@author  Kirubel Moges
*@version 0.0.0
*/
public class MyFileReader
{
    // Create array that stores card numbers from file
    ArrayList <String> cardEntries = new ArrayList <String> ();

    // Declare and initialize boolean variables for detecting issues with file
    public boolean isFileExists = true;
    public boolean isFileEmpty = false;
    public static boolean isUserOutputFileExists = false;

    // Declare and initialize String variables to hold default file names
    private static String defaultInputFile = "DataFile.txt";
    private static String defaultOutputFileValid = "valid_cards.txt";
    private static String defaultOutputFileInvalid = "invalid_numbers.txt";

    // Declare and initialize String variable to hold user outputFile if it exits
    private static String userOutputFile = "";
    private static String message = "";

    /**
     * Description: This is the no-args constructor for the MyFileReader Class
     * @param Nothing
     * @return Nothing
     * @throws Nothing
     */
    public MyFileReader()
    {
        try
        {
            File fileObject = new File ( defaultInputFile );
            Scanner inputFile = new Scanner ( fileObject );

                while ( inputFile.hasNext() )
                {
                    // incase cards are separated by delimiter instead of newline
                    StringTokenizer token = new StringTokenizer ( inputFile.nextLine(), "," );

                    while ( token.hasMoreTokens() )
                    {
                        cardEntries.add ( token.nextToken().trim()); // trim if left over space found
                    }

                }//endWhile


        }

        catch ( FileNotFoundException e )
        {
            isFileExists = false;
        }
    }

    /**
     * Description: This is the one parameter constructor for the MyFileReader Class
     * @param inputFileName The name of the document the user wants to read card numbers from
     * @return Nothing
     * @throws Nothing
     */
    public MyFileReader(String inputFileName)
    {
        try
        {
            //read and edit user output file name
            if ( ! inputFileName.endsWith( ".txt" ) )
            {
                inputFileName += ".txt";
            }//endif

            File fileObject = new File ( inputFileName );
            Scanner inputFile = new Scanner ( fileObject );

                while ( inputFile.hasNext() )
                {
                    // incase cards are separated by delimiter instead of newline
                    StringTokenizer token = new StringTokenizer ( inputFile.nextLine(), "," );

                    while ( token.hasMoreTokens() )
                    {
                        cardEntries.add ( token.nextToken().trim()); // trim if left over space found
                    }
                }//endWhile

        }

        catch ( FileNotFoundException e )
        {
            isFileExists = false;
        }

        catch ( NoSuchElementException e )
        {
            message += "Empty File! Please insert card numbers and run program again. " ;
        }
    }

    /**
     * Description: This is the 2 parameter constructor for the MyFileReader Class - Overloaded Constructor
     * @param inputFileName The name of the document the user wants to read card numbers from
     * @param outPutFileName The name of the document the user wants all valid and invalid card written to
     * @return Nothing
     * @throws Nothing
     */
    public MyFileReader(String inputFileName, String outputFileName)
    {
        try
        {
            if ( ! inputFileName.endsWith( ".txt" ) )
            {
                inputFileName += ".txt";
            }//endif

            File fileObject = new File ( inputFileName );
            Scanner inputFile = new Scanner ( fileObject );

                while ( inputFile.hasNext() )
                {
                    // incase cards are separated by delimiter instead of newline
                    StringTokenizer token = new StringTokenizer ( inputFile.nextLine(), "," );

                    while ( token.hasMoreTokens() )
                    {
                        cardEntries.add ( token.nextToken().trim()); // trim if left over space found
                    }
                }//endWhile

        }

        catch ( FileNotFoundException e )
        {
            isFileExists = false;
        }

        finally // Create the output file the user wants & make message
        {
            if ( ! outputFileName.endsWith( ".txt" ) )
            {
                outputFileName += ".txt";
            }//endif
            userOutputFile = outputFileName;

            try
            {
               File outputFileObject = new File ( outputFileName );
               outputFileObject.createNewFile(); // create the output file
               isUserOutputFileExists = true;
            }

            catch ( IOException e )
            {
                isUserOutputFileExists = false;
                message = "Error has occured with your output File. Using default output Files..." ;
            }
        }
    }

    /**
     * Description: This method returns the cardEntires array
     * @param Nothing
     * @return cardEntries an ArrayList <String>
     * @throws Nothing
     */
    public ArrayList <String> getCardNumEntries()
    {
        return cardEntries;
    }

    /**
     * Description: This method returns a String message to the calling function
     * @param Nothing
     * @return message
     * @throws Nothing
     */
    public static String getMessage()
    {
        return message;
    }

    /**
     * Description: This method returns the name of the userOutputFile if it exists
     * @param Nothing
     * @return userOutputFile
     * @throws Nothing
     */
    public static String getUserOutputFileName ()
    {
        return userOutputFile;
    }

    /**
     * Description: This method returns the String defaultInputFile
     * @param Nothing
     * @return defaultInputFile
     * @throws Nothing
     */
    public static String getDefaultInputFile ()
    {
        return defaultInputFile;
    }

    /**
     * Description: This method returns the String defaultOutputFileValid
     * @param Nothing
     * @return defaultOutputFileValid
     * @throws Nothing
     */
    public static String getDefaultOutputFileValid ()
    {
        return defaultOutputFileValid;
    }

    /**
     * Description: This method returns the String defaultOutputFileInvalid
     * @param Nothing
     * @return defaultOutputFileInvalid
     * @throws Nothing
     */
    public static String getDefaultOutputFileInvalid ()
    {
        return defaultOutputFileInvalid;
    }
}
