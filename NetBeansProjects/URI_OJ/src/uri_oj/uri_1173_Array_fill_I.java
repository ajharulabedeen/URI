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
public class uri_1173_Array_fill_I {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int[] input = new int[10];
        input[0] = scan.nextInt();
        System.out.printf("N[0] = %d\n", input[0]);
        for (int i = 1; i < input.length; i++) {
            input[i] = 2 * input[i - 1];
            System.out.printf("N[%d] = %d\n", i, input[i]);
        }
    }//main    s
}
