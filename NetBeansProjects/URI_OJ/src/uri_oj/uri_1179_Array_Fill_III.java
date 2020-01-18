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
public class uri_1179_Array_Fill_III {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double t;
        double[] vector = new double[100];
        t = scan.nextFloat();
        vector[0] = t;
        System.out.printf("N[0] = %.4f\n", vector[0]);
        for (int i = 1; i < 100; i++) {
            vector[i] = (float) vector[i - 1] / (float) 2.00;
            System.out.printf("N[%d] = %.4f\n", i, vector[i]);
        }
    }//main  

}
