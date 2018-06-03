import java.util.*;

/**
*Description: This is the CreditCard class
*@author  Kirubel Moges
*@version 0.0.0
*/
public class CreditCard extends Card
{
    private ArrayList <String> cardIssuer = new ArrayList <String> (); // Create new Arraylist for storing name of card issuer
    private boolean nonIntCharFound = false;

    //Full IIN List
    private String issuerArray [][] = new String [][] {{"1","34","37"},
                                               {"2","300","301","302","303","304","305"},
                                               {"3","36"},
                                               {"4","54"},
                                               {"5","6011","644","645","646","647","648","649","65","622126","622127","622128","622129","622130","622131","622132","622133","622134","622135",
                                                   "622136","622137","622138","622139","622140","622141","622142","622143","622144","622145",
                                                   "622146","622147","622148","622149","622150","622151","622152","622153","622154","622155",
                                                   "622156","622157","622158","622159","622160","622161","622162","622163","622164","622165",
                                                   "622166","622167","622168","622169","622170","622171","622172","622173","622174","622175",
                                                   "622176","622177","622178","622179","622180","622181","622182","622183","622184","622185",
                                                   "622186","622187","622188","622189","622190","622191","622192","622193","622194","622195",
                                                   "622196","622197","622198","622199","622200","622201","622202","622203","622204","622205",
                                                   "622206","622207","622208","622209","622210","622211","622212","622213","622214","622215",
                                                   "622216","622217","622218","622219","622220","622221","622222","622223","622224","622225",
                                                   "622226","622227","622228","622229","622230","622231","622232","622233","622234","622235",
                                                   "622236","622237","622238","622239","622240","622241","622242","622243","622244","622245",
                                                   "622246","622247","622248","622249","622250","622251","622252","622253","622254","622255",
                                                   "622256","622257","622258","622259","622260","622261","622262","622263","622264","622265",
                                                   "622266","622267","622268","622269","622270","622271","622272","622273","622274","622275",
                                                   "622276","622277","622278","622279","622280","622281","622282","622283","622284","622285",
                                                   "622286","622287","622288","622289","622290","622291","622292","622293","622294","622295",
                                                   "622296","622297","622298","622299","622300","622301","622302","622303","622304","622305",
                                                   "622306","622307","622308","622309","622310","622311","622312","622313","622314","622315",
                                                   "622316","622317","622318","622319","622320","622321","622322","622323","622324","622325",
                                                   "622326","622327","622328","622329","622330","622331","622332","622333","622334","622335",
                                                   "622336","622337","622338","622339","622340","622341","622342","622343","622344","622345",
                                                   "622346","622347","622348","622349","622350","622351","622352","622353","622354","622355",
                                                   "622356","622357","622358","622359","622360","622361","622362","622363","622364","622365",
                                                   "622366","622367","622368","622369","622370","622371","622372","622373","622374","622375",
                                                   "622376","622377","622378","622379","622380","622381","622382","622383","622384","622385",
                                                   "622386","622387","622388","622389","622390","622391","622392","622393","622394","622395",
                                                   "622396","622397","622398","622399","622400","622401","622402","622403","622404","622405",
                                                   "622406","622407","622408","622409","622410","622411","622412","622413","622414","622415",
                                                   "622416","622417","622418","622419","622420","622421","622422","622423","622424","622425",
                                                   "622426","622427","622428","622429","622430","622431","622432","622433","622434","622435",
                                                   "622436","622437","622438","622439","622440","622441","622442","622443","622444","622445",
                                                   "622446","622447","622448","622449","622450","622451","622452","622453","622454","622455",
                                                   "622456","622457","622458","622459","622460","622461","622462","622463","622464","622465",
                                                   "622466","622467","622468","622469","622470","622471","622472","622473","622474","622475",
                                                   "622476","622477","622478","622479","622480","622481","622482","622483","622484","622485",
                                                   "622486","622487","622488","622489","622490","622491","622492","622493","622494","622495",
                                                   "622496","622497","622498","622499","622500","622501","622502","622503","622504","622505",
                                                   "622506","622507","622508","622509","622510","622511","622512","622513","622514","622515",
                                                   "622516","622517","622518","622519","622520","622521","622522","622523","622524","622525",
                                                   "622526","622527","622528","622529","622530","622531","622532","622533","622534","622535",
                                                   "622536","622537","622538","622539","622540","622541","622542","622543","622544","622545",
                                                   "622546","622547","622548","622549","622550","622551","622552","622553","622554","622555",
                                                   "622556","622557","622558","622559","622560","622561","622562","622563","622564","622565",
                                                   "622566","622567","622568","622569","622570","622571","622572","622573","622574","622575",
                                                   "622576","622577","622578","622579","622580","622581","622582","622583","622584","622585",
                                                   "622586","622587","622588","622589","622590","622591","622592","622593","622594","622595",
                                                   "622596","622597","622598","622599","622600","622601","622602","622603","622604","622605",
                                                   "622606","622607","622608","622609","622610","622611","622612","622613","622614","622615",
                                                   "622616","622617","622618","622619","622620","622621","622622","622623","622624","622625",
                                                   "622626","622627","622628","622629","622630","622631","622632","622633","622634","622635",
                                                   "622636","622637","622638","622639","622640","622641","622642","622643","622644","622645",
                                                   "622646","622647","622648","622649","622650","622651","622652","622653","622654","622655",
                                                   "622656","622657","622658","622659","622660","622661","622662","622663","622664","622665",
                                                   "622666","622667","622668","622669","622670","622671","622672","622673","622674","622675",
                                                   "622676","622677","622678","622679","622680","622681","622682","622683","622684","622685",
                                                   "622686","622687","622688","622689","622690","622691","622692","622693","622694","622695",
                                                   "622696","622697","622698","622699","622700","622701","622702","622703","622704","622705",
                                                   "622706","622707","622708","622709","622710","622711","622712","622713","622714","622715",
                                                   "622716","622717","622718","622719","622720","622721","622722","622723","622724","622725",
                                                   "622726","622727","622728","622729","622730","622731","622732","622733","622734","622735",
                                                   "622736","622737","622738","622739","622740","622741","622742","622743","622744","622745",
                                                   "622746","622747","622748","622749","622750","622751","622752","622753","622754","622755",
                                                   "622756","622757","622758","622759","622760","622761","622762","622763","622764","622765",
                                                   "622766","622767","622768","622769","622770","622771","622772","622773","622774","622775",
                                                   "622776","622777","622778","622779","622780","622781","622782","622783","622784","622785",
                                                   "622786","622787","622788","622789","622790","622791","622792","622793","622794","622795",
                                                   "622796","622797","622798","622799","622800","622801","622802","622803","622804","622805",
                                                   "622806","622807","622808","622809","622810","622811","622812","622813","622814","622815",
                                                   "622816","622817","622818","622819","622820","622821","622822","622823","622824","622825",
                                                   "622826","622827","622828","622829","622830","622831","622832","622833","622834","622835",
                                                   "622836","622837","622838","622839","622840","622841","622842","622843","622844","622845",
                                                   "622846","622847","622848","622849","622850","622851","622852","622853","622854","622855",
                                                   "622856","622857","622858","622859","622860","622861","622862","622863","622864","622865",
                                                   "622866","622867","622868","622869","622870","622871","622872","622873","622874","622875",
                                                   "622876","622877","622878","622879","622880","622881","622882","622883","622884","622885",
                                                   "622886","622887","622888","622889","622890","622891","622892","622893","622894","622895",
                                                   "622896","622897","622898","622899","622900","622901","622902","622903","622904","622905",
                                                   "622906","622907","622908","622909","622910","622911","622912","622913","622914","622915",
                                                   "622916","622917","622918","622919","622920","622921","622922","622923","622924","622925",
                                                   },
                                                   {"6","3528","3529","3530","3531","3532","3533","3534","3535","3536","3537",
                                                       "3538","3539","3540","3541","3542","3543","3544","3545","3546","3547",
                                                       "3548","3549","3550","3551","3552","3553","3554","3555","3556","3557",
                                                       "3558","3559","3560","3561","3562","3563","3564","3565","3566","3567",
                                                       "3568","3569","3570","3571","3572","3573","3574","3575","3576","3577",
                                                       "3578","3579","3580","3581","3582","3583","3584","3585","3586","3587",
                                                       "3588","3589"},
                                                   {"7","637","638","639"},
                                                   {"8","6304","6706","6771","6709"},
                                                   {"9","5018","5020","5038","5893","6304","6759","6761","6762","6763"},
                                                   {"10","51","52","53","54","55"},
                                                   {"11","4","4026","417500","4508","4844","4913","4917"} };
    /**
     * Description: This is the constructor of the CreditCard Class
     * @param entriesArray ArrayList <String>
     * @return Nothing
     * @throws Nothing
     */
    public CreditCard (ArrayList <String> entriesArray)
    {
        super ( entriesArray ); // Send to parent Class
    }

