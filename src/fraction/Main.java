package fraction;

public class Main {
    public static void main(String[] args) {
        Fraction f = new Fraction();
        f.mauSo = 4;
        f.tuSo = 2;

        System.out.println("Phan so vua nhap la:");
        f.display();
        System.out.println("Phan so rut gon la:");
        f.reduce();
        System.out.println("Phan so nghich dao la:");
        f.inverse();
    }
}
