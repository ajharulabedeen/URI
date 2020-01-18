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
public class uri_1189_Left_Area {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        float[][] m = new float[12][12];
        int count = 0;
        String operation;
        operation = scan.nextLine();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = scan.nextFloat();
            }
        }
        double sum = 0;
        int khatCounter = 0;
        for (int i = 0; i < 5; i++) {
            khatCounter++;
            for (int j = i + 1; j <= 10 - i; j++) {
                sum += m[j][i];
                count++;
            }
        }
        if (operation.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else if (operation.equals("M")) {
            System.out.printf("%.1f\n", (float) sum / count);
        }
    }//main  

}
