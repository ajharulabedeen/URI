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
public class uri_1159_Sum_of_Consecutive_Even_Numbers {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = 0, count = 0, start = 0, sum = 0;
        for (;;) {
            int x = scan.nextInt();
            if (x == 0) {
                break;
            } else {
                for (;;) {
                    if ((x % 2) == 0) {
                        sum += x;
                        count++;
                    }
                    x++;
                    if (count == 5) {
                        break;
                    }
                }
                System.out.printf("%d\n", sum);
                count = 0;
                sum = 0;
            }
        }
    }//main    

}
