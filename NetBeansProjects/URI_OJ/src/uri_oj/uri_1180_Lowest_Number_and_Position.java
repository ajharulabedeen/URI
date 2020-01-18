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
public class uri_1180_Lowest_Number_and_Position {

  public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n, low = 0, position;
        n = scan.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < x.length; i++) {
            x[i] = scan.nextInt();
        }
        low = x[0];
        position = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] < low) {
                low = x[i];
                position = i;
            }
        }
        System.out.printf("Menor valor: %d\n", low);
        System.out.printf("Posicao: %d\n", position);
    }//main  
    
}
