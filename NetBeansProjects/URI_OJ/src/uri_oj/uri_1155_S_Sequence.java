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
public class uri_1155_S_Sequence {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        float sum = 0, count = 0;
        for (float i = 1; i <= 100; i++) {
            sum += (1 / i);
        }
        System.out.printf("%.2f\n", sum);
    }//main    

}
