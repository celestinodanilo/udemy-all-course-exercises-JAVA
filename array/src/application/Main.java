package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++)
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }

    }
}














