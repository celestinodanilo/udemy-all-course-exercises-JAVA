package application;
import entities.Somavetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        Somavetores[] vect = new Somavetores[x];

        int[] A = new int[x];

        for (int i = 0; i < x; i++){
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < x; i++){
            int b = sc.nextInt();
            vect[i] = new Somavetores(A[i], b);
        }
        for (int i = 0; i<x; i++){
            System.out.println(vect[i].c());
        }

    }
}