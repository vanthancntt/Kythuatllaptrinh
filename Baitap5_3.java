import java.util.Scanner;

public class Baitap5_3 {
    public static void main(String[] args) {

        int m;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        m = scanner.nextInt();

        int A[] = new int[m];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < m; i++) {

                System.out.print("A[" + i + "] = ");
                A[i] = scanner.nextInt();
            }

        int max = A[0];

        for (int i = 0; i < m; i++) {
                if (max < A[i]) {
                    max = A[i];
            }
        }

        System.out.println("Gía trị lớn nhât = " + max);
    }
}
