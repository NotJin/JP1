package paractice;

import paractice.Complex;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Complex cp1 = new Complex();
        Complex cp2 = new Complex();
        Complex add = new Complex();
        Complex sub = new Complex();
        Complex mul = new Complex();
        Complex div = new Complex();

        //Nhap
        System.out.println("Nhap so phuc 1: ");
        cp1.nhap(sc);
        System.out.println("Nhap so phuc 2: ");
        cp2.nhap(sc);

        //Print
        System.out.println("So phuc 1: ");
        cp1.print();
        System.out.println("So phuc 2: ");
        cp2.print();


        add = cp1.addComplex(cp2);
        sub = cp1.subComplex(cp2);
        mul = cp1.mulComplex(cp2);
        div = cp1.divComplex(cp2);

        //Print
        System.out.println("Ket qua phep cong: ");
        add.print();
        System.out.println("Ket qua phep tru: ");
        sub.print();
        System.out.println("Ket qua phep nhan: ");
        mul.print();
        System.out.println("Ket qua phep chia: ");
        div.print();
    }
}
