package Model;

import org.apache.commons.lang3.StringUtils;
import org.germain.tool.ManaBox;
import tools.Transcoder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Message {
    private boolean encoded = false;
    private List<String> msgClear;
    public List<String> msgEncodded;
    private Path msgClearPath;
    private Path msgEncodedPath;
    private Path keyPath;
    private String key;
    private Transcoder transcoder;

    public Message(Boolean encoded, Path msgClearPath, Path msgEncodedPath, Path keyPath) throws IOException {

        this.encoded = encoded;
        this.msgClearPath = msgClearPath;
        this.msgEncodedPath = msgEncodedPath;
        this.keyPath = keyPath;

        String msg ="";
        String ligne ="";
        int i;

        try  /* on tente d'acceder à la clef de cryptage */
        {
            this.key = Files.readString(keyPath);
        }catch(FileNotFoundException ex) {
            System.err.print("ERREUR: Ouverture du fichier contenant la clef de cryptage impossible:\n");
        }

        this.transcoder = new Transcoder(key);

        if (this.encoded)
            {
                try  /* on tente d'acceder au message crypté */
                {
                    msg = Files.readString(msgEncodedPath);
                }catch(FileNotFoundException ex) {
                    System.err.print("ERREUR: Ouverture du fichier contenant le message crypté impossible:\n");
                }

                for (i = 0; i < msg.length(); i++) {
                    if ((msg.charAt(i) != '\n') || (msg.charAt(i) != '\r')) {
                        ligne = ligne + msg.charAt(i);
                    } else {
                        this.msgEncodded.add(ligne);
                    }
                }
            }
        else
            {
                try  /* on tente d'acceder au message en clair */
                {
                    msg = Files.readString(msgClearPath);
                }catch(FileNotFoundException ex) {
                    System.err.print("ERREUR: Ouverture du fichier contenant le message en clair impossible:\n");
                }
                for (i = 0; i < msg.length(); i++)
                {
                    if ((msg.charAt(i) != '\n') || (msg.charAt(i) != '\r'))
                    {
                        ligne = ligne + msg.charAt(i);
                    }
                    else
                    {
                        this.msgClear.add(ligne);
                    }
                }
            }
        }

    public void readNwrite() {
        int i;
        if (this.encoded)
        {
        /*
            For(String ligne : msgEncodded)
            {

            }
        */
            for (i = 0; i < this.msgEncodded.size() ; i++ )
            {
                blablabla
            }
            System.out.println(this.transcoder.decode("BYAPASBNBGAPASBGASBNASAFBHBGBNAHAJBNAZAFBLADBNAPASASAJAMAPADBNBJBJBJ"));
            encoded = false;
        }
        else
        {
            System.out.println(this.transcoder.encode("BYAPASBNBGAPASBGASBNASAFBHBGBNAHAJBNAZAFBLADBNAPASASAJAMAPADBNBJBJBJ"));
            encoded = true;
        }
    }


}
