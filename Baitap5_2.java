import java.util.Scanner;

public class Baitap5_2 {
    static int LinearSearch(int b[], int m, int y)
    {
        for (int i = 0; i < m; i++)
            if (b[i] == y)
                return i;
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b[]= {7,9,5,29,1,34,11,69,0};
        System.out.println("Nhập giá trị cần tìm: ");
        int giatri= scanner.nextInt();
        int ketqua=LinearSearch(b,b.length,giatri);
        if (ketqua==-1)
            System.out.println("Không tìm thấy giá trị: " + giatri);
        else
            System.out.println("Gía trị nhập vào từ bàn phím: " + ketqua);
    }
}