package Impl.users;

/**
 * Created by rfandino on 1/15/2018.
 */
public class RaulFandino {
    String id = "1098326512";
    String name = "Raúl Fernando";
    String lastName = "Fandiño Olaya";

    public RaulFandino() {
    }

    public String getId() {
        return id;
    }

    public String getFullName(){
        return name +" "+ lastName;
    }
}
