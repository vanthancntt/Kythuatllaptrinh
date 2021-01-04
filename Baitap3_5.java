import java.util.Scanner;

public class Baitap3_5 {
    //Khai bao doi tuong input cua lop Scanner nhan du lieu nhap vao
    private static Scanner input;

    //Chuong trinh chinh
    public static void main(String[] args) {
        //Khoi tao doi tuong input
        input = new Scanner(System.in);
        //Khai bao 2 bien ten, matkhau
        String ten=null, matkhau=null;
        int dem=1;
        //Thuc hien nhap ten, matkhau toi da 3 lan
        while(dem<=3)
        {
            System.out.print("Nhập tên người dùng: ");
            ten = input.next();
            System.out.print("Nhập mật khẩu: ");
            matkhau = input.next();
            dem=dem+1;
            //Neu ten va mat khau vao dung thi thoat vong lap
            if((ten.equals("than"))&&(matkhau.equals("1234")))
                break;
        }
        //Khai bao bien tong
        int tong=0;
        //Thuc hien vonh lap for kiem tra tung so tu 100-200
        for (int i=100; i<=200; i++)
        {
            //neu i thoa dieu kien thi hien thi vo cong i vao bien tong
            if((i%3==0)&&(i%5==0))
            {
                System.out.print(i + " ");
                tong=tong+i;
            }
        }
        System.out.println("\nTổng các số thỏa điều kiện là: " + tong);
    }
}
