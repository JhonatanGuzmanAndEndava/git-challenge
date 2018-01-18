package team1.back.persistence;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class DBConnection {

    private static MongoClient instance = null;

    private DBConnection(){

    }

    public static MongoClient getClient(){
        if(instance == null){
            Properties prop = new Properties();
            try (InputStream input = DBConnection.class.getResourceAsStream("/db.properties")){
                prop.load(input);
                MongoClientURI connectionString = new MongoClientURI(prop.getProperty("url")) ;
                instance = new MongoClient(connectionString);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return instance;
    }
}
