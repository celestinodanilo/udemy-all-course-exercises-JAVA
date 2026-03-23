package entities;

public class Dadospessoasclass {
    private double altura;
    private char genero;

    public Dadospessoasclass(double altura, char genero){
        this.altura = altura;
        this.genero = genero;

    }

    public double getAltura() {
        return altura;
    }

    public char getGenero() {
        return genero;
    }
}
