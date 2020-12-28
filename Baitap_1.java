import java.util.Scanner;

public class Baitap_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        if (n > 2) {
            if (n % 2 == 0) {
                System.out.println("Đây là số chẵn.");
            } else {
                System.out.println("Đây là số lẻ.");
            }
        }
    }
}
