package application;
import entities.Mediaparesfinal;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class Mediapares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Mediaparesfinal[] vect= new Mediaparesfinal[n];
        for (int i = 0; i< vect.length; i++){

            int pares = sc.nextInt();;
            vect[i] = new Mediaparesfinal(pares);
        }

        for (int i = 0; i<n; i++){
            if (vect[i].getPares() % 2 == 0){
                System.out.println("Numeros pares: " + vect[i].getPares());
            }
        }
        double soma = 0;

        for (int i = 0; i < n; i++){
            soma += vect[i].getPares();
        }
        double media = soma / n;
        System.out.printf("%.3f%n", media);

        }



    }