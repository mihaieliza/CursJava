package curs8;

import java.io.IOException;

public class TestPropertiesFile {

    public static void main(String[] args) throws IOException {
        PropertiesFileProcessor propertiesFileProcessor = new PropertiesFileProcessor();
        propertiesFileProcessor.writePropertiesFile();
        propertiesFileProcessor.readPropertiesFile("user");
    }
}
