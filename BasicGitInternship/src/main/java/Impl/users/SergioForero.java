package Impl.users;

public class SergioForero {
    String id = "1018496665";
    String name = "Sergio";
    String lastName = "Forero Gomez";

    public SergioForero() {
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return name + " " + lastName;
    }
}
