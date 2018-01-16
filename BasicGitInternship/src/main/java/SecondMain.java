import Impl.UserConfiguration;

import java.util.Map;

/**
 * Created by mahernandez on 1/11/2018.
 */
public class SecondMain {

    private static UserConfiguration userConfiguration = new UserConfiguration();

    public static void main(String[] args) {

        Map<String, String> usersReturned = userConfiguration.createUser();
        System.out.println("ID" + "\t\t\t\t\t" + "Name");
        System.out.println("-----------------------------------------------");

        for (String name: usersReturned.keySet()){

            String key =name.toString();
            String value = usersReturned.get(name).toString();
            System.out.println(key + "\t\t\t" + value);
        }
    }
}
