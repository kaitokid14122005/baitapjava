/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timminvamax;

import java.util.Scanner;

/**
 *
 * @author bao
 */
public class Timminvamax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size;
        float[] mangso;
        Scanner SC = new Scanner(System.in);
        do {
            System.out.print("nhap kich thuoc mang :");
            size = SC.nextInt();
        } while (!(0 < size && size < 50));
        mangso = new float[size];
        System.out.println("nhap du lieu mang :");
        for (int i = 0; i < mangso.length; i++) {
            System.out.format("Phan tu thu %d =", i + 1);
            mangso[i] = SC.nextFloat();
        }
        boolean timthay;
        timthay = false;
        for (float i : mangso) {
            if (mangso[0] != i) {
                timthay = true;
                break;
            }
        }
        if (!timthay) {
            System.out.println("mang khong chua gia tri lon nhat hay nho nhat");
        } else {
            float max;
            max = mangso[0];
            for (float i : mangso) {
                if (max < i) {
                    max = i;
                }
            }
            System.out.println("gia tri lon nhat trong mang la:" + max);

        }
        float min;
        min = mangso[0];
        for (float i : mangso) {
            if (min > i) {
                min = i;
            }
        }
        System.out.println("gia tri nho nhat trong mang la:" + min);
    }

}
