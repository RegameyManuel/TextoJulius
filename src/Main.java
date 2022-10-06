import org.germain.tool.ManaBox;

public class Main {
    public static void main(String[] args)
    {
        String str = "Hello world!";
        String crypte, decrypte;
        System.out.println("Voici une chaîne : " + str);

        crypte = ManaBox.encrypt(str);

        System.out.println("Chaîne crytée : " + crypte);

        decrypte = ManaBox.decrypt(crypte);

        System.out.println("Chaîne décrytée : " + decrypte);


    }
}