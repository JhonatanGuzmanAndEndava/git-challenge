package Impl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lsepulveda on 1/11/2018.
 */
public class UserConfiguration {

    public Map<String, String> createUser() {
        Map<String, String> users = new HashMap<String, String>();

        users.put("1053781223" , "Luisa Sepúlveda");
        users.put("1098326512" , "Raúl Fandiño");

        //Add the new users here ...

        return users;
    }
}
