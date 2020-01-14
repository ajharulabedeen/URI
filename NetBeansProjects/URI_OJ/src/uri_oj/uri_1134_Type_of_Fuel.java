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
public class uri_1134_Type_of_Fuel {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int input, a = 0, g = 0, d = 0;

        for (;;) {
            input = scan.nextInt();
            if (input == 1) {
                a++;
            } else if (input == 2) {
                g++;
            } else if (input == 3) {
                d++;
            }
            if (input == 4) {
                break;
            }
        }
        System.out.printf("MUITO OBRIGADO\n");

        System.out.printf("Alcool: %d\n", a);
        System.out.printf("Gasolina: %d\n", g);
        System.out.printf("Diesel: %d\n", d);
    }//main
}
