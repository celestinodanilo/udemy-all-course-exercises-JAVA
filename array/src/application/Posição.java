package application;
import entities.Posições;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class Posição {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Posições[] vect = new Posições[n];

        for (int i = 0; i<n; i++){
            double altura = sc.nextDouble();
            vect[i] = new Posições(altura);
        }
        double maior = vect[0].getAltura();
        for (int i = 1; i < n; i++){
            if (vect[i].getAltura() > maior){
                maior = vect[i].getAltura();
            }
        }

        int posMaior = 0;
        for (int i = 0; i<n; i++){
            if(vect[i].getAltura() == maior){
                maior = vect[i].getAltura();
                posMaior = i;
            }
        }
        System.out.println("Maior altura = " + maior);
        System.out.println("Posição do maior = " + posMaior);


    }
}
