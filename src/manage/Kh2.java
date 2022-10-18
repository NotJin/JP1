package manage;
import java.util.Date;

public class Kh2 extends  client{
    public String country;

    public Kh2(String code, String fullName, String invoiceDate, Integer qty, String country) {
        super(code, fullName, invoiceDate, qty);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public double calculateMoney() {
        return super.calculateMoney();
    }
}
