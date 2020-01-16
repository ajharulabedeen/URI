/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri_oj;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author G7
 */
public class uri_1165_Prime_Number {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int tCase = 0;
        tCase = scan.nextInt();
        for (int j = 0; j < tCase; j++) {
            int n = 0;
            n = scan.nextInt();
            int limit = n / 2;
            boolean prime = true;
            for (int i = 2; i <= limit; i++) {
                if ((n % i) == 0) {
                    System.out.printf("%d nao eh primo\n", n);
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.printf("%d eh primo\n", n);

            }
        }
    }//main    
}
