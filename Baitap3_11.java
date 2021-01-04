import java.util.Scanner;

public class Baitap3_11 {
    //Khai bao doi tuong input cua lop Scanner nhan du lieu nhap vao
    private static Scanner input;

    static boolean checkPerfectSquare(double x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }
    //Chuong trinh chinh
    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Nhập vào số cần kiểm tra:");
        double num = input.nextDouble();
        input.close();
        if (checkPerfectSquare(num))
            System.out.println(num+ " Là số chính phương");
        else
            System.out.println(num+ " Không phải là số chính phương");
    }
}
