package Model;

import org.apache.commons.lang3.StringUtils;
import org.germain.tool.ManaBox;
import tools.Transcoder;

import java.nio.file.Path;
import java.util.List;

public class Message {

    boolean encoded;
    List<String> msgClear;
    List<String> msgEncodded;
    Path msgClearPath;
    Path msgEncodedPath;
    Path keyPath;
    String key;
    Transcoder transcoder;



}
