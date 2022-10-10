import org.apache.commons.lang3.StringUtils;
import org.germain.tool.ManaBox;

public class Main {
    public static void main(String[] args)
    {

        String  crypte, decrypte, str ="";

        str = StringUtils.stripAccents(str);

        affiche_menu();

        System.out.println("Voici une chaîne : " + str);

        crypte = ManaBox.encrypt(str);

        System.out.println("Chaîne cryptée : " + crypte);

        decrypte = ManaBox.decrypt(crypte);

        System.out.println("Chaîne décryptée : " + decrypte);
        /*ReadKeyTest;*/

    }

    public static void affiche_menu()
    {

        /*
        Rendu à obtenir
        ╔══════════════════════════════════════╗
        ║   System d'encodage et de décodage   ║
        ║             de messages              ║
        ╠══════════════════════════════════════╣
        ║       1) Décoder un message          ║
        ║       2) Encode un message           ║
        ║       3) Quitter                     ║
        ╚══════════════════════════════════════╝

        ╔ = begin_open  = 9556
        ═ = ligne       = 9552
        ╗ = begin_close = 9559
        ║ = bar         = 9553
        ╣ = sep_close   = 9571
        ╠ = sep_open    = 9568
        ╝ = end_close   = 9565
        ╚ = end_open    = 9562
          = blanc       = 32

        */

        int begin_open  = 9556;
        int begin_close = 9559;
        int sep_open    = 9568;
        int sep_close   = 9571;
        int end_open    = 9562;
        int end_close   = 9565;
        int ligne    = 9552;
        int blanc  = 32;
        int bar = 9553;
        int i
                ;
        String fill_blanc = "", fill_ligne = "", affiche;

        for (i=0; i<3 ; i++)
        {
            fill_blanc = fill_blanc + (char)blanc;
        }

        for (i=0; i<38 ; i++)
        {
            fill_ligne = fill_ligne + (char)ligne;
        }

        affiche = (char)begin_open + fill_ligne + (char)begin_close;
        System.out.println(affiche);
        affiche = (char)bar + fill_blanc + "System d'encodage et de décodage" + fill_blanc + (char)bar;
        System.out.println(affiche);
        affiche = (char)bar + fill_blanc + "          de messages           " + fill_blanc + (char)bar;
        System.out.println(affiche);
        affiche = (char)sep_open + fill_ligne + (char)sep_close;
        System.out.println(affiche);
        affiche = (char)bar + fill_blanc + "    1) Décoder un message       " + fill_blanc + (char)bar;
        System.out.println(affiche);
        affiche = (char)bar + fill_blanc + "    2) Encode un message        " + fill_blanc + (char)bar;
        System.out.println(affiche);
        affiche = (char)bar + fill_blanc + "    3) Quitter                  " + fill_blanc + (char)bar;
        System.out.println(affiche);
        affiche = (char)end_open + fill_ligne + (char)end_close;
        System.out.println(affiche);
    }

}