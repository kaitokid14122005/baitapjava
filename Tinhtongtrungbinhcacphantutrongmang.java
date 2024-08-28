/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tinhtongtrungbinhcacphantutrongmang;

import java.util.Scanner;

/**
 *
 * @author bao
 */
public class Tinhtongtrungbinhcacphantutrongmang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = new int [10];
        int tong=0;
        Scanner SC = new Scanner(System.in);
        for(int i=0;i<10;i++){
            a[i]=SC.nextInt();
            tong=tong+a[i];
        }
        float trungbinh = (float)tong/10;
        System.out.println("trung binh cac phan tu trong mang "+trungbinh);
    }
    
}
