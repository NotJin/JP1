package session2;

public class FptStudent {
    String code;
    String name;
    String tel;
    public FptStudent(){
        System.out.println("Halo");
    }
    public FptStudent(String msg){
        System.out.println("Halo"+ msg);
    }
    public FptStudent(String code,String name,String tel){
        this.code = code;
        this.name = name;
        this.tel = tel;
    }
}
