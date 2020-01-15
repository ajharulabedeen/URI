/**
 * the code is not working for 
 */
package uri_oj;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author G7
 */
public class uri_1146_growing_sequence {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n, count = 0;
        for (;;) {
            n = scan.nextInt();
            if (n == 0) {
                break;
            } else {
                count = 0;
                for (int j = 1; j <= n; j++) {
                    count++;
                    if (count != n) {
                        System.out.printf("%d ", j);
                    } else {
                        System.out.printf("%d", j);
                    }
                }
            }
            System.out.printf("\n");
        }//for(;;)
    }//main    
}
