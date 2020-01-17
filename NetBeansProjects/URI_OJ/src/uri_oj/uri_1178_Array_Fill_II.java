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
public class uri_1178_Array_Fill_II {
 public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t;
        int[] vector = new int[1000];
        t = scan.nextInt();
        for (int i = 0; i < 1000; ) {
            for (int j = 0; j < t; j++) {
                vector[i]=j;
                System.out.printf("N[%d] = %d\n",i,vector[i]);
                i++;
                if(i==vector.length){
                    break;
                }
            }
        }
    }//main  
}
