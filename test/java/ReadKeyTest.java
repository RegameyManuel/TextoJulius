package Tools;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.germain.tool.ManaBox;
import tools.Transcoder;

public class ReadKeyTest {
    @Test
    public void readKeyTest() {
        // La clé cryptée donnée plus haut
        String keyCrypted = "6Qe0IsEEH1utWRe7UKzGMiDTytOB3HS1dEfIB4imna3IRHXHRn5ZrvKFEcPjmPgKYGuytG+gDAl1m2DdHalJQg==";
        // La clé décryptée que nous devrions obtenir
        String keyDecrypted = "CFfrkowl.aDzyS:eHjsGPZgMApWvRYVmtnK!BuU IQiEXTxbqhLdNJO,'c";
        // le test d'égalité entre la clé attendue et la sortie de la méthode de la librairie. Si le décryptage ne fonctionne pas nous aurons le message définit ici
        Assertions.assertEquals(keyDecrypted,ManaBox.decrypt(keyCrypted), "La librairie de décryptage est mal installée");

    }

    @Test
    public void createMapTest() {

        String testGermain = "CFfrkowl.aDzyS:eHjsGPZgMApWvRYVmtnK!BuU IQiEXTxbqhLdNJO,'c";
        Transcoder transcodeTest = new Transcoder(testGermain);
        Assertions.assertNotNull(transcodeTest.encode("Les tests sont la pour essayer !!!"));
        System.out.println(transcodeTest.encode("Les tests sont la pour essayer !!!"));
        Assertions.assertNotNull(transcodeTest.decode("BYAPASBNBGAPASBGASBNASAFBHBGBNAHAJBNAZAFBLADBNAPASASAJAMAPADBNBJBJBJ"));
        System.out.println(transcodeTest.decode("BYAPASBNBGAPASBGASBNASAFBHBGBNAHAJBNAZAFBLADBNAPASASAJAMAPADBNBJBJBJ"));
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Comparons : ");
        System.out.println("BYAPASBNBGAPASBGASBNASAFBHBGBNAHAJBNAZAFBLADBNAPASASAJAMAPADBNBJBJBJ");
        System.out.println(transcodeTest.encode(transcodeTest.decode("BYAPASBNBGAPASBGASBNASAFBHBGBNAHAJBNAZAFBLADBNAPASASAJAMAPADBNBJBJBJ")));
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Comparons : ");
        System.out.println("Les tests sont la pour essayer !!!");
        System.out.println(transcodeTest.decode(transcodeTest.encode("Les tests sont la pour essayer !!!")));


    }

}