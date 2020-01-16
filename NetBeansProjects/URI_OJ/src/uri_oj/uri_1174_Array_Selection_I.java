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
public class uri_1174_Array_Selection_I {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        float[] input = new float[100];
        for (int i = 0; i < input.length; i++) {
            input[i] = scan.nextFloat();
            if (input[i] <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, input[i]);
            }
        }
    }//main    
}
