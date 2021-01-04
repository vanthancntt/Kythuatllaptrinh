import java.util.Scanner;

public class Baitap3_12 {
    //Khai bao doi tuong input cua lop Scanner nhan du lieu nhap vao
    private static Scanner input;

    //Chuong trinh chinh
    public static void main(String[] args) {
        input  = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương a = ");
        int a = input.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = input.nextInt();
        // tính USCLN của a và b
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + USCLN(a, b));
    }
    //Tìm ước số chung lớn nhất (USCLN)
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
}