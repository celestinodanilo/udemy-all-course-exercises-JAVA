package application;
import  java.util.Locale;
import java.util.Scanner;
import entities.estudante;

import static entities.estudante.aprovado;
import static entities.estudante.notafinal;


public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome: ");
        estudante.nome = sc.nextLine();

        System.out.println("Qual a sua primeira nota: ");
        estudante.nota1 = sc.nextDouble();

        System.out.println("Qual a sua segunda nota: ");
        estudante.nota2 = sc.nextDouble();

        System.out.println("Qual a sua terceira nota: ");
        estudante.nota3 = sc.nextDouble();

        System.out.println("Nota final = " + notafinal());
        System.out.println(aprovado());












        }
    }
