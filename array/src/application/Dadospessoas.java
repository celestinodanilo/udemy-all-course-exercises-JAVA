package application;
import entities.Aprovadosclass;
import entities.Dadospessoasclass;
import java.util.Locale;
import java.util.Scanner;


public class Dadospessoas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Dadospessoasclass[] vect = new Dadospessoasclass[n];

        for (int i = 0;i<n;i++){
            double altura = sc.nextDouble();
            char genero = sc.next().charAt(0);

            vect[i] = new Dadospessoasclass(altura, genero);
        }
        double menor = vect[0].getAltura();
        double maior = vect[0].getAltura();

        double somaMulheres = 0;
        int contMulheres = 0;

        int contHomens = 0;

        for (int i = 0; i < n; i++){

            double altura = vect[i].getAltura();

            if (altura < menor){
                menor = altura;
            }
            if (altura > maior){
                maior = altura;
            }


            if (vect[i].getGenero() == 'F'){
                somaMulheres += altura;
                contMulheres++;
            }

            if (vect[i].getGenero() == 'M'){
                contHomens++;
            }
        }
        double mediaMulheres = somaMulheres / contMulheres;

        System.out.printf("Menor altura = %.2f%n", menor);
        System.out.printf("Maior altura = %.2f%n", maior);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaMulheres);
        System.out.println("Numero de homens = " + contHomens);

        sc.close();
    }



    }
