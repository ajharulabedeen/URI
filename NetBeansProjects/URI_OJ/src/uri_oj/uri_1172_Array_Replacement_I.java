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
public class uri_1172_Array_Replacement_I {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int[] input = new int[10];
        for (int i = 0; i < input.length; i++) {
            input[i] = scan.nextInt();
            if (input[i] <= 0) {
                input[i] = 1;
            }
            System.out.printf("X[%d] = %d\n", (i), input[i]);
        }
    }//main    
}
