package Impl.users;

/**
 * Created by rfandino on 1/15/2018.
 */
public class LuisaSepulveda {
    String id = "1053781223";
    String name = "Luisa Fernanda";
    String lastName = "Sepulveda Osorio";

    public LuisaSepulveda() {
    }

    public String getId() {
        return id;
    }

    public String getFullName(){
        return name +" "+ lastName;
    }
}
