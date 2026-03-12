import java.util.Scanner;


public class Função {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Escreva 3 numeros: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int maior = max(a, b, c);

            resultado(maior);


        }
        public static int max(int x, int y, int z ){
                int aux;
                if (x > y && x > z){
                    aux = x;
                }
                else if (y > x && y > z) {
                    aux = y;
                }
                else {
                    aux = z;
                }
                return aux;

        }
        public static void resultado(int valor){
            System.out.println("numero maior = " + valor);
        }
}























