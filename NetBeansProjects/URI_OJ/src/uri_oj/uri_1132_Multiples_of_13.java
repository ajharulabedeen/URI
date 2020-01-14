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
public class uri_1132_Multiples_of_13 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int testCases = 0, start, end;
//        testCases = scan.nextInt();
        for (int i = 0; i <= testCases; i++) {
            start = scan.nextInt();
            end = scan.nextInt();
            System.out.printf("%d\n", sum2(start, end));
        }
    }//main

    public static int sum2(int x, int y) {
        int sum = 0;
        if (x < y) {
            for (int i = x; i <= y; i++) {
                if (i % 13 != 0) {
                    sum += i;
                }
            }
        } else if (y < x) {
            for (int i = y; i <= x; i++) {
                if (i % 13 != 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }

}
