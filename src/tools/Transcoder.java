package tools;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.function.ToBooleanBiFunction;
import org.germain.tool.ManaBox;
import java.util.Hashtable;

public class Transcoder {
    



    public String encode(String msg){

        // méthode qui prend une string et qui renvoie
        // une string codée
        int i;
        String trame = "";
        Hashtable<Character, String> clefcode = new Hashtable();

        clefcode.put('C'  ,  "AA");
        clefcode.put('G'  ,  "AB");
        clefcode.put('U'  ,  "AC");
        clefcode.put('c'  ,  "AD");
        clefcode.put('F'  ,  "AE");
        clefcode.put('P'  ,  "AF");
        clefcode.put(' '  ,  "AG");
        clefcode.put('f'  ,  "AH");
        clefcode.put('Z'  ,  "AI");
        clefcode.put('I'  ,  "AJ");
        clefcode.put('r'  ,  "AK");
        clefcode.put('g'  ,  "AL");
        clefcode.put('Q'  ,  "AM");
        clefcode.put('k'  ,  "AN");
        clefcode.put('M'  ,  "AO");
        clefcode.put('i'  ,  "AP");
        clefcode.put('o'  ,  "AQ");
        clefcode.put('A'  ,  "AR");
        clefcode.put('E'  ,  "AS");
        clefcode.put('w'  ,  "AT");
        clefcode.put('p'  ,  "AU");
        clefcode.put('X'  ,  "AV");
        clefcode.put('l'  ,  "AW");
        clefcode.put('W'  ,  "AX");
        clefcode.put('T'  ,  "AY");
        clefcode.put('.'  ,  "AZ");
        clefcode.put('v'  ,  "BA");
        clefcode.put('x'  ,  "BB");
        clefcode.put('a'  ,  "BC");
        clefcode.put('R'  ,  "BD");
        clefcode.put('b'  ,  "BE");
        clefcode.put('D'  ,  "BF");
        clefcode.put('Y'  ,  "BG");
        clefcode.put('q'  ,  "BH");
        clefcode.put('z'  ,  "BI");
        clefcode.put('V'  ,  "BJ");
        clefcode.put('h'  ,  "BK");
        clefcode.put('y'  ,  "BL");
        clefcode.put('m'  ,  "BM");
        clefcode.put('L'  ,  "BN");
        clefcode.put('S'  ,  "BO");
        clefcode.put('t'  ,  "BP");
        clefcode.put('d'  ,  "BQ");
        clefcode.put(':'  ,  "BR");
        clefcode.put('n'  ,  "BS");
        clefcode.put('N'  ,  "BT");
        clefcode.put('e'  ,  "BU");
        clefcode.put('K'  ,  "BV");
        clefcode.put('J'  ,  "BW");
        clefcode.put('H'  ,  "BX");
        clefcode.put('!'  ,  "BY");
        clefcode.put('O'  ,  "BZ");
        clefcode.put('j'  ,  "CA");
        clefcode.put('B'  ,  "CB");
        clefcode.put(','  ,  "CC");
        clefcode.put('s'  ,  "CD");
        clefcode.put('u'  ,  "CE");
        clefcode.put('\'' ,  "CF");

        for (i = 0; i < msg.length(); i++) {

            trame = trame + clefcode.get(msg.substring(i, i+1));
            }

        return trame;

    }
    
    public String decode(String trame){
        // méthode qui prend une string codée et qui renvoie
        // une string décodée
        int i;
        String msg = "";
        Hashtable<String, Character> clefcode = new Hashtable();

        clefcode.put("AA" ,	'C');
        clefcode.put("AB" ,	'G');
        clefcode.put("AC" ,	'U');
        clefcode.put("AD" ,	'c');
        clefcode.put("AE" ,	'F');
        clefcode.put("AF" ,	'P');
        clefcode.put("AG" , ' ');
        clefcode.put("AH" ,	'f');
        clefcode.put("AI" ,	'Z');
        clefcode.put("AJ" ,	'I');
        clefcode.put("AK" ,	'r');
        clefcode.put("AL" ,	'g');
        clefcode.put("AM" ,	'Q');
        clefcode.put("AN" ,	'k');
        clefcode.put("AO" ,	'M');
        clefcode.put("AP" ,	'i');
        clefcode.put("AQ" ,	'o');
        clefcode.put("AR" ,	'A');
        clefcode.put("AS" ,	'E');
        clefcode.put("AT" ,	'w');
        clefcode.put("AU" ,	'p');
        clefcode.put("AV" ,	'X');
        clefcode.put("AW" ,	'l');
        clefcode.put("AX" ,	'W');
        clefcode.put("AY" ,	'T');
        clefcode.put("AZ" ,	'.');
        clefcode.put("BA" ,	'v');
        clefcode.put("BB" ,	'x');
        clefcode.put("BC" ,	'a');
        clefcode.put("BD" ,	'R');
        clefcode.put("BE" ,	'b');
        clefcode.put("BF" ,	'D');
        clefcode.put("BG" ,	'Y');
        clefcode.put("BH" ,	'q');
        clefcode.put("BI" ,	'z');
        clefcode.put("BJ" ,	'V');
        clefcode.put("BK" ,	'h');
        clefcode.put("BL" ,	'y');
        clefcode.put("BM" ,	'm');
        clefcode.put("BN" ,	'L');
        clefcode.put("BO" ,	'S');
        clefcode.put("BP" ,	't');
        clefcode.put("BQ" ,	'd');
        clefcode.put("BR" ,	':');
        clefcode.put("BS" ,	'n');
        clefcode.put("BT" ,	'N');
        clefcode.put("BU" ,	'e');
        clefcode.put("BV" ,	'K');
        clefcode.put("BW" ,	'J');
        clefcode.put("BX" ,	'H');
        clefcode.put("BY" ,	'!');
        clefcode.put("BZ" ,	'O');
        clefcode.put("CA" ,	'j');
        clefcode.put("CB" ,	'B');
        clefcode.put("CC" ,	',');
        clefcode.put("CD" ,	's');
        clefcode.put("CE" ,	'u');
        clefcode.put("CF" ,	'\'');

        for (i = 0; i < trame.length(); i=i+2) {

            msg = msg + clefcode.get(trame.substring(i, i+2));
        }

        return msg;
    }







}
