package assignment7;

public class Contact {
    private String name;
    private String email;
    private String mark;

    public Contact(String name, String email, String mark) {
        this.name = name;
        this.email = email;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name+"--"+this.email+"--"+this.mark;
    }
}
