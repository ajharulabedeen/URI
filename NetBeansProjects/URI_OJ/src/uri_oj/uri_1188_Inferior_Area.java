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
public class uri_1188_Inferior_Area {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double[][] m = new double[12][12];
        int count = 0;
        String operation;
        operation = scan.nextLine();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = scan.nextDouble();
            }
        }
        double sum = 0;
        int khatCounter = 0;
        for (int i = 11; i >= 7; i--) {
            khatCounter++;
            for (int j = i - 1; j >= khatCounter; j--) {
                sum += m[i][j];
                count++;
            }
        }
        if (operation.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else if (operation.equals("M")) {
            System.out.printf("%.1f\n", sum / count);
        }
    }//main  

}
