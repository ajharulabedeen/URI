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
public class uri_1154_Ages {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n, sum = 0, count = 0;
        for (;;) {
            n = scan.nextInt();
            if (n < 0) {
                break;
            }
            sum += n;
            count++;
        }
        System.out.printf("%.2f\n", (float) ((float) sum / count));
    }//main    

}
