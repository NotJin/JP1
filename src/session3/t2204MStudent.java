package session3;

import session2.FptStudent;

public class t2204MStudent extends FptStudent{
    public String address;

    public t2204MStudent(){}

    public t2204MStudent(String code, String name, String tel, String address) {
        super(code, name, tel);
        this.address = address;
    }

    @Override
    public void run(int x){
        super.run();
        System.out.println("50km/h");
    }
}
