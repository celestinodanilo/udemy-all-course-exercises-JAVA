package entities;

import java.sql.PreparedStatement;

public class estudante {
    public static String nome;
    public static  double nota1;
    public static  double nota3;
    public static  double nota2;

    public static double notafinal(){
        return nota1 + nota2 + nota3;
    }
    public static String aprovado(){
        if (notafinal()>=60.00){
            return "Aprovado";
        }
        else{
            return "reprovado";
        }
    }


}
