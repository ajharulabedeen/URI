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
public class uri_1156_S_Sequence_II {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        float sum = 0, div_by = 1;
        for (float i = 1; i <= 39; i += 2) {
            sum += (i / div_by);
            div_by *= 2;
        }
        System.out.printf("%.2f\n", sum);
    }//main        
}