    /**
     * Description: This is method sends the card numbers to another method to check if it is a valid creditCard number and adds to new arrays
     * @param numArray ArrayList <String>
     * @return Nothing
     * @throws Nothing
     */
    public void verifyCreditCard ( ArrayList <String> numArray )
    {
        String temp = "";
        for ( int i = 0; i < numArray.size(); i++ )
        {
            temp = numArray.get ( i );
            try
            {
                if ( this.isValidCreditCard ( temp ) )
                {
                    preValidCreditCards.add ( temp );
                }

                else
                {
                    invalidCreditCards.add ( temp );
                }
            }

            catch (NegativeCardNumberException e)
            {
                isErrorFound = true;
                message += e.getMessage() + "\n";
                invalidCreditCards.add ( temp );
            }

            catch (IllegalArgumentException e)
            {
                isErrorFound = true;
                message += e.getMessage() + "\n";
                invalidCreditCards.add ( temp );
            }

        }

        this.findCardIssuer ( preValidCreditCards ); // find the companies that issued these valid credit cards
    }

    /**
     * Description: This method implements Luhns Algorithm and checks if card number is valid
     * @param tempCreditNum int
     * @return boolean
     * @throws NegativeCardNumberException, IllegalArgumentException
     */
    private boolean isValidCreditCard ( String tempCreditNum ) throws NegativeCardNumberException, IllegalArgumentException
    {
        ArrayList <Integer> luhnsArray = new ArrayList <Integer> ();
        int sum = 0;
        int cardLength = tempCreditNum.length(); // Get the length of the credit card number. How many digits are there?

        for ( int i = cardLength - 1; i >= 0 ; i-- ) // counting downward because we want to reverse the digits for verification (Luhns Algorith)
        {
            if ( tempCreditNum.charAt (0) == '-')
            {
                isErrorFound = true;
                throw new NegativeCardNumberException ("Possible Negative Number Found! : " + tempCreditNum);

            }

            else
            {
                int temp1 = (tempCreditNum.charAt ( i ) - '0');

                if ( temp1 < 0 || temp1 > 9 )
                {
                    nonIntCharFound = true;
                    isErrorFound = true;
                    throw new IllegalArgumentException ("Illegal character found inside card number " + tempCreditNum);

                }

                else
                {
                    luhnsArray.add ( temp1 );
                }
            }

        }

        if ( nonIntCharFound )
        {
            return false;
        }

        else
        {

            for ( int i = 1; i < luhnsArray.size (); i++ ) // loop through every digit but the last ( i starts from 1 ) and multiply all odds by 2
            {
                if ( i % 2 == 0 )
                {
                    continue; // pass if number is even
                }

                else
                {
                    luhnsArray.set ( i, (luhnsArray.get ( i ) * 2) ); // multiply if number is odd
                }

            }


            for ( int m = 1; m < luhnsArray.size(); m++) // loop through every digit but the last and subtract 9 if it is greater than 9
            {

                if ( luhnsArray.get ( m ) > 9 )
                {
                    luhnsArray.set ( m, (luhnsArray.get ( m ) - 9) );
                }

            }

            for ( int p = 1; p < luhnsArray.size(); p++ ) // loop through every digit except the last and sum
            {
                sum += luhnsArray.get ( p );
            }

            if ( (sum + luhnsArray.get ( 0 ) ) % 10 == 0 ) // if sum of other digits plus the last modulo 10 has no remainders
            {
                return true;
            }

            else
            {
                return false;
            }
        }
     }

