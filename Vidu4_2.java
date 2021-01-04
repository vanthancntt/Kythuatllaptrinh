package com.company;
import java.util.Scanner;
public class Vidu4_2 {
    public static void main(String[] args) {
        int size; // kích thước của mảng
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào độ dài của mảng: ");
        size= scanner.nextInt();

        // khai báo và cấp phát bộ nhớ cho mảng
        // mảng này có tên là array và kích thước = size
        int[] array = new int[size];

        // array.length: trả về kích thước của mảng
        // vòng lặp này sẽ duyệt i từ 0 đến chiều dài của mảng - 1
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt(); // nhập giá trị cho phần tử
        }

        // hiển thị giá trị các phần tử trong mảng
        for (int i = 0; i < size; i++) {
            System.out.println("Phần tử thứ " + i + ": " + array[i]);
        }
    }
}
