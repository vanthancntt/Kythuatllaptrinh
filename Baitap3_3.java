//Khai bao cac thu vien
import java.util.Scanner;

public class Baitap3_3 {
    //Khai bao doi tuong input cua lop Scanner nhan du lieu nhap vao
    private static Scanner input;

    //Chuong trinh chinh
    public static void main(String[] args) {
        //Khoi tao doi tuong input
        input = new Scanner(System.in);
        //Nhap gia tri cho bien n
        System.out.print("Nhập n: ");
        int n = input.nextInt();
        //khai bao bien tong
        int tong=0;
        //Thuc hien vong lap de tinh tong cac so chan
        for(int i=0; i<=n; i++)
        {
            if(i%2==0)
                tong=tong +i;
        }
        System.out.println("Tổng các số chẵn từ 0 đến n là: "+tong);
    }
}
