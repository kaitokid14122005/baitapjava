/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylisr;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bao
 */
public class ArrayLisr {

    public class NumberExercise {

        public static void EnterData(ArrayList<Integer> numbers) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap so luong phan tu: ");
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
                numbers.add(scanner.nextInt());
            }
        }

        public static void printData(ArrayList<Integer> numbers) {
            System.out.println("Cac phan tu trong mang: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        public static int findMax2(ArrayList<Integer> numbers) {
            if (numbers.size() < 2) {
                System.out.println("Mang phai co it nhat 2 phan tu.");
                return -1;
            }

            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;

            for (int number : numbers) {
                if (number > max1) {
                    max2 = max1;
                    max1 = number;
                } else if (number > max2 && number != max1) {
                    max2 = number;
                }
            }

            if (max2 == Integer.MIN_VALUE) {
                System.out.println("Khong co phan tu lon thu 2.");
                return -1;
            }

            return max2;
        }

        public static void deleteOddNumber(ArrayList<Integer> numbers) {
            numbers.removeIf(number -> number % 2 != 0);
        }
    }
}
