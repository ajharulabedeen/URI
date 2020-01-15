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
public class uri_1153_Simple_Factorial {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n, m = 1;
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            m *= i;
        }
        System.out.printf("%d\n", m);
    }//main        
}
