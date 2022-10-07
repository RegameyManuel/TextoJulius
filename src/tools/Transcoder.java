package tools;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.function.ToBooleanBiFunction;
import org.germain.tool.ManaBox;
import java.util.Hashtable;

public class Transcoder {

    private Hashtable<Character, String> clefencode = new Hashtable();
    private Hashtable<String, Character> clefdecode = new Hashtable();

    public Transcoder (String clef)
    {
        Integer i, dig1, dig2;

        String digit;



        for (i=0; i<clef.length(); i++)
        {
            dig1 = (i%26) + 65;
            dig2 = (i/26) + 65;
            digit = Character.toString(dig2) + Character.toString(dig1);

            clefencode.put(clef.charAt(i) , digit);
            clefdecode.put(digit , clef.charAt(i));

        }
    }

    public String encode(String msg ){

        // méthode qui prend une string et qui renvoie
        // une string codée
        Integer i;
        String trame ="";


        for (i = 0; i < msg.length(); i++) {

            trame = trame + clefencode.get(msg.charAt(i));
            }

        return trame;

    }
    
    public String decode(String trame){

        // méthode qui prend une string codée et qui renvoie
        // une string décodée
        int i;
        String msg = "";

        for (i = 0; i < trame.length(); i=i+2) {

            msg = msg + clefdecode.get(trame.substring(i, i+2));

        }

        return msg;
    }


}
