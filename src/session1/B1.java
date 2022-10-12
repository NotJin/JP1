package session1;

public class B1 {
    int a;
    int b;
    int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int chuVi(){
        return a+b+c;
    }
    public double dienTich(){
        double p;
        p = (double)chuVi()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
