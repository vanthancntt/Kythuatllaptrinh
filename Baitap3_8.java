import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Baitap3_8 {
    //Khai bao doi tuong input cua lop Scanner nhan du lieu nhap vao
    private static Scanner input;

    //Chuong trinh chinh
    public static void main(String[] args) {
        //Khoi tao doi tuong input
        input = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int n = input.nextInt();
        if (kiemtrasonguyento(n) == 1) {
            System.out.println(n + " Là số nguyên tố");
        } else System.out.println(n+" Không phải là số nguyên tố");
    }
    public static int kiemtrasonguyento(int n){
        int dem=0;
        for (int i=1; i<=n; i++)
        {
            if(n%i==0)
                dem++;
        }
        if(dem==2)
            return 1;
        else return 0;
    }

}

