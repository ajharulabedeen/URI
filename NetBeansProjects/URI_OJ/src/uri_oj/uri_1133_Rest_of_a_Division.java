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
public class uri_1133_Rest_of_a_Division {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int testCases = 0, start, end;
//        testCases = scan.nextInt();
        for (int i = 0; i <= testCases; i++) {
            start = scan.nextInt();
            end = scan.nextInt();
            sum2(start, end);
        }
    }//main

    public static void sum2(int x, int y) {
        int sum = 0;
        if (x < y) {
            for (int i = x + 1; i < y; i++) {
                int r = i % 5;
                if (r == 3 || r == 2) {
                    System.out.printf("%d\n", i);
                }
            }
        } else if (y < x) {
            for (int i = y + 1; i < x; i++) {
                int r = i % 5;
                if (r == 3 || r == 2) {
                    System.out.printf("%d\n", i);
                }
            }
        }
    }

}
