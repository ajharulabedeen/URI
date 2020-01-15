package uri_oj;

import java.io.IOException;
import java.util.Scanner;

public class uri_1150_Exceeding_Z {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int start, end = 0, sum = 0, counter = 0;
        boolean done = false;
        start = scan.nextInt();
        end = scan.nextInt();
        for (;;) {
            if ((end <= start)) {
                end = scan.nextInt();
            } else {
                for (;;) {
                    sum += start;
                    start++;
                    counter++;
                    if (sum > end) {
                        done = true;
                        break;
                    }
                }
            }//else
            if (done) {
                break;
            }
        }//for
        System.out.printf("%d\n", counter);
    }//main  

}
