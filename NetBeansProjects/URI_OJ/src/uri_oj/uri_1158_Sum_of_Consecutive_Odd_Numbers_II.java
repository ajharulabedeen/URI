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
public class uri_1158_Sum_of_Consecutive_Odd_Numbers_II {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = 0, count = 0, start = 0, sum = 0;
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            for (;;) {
                if ((x % 2) != 0) {
                    sum += x;
                    count++;
                }
                x++;
                if (count == y) {
                    break;
                }
            }
            System.out.printf("%d\n", sum);
            count = 0;
            sum = 0;
        }
    }//main        
}
