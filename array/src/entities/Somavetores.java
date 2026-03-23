package entities;

public class Somavetores {
    private int a;
    private int b;
    private int c;

    public Somavetores(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void somavetoresc(int c) {
        this.c= c;
    }

    public int c (){
        return a+b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
