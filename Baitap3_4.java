import java.util.Scanner;

public class Baitap3_4 {
    //Khai bao doi tuong input cua lop Scanner nhan du lieu nhap vao
    private static Scanner input;

    //Chuong trinh chinh
    public static void main(String[] args) {
        //Khoi tao doi tuong input
        input = new Scanner(System.in);
        //Nhap gia tri cho bien n
        System.out.print("Lựa chọn của người chơi 1 (Búa-1, Kéo-2, Giấy-3): ");
        int luachon1 = input.nextInt();
        System.out.print("Lựa chọn của người chơi 2 (Búa-1, Kéo-2, Giấy-3): ");
        int luachon2 = input.nextInt();
        if(luachon1==1)
        {
            switch (luachon2)
            {
                case 1:System.out.print("Ket qua: Hoa nhau");
                case 2:System.out.print("Ket qua: Nguoi 1 thang");
                case 3:System.out.print("Ket qua: Nguoi 2 thang");
                    break;
            }
        }else if(luachon1==2)
        {
            switch (luachon2)
            {
                case 1:System.out.print("Ket qua: Nguoi 2 thang");
                case 2:System.out.print("Ket qua: Hoa nhau");
                case 3:System.out.print("Ket qua: Nguoi 1 thang");
                    break;
            }
        }else if(luachon1==3)
        {
            switch (luachon2)
            {
                case 1:System.out.print("Ket qua: Nguoi 1 thang");
                case 2:System.out.print("Ket qua: Nguoi 2 thang");
                case 3:System.out.print("Ket qua: Hoa nhau");
                    break;
            }
        }
    }
}
