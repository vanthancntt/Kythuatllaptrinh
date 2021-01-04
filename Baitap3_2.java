import java.util.Scanner;

public class Baitap3_2 {
    //Khai bao doi tuong input cua lop Scanner nhan du lieu nhap vao
    private static Scanner input;

    //Chuong trinh chinh
    public static void main(String[] args) {
        //Khoi tao doi tuong input
        input = new Scanner(System.in);
        //Nhap gia tri cho he so a, b, c kieu so thuc tu ban phim
        System.out.print("Nhập a: ");
        float a = input.nextFloat();
        System.out.print("Nhập b: ");
        float b = input.nextFloat();
        System.out.print("Nhập c: ");
        float c = input.nextFloat();
        //Tinh gia trij deta
        float delta=b*b-4*a*c;
        //Xet cac truong hop cua delta de cho ra nghiem
        if (delta<0)
            System.out.println("Phương trình vô nghiệm.");
        else if (delta==0)
            System.out.println("Phương trình có nghiệm kép: "+(-b/(2*a)));
        else{
            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("x1 = " + (-b - Math.sqrt(delta)) / (2 * a));

        }
    }

}