    /**
     * Description: This method checks which credit card number matches with the initials of credit card Issuers
     * @param preValidCreditCards ArrayList <Integer> type
     * @return Nothing
     * @throws Nothing
     */
    private void findCardIssuer ( ArrayList <String> preValidCreditCards )
    {
        this.sort ( preValidCreditCards ); // sort the String array. Sent by reference

        for ( int i = 0; i < preValidCreditCards.size(); i++ ) // For looping through preValidCreditCards
        {
            for ( int j = 0; j < issuerArray.length; j++ ) // For looping through rows of issuerArray
            {
                for ( int k = 1; k < issuerArray [ k ].length; k++ ) // For looping through columns of issuerArray - Starts at 1 because the 0th column holds identifier for cardIssuers
                {
                    if ( preValidCreditCards.get ( i ).startsWith (issuerArray[ j ][ k ] ) ) //check if string starts with specifc Strings in issuerArray
                    {
                        finalValidCardNumbers.add ( preValidCreditCards.get ( i ) ); // if true, assign value at cArray to finalValidCardNumbers
                        cardIssuer.add ( issuerArray[ j ][ 0 ] ); // if true, add issuerID to cardIssuer array
                        finalCardInitials.add ( issuerArray[ j ][ k ] ); // if true, add initial string to finalCardInitials
                    }
                }
            }
        }

        for ( int a = 0; a < finalValidCardNumbers.size (); a++ )
        {
            for ( int b = 0; b < preValidCreditCards.size (); b++ )
            {
                if ( finalValidCardNumbers.get ( a ) == preValidCreditCards.get ( b ) )
                {
                    //Since arrays are sent by reference and not by value...
                    preValidCreditCards.remove ( b ); // Remove the element that has an issuer company and leave intact the ones that don't.
                }
            }
        }
        this.sort ( preValidCreditCards );
        finalCardIssuer = this.getIssuerNameArray ( cardIssuer ); // Send issuerID to method to convert to IssuerName
    }

