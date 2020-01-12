/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri_oj;

import java.io.IOException;
import java.util.Scanner;

public class uri_1009_Salary_with_Bonus {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String sName;
        double fSalary, tSell, finalSalary;
        sName = s.nextLine();
        fSalary = s.nextDouble();
        tSell = s.nextDouble();
        finalSalary = fSalary + (.15 * tSell);
        System.out.printf("TOTAL = R$ %.2f\n", finalSalary);
    }

}
