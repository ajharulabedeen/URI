/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * this code will give presentation error, though, uDebug showing correct result. 
 * later c code, sumitted.
 * 
 */
package uri_oj;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author G7
 */
public class uri_1145_Logical_Sequence_2 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n, d, count = 0;
        d = scan.nextInt();
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            count++;
            if (count != d) {
                System.out.printf("%d ", i);
            }else{
                System.out.printf("%d", i);
            }
            if (count == d) {
                System.out.printf("\n");
                count = 0;
            }
        }
        System.out.printf("\n");
    }//main
    
}
