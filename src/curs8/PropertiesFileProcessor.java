package curs8;

import java.io.*;
import java.util.Properties;

public class PropertiesFileProcessor {

    public void writePropertiesFile() throws IOException {
        try {
            //canal de comunicare prin care transmitem datele,se creaza un fisier la noi pe disc
            OutputStream output = new FileOutputStream("test.properties");

            Properties file = new Properties();
            file.setProperty("user", "admin");
            file.setProperty("pass", "admin123");

            //salveaza si transmite datele catre fisierul creat la linia 14
            file.store(output, "Am salvat properties file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readPropertiesFile(String key) throws IOException {
        try {
            InputStream input = new FileInputStream("test.properties");

            Properties file = new Properties();
            file.load(input);
            System.out.println(file.getProperty(key));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
