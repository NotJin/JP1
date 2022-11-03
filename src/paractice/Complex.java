package paractice;

import java.util.Scanner;

public class Complex {
    private double x;
    private double y;

    //Ham tao khong doi so
    public Complex(){
        x = 0;
        y = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //Ham khoi tao co doi so
    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Ham so phuc
    public void nhap(Scanner sc){
        System.out.println("Nhap so phuc: ");
        x = sc.nextDouble();
        System.out.println("Nhap so ao: ");
        y = sc.nextDouble();
    }

    //Ham hien thi so phuc
    public void print(){
        if (y < 0){
            System.out.println(x + "-" + Math.abs(y) + "*i");
        }else {
            System.out.println(x + "+" + y + "*i");
        }
    }

    //Ham cong so phuc
    public Complex addComplex(Complex c2){
        double re = x + c2.x;
        double im = y + c2.y;
        return new Complex(re,im);
    }

    //Ham tru so phuc
    public Complex subComplex(Complex c2){
        double re = x - c2.x;
        double im = y - c2.y;
        return new Complex(re,im);
    }

    //Ham nhan so phuc
    public Complex mulComplex(Complex c2){
        double re = x * c2.x - y * c2.y;
        double im = x * c2.y + c2.x * y;
        return new Complex(re,im);
    }

    //Ham chia so phuc
    public Complex divComplex(Complex c2){
        double re = (x * c2.x + y * c2.y) / (c2.x * c2.x + c2.y * c2.y);
        double im = (c2.x * y - x * c2.y) / (c2.x * c2.x + c2.y * c2.y);
        return new Complex(re,im);
    }

    @Override
    public String toString() {
        return "Complex{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
