package session1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Student s = new Student();
        s.name = "Nam";
        s.age = 18;

        Student s2 = new Student();
        s2.age = 21;

        s.showInfo();
        s2.showInfo();

        Scanner sc = new Scanner(System.in);

        B1 j = new B1();
        System.out.println("Nhap canh 1:");
        j.a = sc.nextInt();
        System.out.println("Nhap canh 2:");
        j.b = sc.nextInt();
        System.out.println("Nhap canh 3:");
        j.c = sc.nextInt();

        System.out.println("Chu vi: "+j.chuVi());
        System.out.println("Dien tich: "+j.dienTich());

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
