
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author G7
 */
public class uri_1164_Perfect_Number {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int tCase = 0;
        tCase = scan.nextInt();
        for (int j = 0; j < tCase; j++) {
            int n = 0;
            int perfect = 0;
            n = scan.nextInt();
            int limit = n / 2;
            for (int i = 1; i <= n; i++) {
                if ((n % i) == 0) {
                    System.out.printf("%d eh primo\n");
                    break;
                }
            }
            if (perfect == n) {
                System.out.printf("%d eh perfeito\n", n);
            } else {
                System.out.printf("%d nao eh perfeito\n", n);
            }
        }
    }//main    

}
