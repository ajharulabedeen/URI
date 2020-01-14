/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri_oj;

import java.io.IOException;
import java.util.Scanner;

public class uri_1131_Grenais {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int g, i, r, grenais = 0, inter = 0, gremio = 0, empates = 0;
        for (;;) {
            i = scan.nextInt();
            g = scan.nextInt();
            if (g > i) {
                gremio++;
            } else if (i > g) {
                inter++;
            } else {
                empates++;
            }
            grenais++;
            System.out.printf("Novo grenal (1-sim 2-nao)\n");
            r = scan.nextInt();
            if (r == 2) {
                break;
            }
        }
        System.out.printf("%d grenais\n", grenais);
        System.out.printf("Inter:%d\n", inter);
        System.out.printf("Gremio:%d\n", gremio);
        System.out.printf("Empates:%d\n", empates);
        if (inter > gremio) {
            System.out.printf("Inter venceu mais\n");
        } else if (inter < gremio) {
            System.out.printf("Gremio venceu mais\n");
        } else {
            System.out.printf("Nao houve vencedor\n");
        }
    }//main
}//class
