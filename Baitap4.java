/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap4;

import java.util.Scanner;

/**
 *
 * @author bao
 */
public class Baitap4 {
    // 1. Method nhập mảng số thực
    public static void importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
    }

    // 2. Method xuất mảng ra màn hình
    public static void printData(float[] arrays) {
        for (float num : arrays) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 3. Method tìm giá trị phần tử lớn thứ 2 trong mảng
    public static float findMax2(float[] arrays) {
        if (arrays.length < 2) {
            System.out.println("Mang can it nhat 2 phan tu đe tim phan tu lon thu 2.");
            return Float.NaN; // Trả về NaN nếu mảng không đủ phần tử
        }

        float max1 = Float.NEGATIVE_INFINITY;
        float max2 = Float.NEGATIVE_INFINITY;

        for (float num : arrays) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

        if (max2 == Float.NEGATIVE_INFINITY) {
            System.out.println("Khong co phan tu lon thu 2 (tat ca phan tu deu giong nhau).");
            return Float.NaN;
        }

        return max2;
    }

    // 4. Method xóa các phần tử lẻ ra khỏi mảng
    public static float[] deleteOddNumber(float[] arrays) {
        int evenCount = 0;

        // Đếm số lượng phần tử chẵn
        for (float num : arrays) {
            if ((int) num % 2 == 0) {
                evenCount++;
            }
        }

        // Tạo mảng mới chứa các phần tử chẵn
        float[] evenArray = new float[evenCount];
        int index = 0;

        for (float num : arrays) {
            if ((int) num % 2 == 0) {
                evenArray[index++] = num;
            }
        }

        return evenArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.print("Nhap kich thuoc mang: ");
        int size = scanner.nextInt();

        // Khởi tạo mảng
        float[] arrays = new float[size];

        // Gọi các phương thức
        importData(arrays);
        printData(arrays);

        // Tìm phần tử lớn thứ 2
        float max2 = findMax2(arrays);
        if (!Float.isNaN(max2)) {
            System.out.println("Phan tu co gia tri lon thu 2 trong mang là: " + max2);
        }

        // Xóa các phần tử lẻ
        arrays = deleteOddNumber(arrays);
        System.out.print("Mang sau khi xoa cac phan tu le: ");
        printData(arrays);
    }
}



