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
        users.put("1070618993" , "Juan Castro");
        users.put("451191" , "Alejandra Chacón");
        users.put("1014282537" , "Luis Zarate");
		//Add the new users here ...


        return users;
    }
}
