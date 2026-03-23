package application;
import entities.Aprovadosclass;
import entities.Mediaparesfinal;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class Aprovados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Aprovadosclass[] vect = new Aprovadosclass[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();

            vect[i] = new Aprovadosclass(nome, nota1, nota2);
        }

        for (int i = 0; i<n; i++){
            if(vect[i].mediaaluno() > 6.0) {
                System.out.println(vect[i].getNome());
            }
        }

    }
}