     /**
     * Description: This method matches the issuerID number to the IssuerName and returns a new array containing the issuerNames
     * @param issuerNum ArrayList <String> type
     * @return ArrayList <String> type
     * @throws Nothing
     */
    public ArrayList <String> getIssuerNameArray ( ArrayList <String> issuerNum )
    {
        ArrayList <String> editedIssuer = new ArrayList <String> (); //Declare temp ArrayList to hold the new IssuerNames

        for ( int i = 0; i < issuerNum.size(); i++ )
        {
            if ( issuerNum.get ( i ) == "1" )
            {
                editedIssuer.add ( "American Express" );
            }

            else if ( issuerNum.get ( i ) == "2" )
            {
                editedIssuer.add ( "Dinners Club - Carte Blanche" );
            }

            else if ( issuerNum.get ( i ) == "3" )
            {
                editedIssuer.add ( "Dinners Club - International" );
            }

            else if ( issuerNum.get ( i ) == "4" )
            {
                editedIssuer.add ( "Dinners Club - USA & Canada" );
            }

            else if ( issuerNum.get ( i ) == "5" )
            {
                editedIssuer.add ( "Discover" );
            }

            else if ( issuerNum.get ( i ) == "6" )
            {
                editedIssuer.add ( "InstaPayment" );
            }

            else if ( issuerNum.get ( i ) == "7" )
            {
                editedIssuer.add ( "JCB" );
            }

            else if ( issuerNum.get ( i ) == "8" )
            {
                editedIssuer.add ( "Laser" );
            }

            else if ( issuerNum.get ( i ) == "9" )
            {
                editedIssuer.add ( "Maestro" );
            }

            else if ( issuerNum.get ( i ) == "10" )
            {
                editedIssuer.add ( "MasterCard" );
            }

            else if ( issuerNum.get ( i ) == "11" )
            {
                editedIssuer.add ( "Visa/Visa Electron" );
            }
        }

        return editedIssuer;
    }

