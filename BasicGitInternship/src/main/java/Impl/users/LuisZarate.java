package Impl.users;

public class LuisZarate {
    String name = "Luis David";
    String lastName = "Zarate Castillo";
    String id = "1014282537";
    public LuisZarate() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName(){
        return name +" "+ lastName;
    }
}
