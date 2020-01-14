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
public class uri_1144_Logical_Sequence {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n, c2 = 1, d2 = 2, d3 = 0;
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d %d %d\n", i, (c2), ((i * c2)));
            System.out.printf("%d %d %d\n", i, (c2 += 1), ((i * c2) - d3));
            c2 += d2;
            d3++;
            d2 += 2;
        }
    }//main

}
