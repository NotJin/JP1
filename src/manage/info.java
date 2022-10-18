package manage;
import java.util.Date;

public class info extends  client{
    private String nationality;

    public info(){

    }

    public info (int maxKH, String name, Date date, String nationality, Double KW, Double total){
        super(maxKH,name,date,KW,total);
        this.nationality = nationality;
    }

    public Double tinhTien(){
        double a = getKW() * 2000;
        setTotal(a);
        return getTotal();
    }
}
