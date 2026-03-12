
import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class programaWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero 1 - cartesiano");
        System.out.println("Numero 2 - senha");
        System.out.println("Numero 3 - gasolina");
        System.out.println("Escolha um codigo a ser execultado: ");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                cartesiano();
                break;

            case 2:
                senha();

            case 3:
                gasolina();

            default:
                System.out.println("numero invalido");

        }
        while (opcao != 0) ;
        sc.close();
    }

    /*Programa cartesiano*/


    public static void cartesiano() {


        /*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/


        Scanner sc = new Scanner(System.in);
        double x = 1;
        double y = 1;

        while (x != 0 && y != 0) {
            System.out.println("Escreva as duas cordenadas para o plano cartesiano: ");
            x = sc.nextDouble();
            y = sc.nextDouble();

            if (x == 0 || y == 0) {
                break;
            }
        }

        if (x > 0 && y > 0) {
            System.out.println("primeiro");
        } else if (x < 0 && y > 0) {
            System.out.println("segundo");
        } else if (x < 0 && y < 0) {
            System.out.println("terceiro");
        } else { // x > 0 && y < 0
            System.out.println("quarto");
        }

        System.out.println("Programa encerrado");
        sc.close();

    }

    /*Programa para senhas*/


    public static void senha() {


        /*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva uma senha: ");
        int x = sc.nextInt();

        while (x != 2002) {
            System.out.println("Senha invalida\n");
            System.out.println("Digite outra senha: ");
            x = sc.nextInt();
        }
        System.out.println("Acesso permitido");

        sc.close();


    }

    public static void gasolina() {

           /*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.*/

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("1 - Álcool\n");
        System.out.println("2 - Gasolina\n");
        System.out.println("3 - Diesel");
        System.out.println("4 - fim\n");
        System.out.println("Escolha o produto:");

       int cliente = sc.nextInt();

        while (cliente != 4) {
            if (cliente == 1) {

                alcool = alcool + 1;

            } else if (cliente == 2) {

                gasolina = gasolina + 1;

            } else if (cliente == 3) {

                diesel = diesel + 1;
            }
                cliente = sc.nextInt();
            if (cliente > 4){
                break;
            }
            }
            System.out.println("MUITO OBRIGADO");
            System.out.println("Alcool: " + alcool);
            System.out.println("Gasolina: " + gasolina);
            System.out.println("Diesel: " + diesel);

            sc.close();
        }
    }

















