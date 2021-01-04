import java.text.DecimalFormat;
import java.util.Scanner;
public class Baitap3_7 {
    //Khai bao doi tuong input cua lop Scanner nhan du lieu nhap vao
    private static Scanner input;

    //Chuong trinh chinh
    public static void main(String[] args) {
        double nghiem;
        //Lam tron den 2 chu so thap phan
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        //Khoi tao doi tuong input
        input = new Scanner(System.in);
        //Nhap gia trị cho he so a va b
        System.out.print("Nhập vào số a: ");
        int a = input.nextInt();
        System.out.print("Nhập vào số b: ");
        int b = input.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x + " + b + " = 0.");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            //ép kiểu để cho ra kết quả chính xác
            nghiem = (double) -b / a;
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
        }
    }
}
