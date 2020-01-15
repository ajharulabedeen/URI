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
public class uri_1151_Easy_Fibonacci {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n, s1 = 0, s2 = 1, sum = 0;
        n = scan.nextInt();
        System.out.printf("%d ", s1);
        System.out.printf("%d ", s2);
        for (int i = 2; i < n; i++) {
            sum = s1 + s2;
            if (i == (n - 1)) {
                System.out.printf("%d", sum);
            } else {
                System.out.printf("%d ", sum);
            }
            s1 = s2;
            s2 = sum;
        }
        System.out.printf("\n");
    }//main  
}
