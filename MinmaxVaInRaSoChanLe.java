/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minmax.va.in.ra.so.chan.le;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bao
 */
public class MinmaxVaInRaSoChanLe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner SC = new Scanner(System.in);
        Random random = new Random();
        String check;
        do {
            System.out.println("Tiep tuc chuong trinh(yes or no)?");
            check = SC.next();
            int n = random.nextInt(100 - 1 + 1) + 1;
            if (n % 2 == 0) {
                System.out.println("la so chan ");
            } else {
                System.out.println(n + "la so le ");
            }
        } while (check.equals("yes"));

    }

}
