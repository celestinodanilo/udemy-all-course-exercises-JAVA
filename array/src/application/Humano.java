package application;
import entities.Pessoas;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class Humano {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        Pessoas[] vect = new Pessoas[n];
        for (int i = 0; i<n; i++){
            sc.nextLine();
            String nome = sc.nextLine();
            int idade = sc.nextInt();
            double altura = sc.nextDouble();
            vect[i] = new Pessoas(nome, idade, altura);
        }
        double soma = 0;
        for (int i = 0; i < n; i++){
            soma += vect[i].getAltura();
        }
        double media = soma / n;

        int menores = 0;

        for (int i = 0; i < n; i++){
            if (vect[i].getIdade() < 16){
                menores++;
            }
        }
        double porcentagem = (menores * 100.0)/ n;
        System.out.println("Altura media = " + media);
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem+"%");
        for (int i = 0; i < n; i++){
            if (vect[i].getIdade() < 16){
                System.out.println(vect[i].getNome());
            }
        }
    }
}