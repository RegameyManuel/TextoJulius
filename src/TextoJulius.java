import org.apache.commons.lang3.StringUtils;
import org.germain.tool.ManaBox;
import tools.Transcoder;

public class TextoJulius {
    public static void main(String[] args)
    {


        String str = "Hello world! ça färte bànâbè?";
        String  crypte, decrypte;

        str = StringUtils.stripAccents(str);

        System.out.println("Voici une chaîne : " + str);

        crypte = ManaBox.encrypt(str);

        System.out.println("Chaîne cryptée : " + crypte);

        decrypte = ManaBox.decrypt(crypte);

        System.out.println("Chaîne décryptée : " + decrypte);
        /*ReadKeyTest;*/







    }

}