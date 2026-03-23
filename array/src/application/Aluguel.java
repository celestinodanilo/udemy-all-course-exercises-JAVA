package application;
import entities.Aluguelclass;
import entities.Aprovadosclass;
import entities.Dadospessoasclass;
import java.util.Locale;
import java.util.Scanner;


public class Aluguel {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Aluguelclass[] quartos = new Aluguelclass[10];
        System.out.println("Quantos estudantes vão querer quarto? ");
        int n = sc.nextInt();
            for (int i = 0; i<n; i++){
                sc.nextLine();
                System.out.println("Nome:");
                String nome = sc.nextLine();
                System.out.println("Gmail: ");
                String gmail = sc.nextLine();

                int quarto = sc.nextInt();
                quartos[quarto] = new Aluguelclass(nome, gmail);

            }
            for (int i = 0; i<10; i++){
                if (quartos[i] != null){
                    System.out.println(i + ": " + quartos[i].getNome() + ": " + quartos[i].getGmail());
                }
            }

    }
    }