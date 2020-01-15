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
public class uri_1157_Divisors_I {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        n = scan.nextInt();
        int limit = n / 2;
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                System.out.printf("%d\n", i);
            }
        }
    }//main    

}
