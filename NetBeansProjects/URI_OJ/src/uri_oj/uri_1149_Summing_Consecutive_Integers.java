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
public class uri_1149_Summing_Consecutive_Integers {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int start, n = 0, sum = 0;
        start = scan.nextInt();
        n = scan.nextInt();
        for (;;) {
            if ((n <= 0)) {
                n = scan.nextInt();
            } else {
                for (int j = 1; j <= n; j++) {
                    sum += start;
                    start++;
                }
                break;
            }//else
        }//for
        System.out.printf("%d\n", sum);
    }//main    
}
