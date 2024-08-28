/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sapxepmangtangdan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bao
 */
public class Sapxepmangtangdan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner SC = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang : ");
        int n = SC.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int item;
        for (int i = 0; i < n; i++) {
            item = SC.nextInt();
            list.add(item);
        }
        //sap xep mang tang dan
        //       System.out.println("sap xep mang tang dan ");
        //       for (int i = 0; i < n; i++) {
        //         System.out.print(list.get(i) + " ");
        System.out.print("sap xep mang tang dan ");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (list.get(i) > list.get(j)) {
                    int k = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j, k);
                }
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
