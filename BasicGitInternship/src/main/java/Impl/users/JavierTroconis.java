package Impl.users;

/**
 * Created by rfandino on 1/15/2018.
 */
public class JavierTroconis {
    String id = "502736";
    String name = "Javier Antonio";
    String lastName = "Troconis Guia";

    public JavierTroconis() {
    }

    public String getId() {
        return id;
    }

    public String getFullName(){
        return name +" "+ lastName;
    }
}
