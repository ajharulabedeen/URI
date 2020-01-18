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
public class uri_1179_Array_Fill_IV {

        public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int[] par = new int[5];
        int[] impar = new int[5];
        int x, parCount = 0, imparCount = 0;
        for (int i = 0; i < 15; i++) {
            x = scan.nextInt();
            if ((x % 2) == 0) {
                par[parCount] = x;
                parCount++;
                if (parCount == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.printf("par[%d] = %d\n", j, par[j]);
                    }
                    parCount = 0;
                }
            } else {
                impar[imparCount] = x;
                imparCount++;
                if (imparCount == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.printf("impar[%d] = %d\n", j, impar[j]);
                    }
                    imparCount = 0;
                }
            }
        }
        for (int j = 0; j < imparCount; j++) {
            System.out.printf("impar[%d] = %d\n", j, impar[j]);
        }
        for (int j = 0; j < parCount; j++) {
            System.out.printf("par[%d] = %d\n", j, par[j]);
        }
    }//main  
    
}
