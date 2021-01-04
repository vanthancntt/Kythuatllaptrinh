import java.util.Scanner;

public class Baitap4_3 {
    private static Scanner input;

    public static void main(String[] args) {
        int size;   // kích thước của mảng
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào độ dài của mảng: ");
        size = scanner.nextInt();

        // khai báo và cấp phát bộ nhớ cho mảng
        // mảng này có tên là array và kích thước = size
        int[] arr = new int[size];

        // array.length: trả về kích thước của mảng
        // vòng lặp này sẽ duyệt i từ 0 đến chiều dài của mảng - 1
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();   // nhập giá trị cho phần tử

        }
        // hiển thị giá trị các phần tử trong mảng
        for (int i = 0; i < size; i++) {
            System.out.println("Phần tử thứ " + i + ": " + arr[i]);

        }
        int test = 0;
        System.out.print("\nCac so chinh phuong cua mang la: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= arr[i]; j++)
                if (j * j == arr[i]) {
                    System.out.print(arr[i] + " ");
                    test++;
                }
        }
        if (test == 0) {
            System.out.print("khong co");
        }
    }
}

