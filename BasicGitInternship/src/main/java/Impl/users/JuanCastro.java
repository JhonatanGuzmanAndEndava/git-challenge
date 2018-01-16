package Impl.users;

/**
 * Created by rfandino on 1/15/2018.
 */
public class JuanCastro {
    String id = "1070618993";
    String name = "Juan Alberto";
    String lastName = "Castro Espinosa";

    public JuanCastro() {
    }

    public String getId() {
        return id;
    }

    public String getFullName(){
        return name +" "+ lastName;
    }
}