    /**
     * Description: This is method loops through the String array, sends the String element to another method to get the sum of the ascii
     *              characters and sorts the strings accordingly
     * @param array a String [] array
     * @return Nothing
     * @throws Nothing
     */
    public void sort ( ArrayList <String> array )
    {
        String temp = "";
        //Loop through and sort the array by length of digits
        for ( int i = 0; i < array.size (); i++ )
        {
            for ( int j = i + 1; j < array.size (); j++ )
            {
                if (array.get ( i ).length()  > array.get ( j ).length() )
                {
                    temp = array.get ( j );
                    array.set(j,array.get ( i ));
                    array.set(i, temp );
                }
            }
        }

        //loop through and sort the array by sume of their ascii characters
        for ( int i = 0; i < array.size (); i++ )
        {
            for ( int j = i + 1; j < array.size (); j++ )
            {
                if (getSumOfAsciiChars (array.get ( i ) ) > getSumOfAsciiChars (array.get ( j )) )
                {
                    temp = array.get ( j );
                    array.set(j,array.get ( i ));
                    array.set(i, temp );
                }
            }
        }

        //loop through and sort the array by initial digits
        for ( int i = 0; i < array.size (); i++ )
        {
            for ( int j = i + 1; j < array.size (); j++ )
            {
                if ( array.get ( i ).length()  == array.get ( j ).length() )
                {
                    int temp1 = Character.getNumericValue ( array.get (i).charAt(0) );
                    int temp2 = Character.getNumericValue ( array.get (j).charAt(0) );
                    if (Math.max(temp1, temp2 ) == temp1)
                    {
                        temp = array.get ( j );
                        array.set(j,array.get ( i ));
                        array.set(i, temp );
                    }
                }
            }
        }

        // loop through and sort the array if 1st digit are the same loop until same position different number are found and sort
        for ( int i = 0; i < array.size (); i++ )
        {
            for ( int j = i + 1; j < array.size (); j++ )
            {
                if ( ((array.get ( i ).charAt (0) ) ==  (array.get ( j ).charAt (0)  ) ) && (array.get (i).length() == array.get(j).length() ))
                {
                    boolean repeat = true;
                    int n = 1;
                    while ( n < array.get ( i ).length() && repeat )
                    {

                            if ( (array.get ( i ).charAt (n) ) >  (array.get ( j ).charAt (n)  ) )
                            {
                                temp = array.get ( j );
                                array.set(j,array.get ( i ));
                                array.set(i, temp );

                                repeat = false;
                            }

                            if ( (array.get ( i ).charAt (n) ) <  (array.get ( j ).charAt (n)  ) )
                            {
                                repeat = false;
                            }

                            else if ( array.get ( i ).charAt (0)  ==  (array.get ( j ).charAt (0) ) )
                            {
                                repeat = true;
                            }


                        n += 1;
                    }
                }
            }
        }


    }

    /**
     * Description: This is method converts the strings to characters, sums the value of ascii characters and returns the sum
     * @param validCardNumber String type
     * @return int
     * @throws Nothing
     */
    public int getSumOfAsciiChars ( String validCardNumber )
    {
        char [] characters = {};
        int sum = 0;
        characters = validCardNumber.toCharArray();
        for ( int i = 0; i < characters.length; i++ )
        {
            sum += characters[i];
        }

        return sum;
    }
}
