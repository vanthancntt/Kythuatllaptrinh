import java.util.Scanner;

public class Baitap4_2 {
    public static void main(String[] args) {
        // khai báo số dòng và số cột cho mảng
        int n, m;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        n = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        m = scanner.nextInt();

        // khai báo và cấp phát bộ nhớ cho mảng
        int[][] A = new int[n][m];

        // Để nhập giá trị các phần tử cho mảng
        // chúng ta sẽ sử dụng 2 vòng lặp for
        // vòng lặp for bên ngoài sẽ duyệt i từ 0 đến n - 1
        // và vòng lặp for bên trong sẽ duyệt j từ 0 đến m - 1
        // mỗi lần như vậy thì sẽ nhập vào phần tử tại vị trí i, j
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }
        // hiển thị các phần tử trong mảng vừa nhập
        // chúng ta cũng sử dụng 2 vòng lặp for như khi nhập
        System.out.println("Mảng vừa nhập: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + "\t");
                sum += A[i][j];
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println(sum + "\n");
        }
    }
}
