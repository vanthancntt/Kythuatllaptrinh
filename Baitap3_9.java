import java.util.Scanner;

public class Baitap3_9 {
    //Khai bao doi tuong input cua lop Scanner nhan du lieu nhap vao
    private static Scanner input;

    //Chuong trinh chinh
    public static void main(String[] args) {
            float tong = 1;
            float mau = 1;
            int giai_thua = 1;
            input = new Scanner(System.in);
            System.out.print("Nhập số tự nhiên N = ");
            int n = input.nextInt();
            for (int i = 2; i <= n; i++) {
                for (int j = 2; j <= i; j++) {
                    giai_thua *= j;
                }
                mau += giai_thua;
                tong += 1/(mau);
                giai_thua = 1;
            }
            System.out.println("S = " + tong);
    }
}
