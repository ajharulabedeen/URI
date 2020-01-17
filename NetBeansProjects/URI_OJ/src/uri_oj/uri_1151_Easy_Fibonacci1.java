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
public class uri_1151_Easy_Fibonacci1 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        long n, s1 = 0, s2 = 1;
        long sum = 0;
        int tCase;
        tCase = scan.nextInt();

        for (int j = 0; j < tCase; j++) {
            n = scan.nextInt();
            if (n == 0) {
                sum = 0;
            } else if (n == 1) {
                sum = 1;
            } else {
                sum = s1 + s2;
            }

            for (int i = 2; i <=n; i++) {
                sum = s1 + s2;
                s1 = s2;
                s2 = sum;
            }
            System.out.printf("Fib(%d) = %d\n",n, sum);
            sum = 0;
            s1=0;
            s2=1;
        }//for

    }//main  

    public static void fib(int x) {
        Scanner scan = new Scanner(System.in);
        long n, s1 = 0, s2 = 1;
        long sum = 0;
        int tCase;

//        n = scan.nextInt();
        n = x;
//        System.out.printf("%d ", s1);
//        System.out.printf("%d ", s2);
        if (n == 0) {
            sum = 0;
        } else if (n == 1) {
            sum = 1;
        } else {
            sum = s1 + s2;
        }

        for (int i = 2; i < n + 1; i++) {
            sum = s1 + s2;
            if (i == (n - 1)) {
                System.out.printf("%d", sum);
            } else {
                System.out.printf("%d ", sum);
            }
            s1 = s2;
            s2 = sum;
        }
        System.out.printf("\n---sum--- : %d\n", sum);

    }
}
