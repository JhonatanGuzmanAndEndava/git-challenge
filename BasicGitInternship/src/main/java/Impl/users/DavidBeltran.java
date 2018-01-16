package Impl.users;

/**
 * Created by dbeltran on 1/16/2018.
 */
public class DavidBeltran {
    String id = "1013649582";
    String name = "David Eduardo";
    String lastName = "Beltrán Cifuentes";

    public DavidBeltran() {
    }

    public String getId() {
        return id;
    }

    public String getFullName(){
        return name +" "+ lastName;
    }
}
