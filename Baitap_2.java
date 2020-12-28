import java.util.Scanner;

public class Baitap_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = sc.nextInt();
        } while (n < 0);

        // khởi tạo và cấp phát bộ nhớ cho mảng
        int A[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = sc.nextInt();
        }
        // Hiển thị mảng vừa nhập
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }

        int dem = 0;
        System.out.println("Các phần tử chia hết cho 5 mà không chia hết cho 6: ");
        for (int i = 0; i < n; i++) {
            if (A[i] % 5 == 0) {
                if (A[i] % 6 != 0) {
                    dem++;
                }
            }
        }
        System.out.println(dem);

        int le = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 1) {
                le++;
            }
        }
        System.out.println( + le + " số phần tử trong mảng A có giá trị lẻ là: ");
        // y 4
        int sum = 0;
        int TB = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
        }
        TB = sum / n;
        int Dem = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] >= TB) {
                Dem++;
            }
        }
        System.out.println("co " + Dem + " phần tử trong mảng A có giá trị lớn hơn hoặc bằng giá trị trung bình");
        // y 5
        int j = 0;
        int[] C = new int[n];
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 1) {
                C[j] = A[i];
                j++;
            }
        }
        System.out.println("Các phần tử của mảng C  là: ");
        for (int i = 0; i < j; i++) {
            System.out.print(C[i] + "\t");
        }
        // y 6
        int a = 0;
        System.out.print("\nNhap so can kiem tra : ");
        int X = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (A[i] == X) {
                a++;
            }
        }
        if (a >= 2) {
            System.out.println("Có tồn tại giá trị " + X + " lặp lại trong mảng.");
        } else {
            System.out.println("Không tồn tại giá trị " + X + " lặp lại trong mảng.");
        }
    }
}
