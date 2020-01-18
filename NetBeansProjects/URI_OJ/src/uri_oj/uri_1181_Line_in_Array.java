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
public class uri_1181_Line_in_Array {

   public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int r;
        float[][] m = new float[12][12];
        String operation;
        r = scan.nextInt();
        operation = scan.nextLine();
        operation = scan.nextLine();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = scan.nextFloat();
            }
        }
        float sum = 0;
        for (int i = 0; i < m[r].length; i++) {
            sum += m[r][i];
        }
        if (operation.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else if (operation.equals("M")) {
            System.out.printf("%.1f\n", (float) sum / 12);
        }
    }//main  
    
}
