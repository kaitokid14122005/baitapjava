/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pheptinhtoan;

import java.util.Scanner;

/**
 *
 * @author bao
 */
public class Pheptinhtoan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner SC = new Scanner(System.in);
        System.out.println("nhap a vao ");
        a = SC.nextInt();
        System.out.println("nhap b vao ");
        b = SC.nextInt();
        int tong = a+b;
        System.out.println("tong :"+tong);
        int hieu = a-b;
        System.out.println("hieu :"+hieu);
        int nhan = a*b;
        System.out.println("nhan :"+nhan);
        float chia =(float) a/b;
        System.out.println("chia :"+chia);
    }
    
}
