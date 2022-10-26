package assignment5;

public class Contact {
    private String name;
    private String email;
    private String address;
    private String phone;

    public Contact(String name, String email, String address, String phone) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public String toString() {
        return this.name+"--"+this.email+"--"+this.address+"--"+this.phone;
    }
}
