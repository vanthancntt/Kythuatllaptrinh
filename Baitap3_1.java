import java.util.Scanner;

public class Baitap3_1 {
    //Khai bao doi tuong input cua lop Scanner nhan du lieu nhap vao
    private static Scanner input;

    //chuong trinh chinh
    public static void main(String[] args) {

        //khoi tao doi tuong input
        input = new Scanner(System.in);
        //nhap gia tri cho bien a, b kieu so thuc tu ban phim
        System.out.print("Nhap a: ");
        float a = input.nextFloat();
        System.out.print("Nhap b: ");
        float b = input.nextFloat();
        //hien thi ket qua tinh toan ra man hinh
        System.out.println("Ket qua bai toan a + b la: " + (a + b));
        System.out.println("Ket qua bai toan a - b la: " + (a - b));
        System.out.println("Ket qua bai toan a * b la: " + (a * b));
        System.out.println("Ket qua bai toan a / b la: " + (a / b));

    }
}