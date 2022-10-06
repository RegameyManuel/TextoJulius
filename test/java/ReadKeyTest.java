package Tools;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.germain.tool.ManaBox;
import Tools.

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
        String testGermain = "6lUjKOzUj4e/Gelw9c6sDLqHniwulClN6XSayZ+HRF/kbZx+CMf95jxrhm4YFSY26OnxVlsrzGkO00IMeAFs3g==";
        TransCoder transcodeTest = new TransCoder(testGermain);
        Assert.assertNotNull(transcodeTest.encode());
        System.out.println(transcodeTest.encode().toString());
        Assert.assertNotNull(transcodeTest.decode());
        System.out.println(transcodeTest.decode().toString());
    }

}