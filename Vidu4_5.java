package com.company;
import java.util.Scanner;
public class Vidu4_5 {
    public static void main(String[] args) {
        // khai báo số dòng và số cột cho mảng
        int soDong, soCot;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        soCot = scanner.nextInt();

        // khai báo và cấp phát bộ nhớ cho mảng
        int[][] A = new int[soDong][soCot];
        // Để nhập giá trị các phần tử cho mảng
        // chúng ta sẽ sử dụng 2 vòng lặp for
        // vòng lặp for bên ngoài sẽ duyệt i từ 0 đến soDong - 1
        // và vòng lặp for bên trong sẽ duyệt j từ 0 đến soCot - 1
        // mỗi lần như vậy thì sẽ nhập vào phần tử tại vị trí i, j
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }
        // hiển thị các phần tử trong mảng vừa nhập
        // chúng ta cũng sử dụng 2 vòng lặp for như khi nhập
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(A[i][j] + "\t");
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }
    }
}
