package myapp.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
//this class is used for reading configuration.properties file
    private static Properties properties;

    //Static block is used for prerequest
    static {
        String path="configuration.properties";
        FileInputStream fileInputStream= null;
        try {
            fileInputStream = new FileInputStream(path);
            properties =new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    //this method accest KEY returs VALUE Eg:config.Reader.getproperty(amazon url)
    public static String getPropert(String key){
        String value=properties.getProperty(key);
        return value;

    }
    }

