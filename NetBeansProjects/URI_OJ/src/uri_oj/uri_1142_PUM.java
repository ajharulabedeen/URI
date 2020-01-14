package uri_oj;

import java.io.IOException;
import java.util.Scanner;

public class uri_1142_PUM {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n, x1 = 1, x2 = 2, x3 = 3;
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d PUM\n", x1, x2, x3);
            x1 += 4;
            x2 += 4;
            x3 += 4;
        }
    }//main
}//class
