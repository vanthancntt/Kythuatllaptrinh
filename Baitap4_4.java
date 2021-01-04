import java.util.Scanner;

public class Baitap4_4 {
    public static void main(String[] args) {
        int n;  // bậc của ma trận vuông
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào bậc của ma trận: ");
        n = scanner.nextInt();

        int A[][] = new int[n][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử thứ:[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Mảng số nguyên vừa nhâp:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        // các phần tử nằm trên đường chéo chính
        // là các phần tử có chỉ số dòng = chỉ số cột
        System.out.println("Các phần tử trên đường chéo chính : \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (i == j)
                    System.out.println(A[i][j]);
        }
    }
}
