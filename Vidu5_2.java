public class Vidu5_2 {
    public void selectionSort(int arr[]) {
        int indexMin, i, j;
        // lap qua tat ca cac so
        for (i = 0; i < arr.length - 1; i++) {
            // thiet lap phan tu hien tai la min
            indexMin = i;
            // kiem tra phan tu hien tai co phai la nho nhat khong
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                System.out.println(" ==> Trao doi phan tu: [" + arr[i]
                        + ", " + arr[indexMin] + "]");
                // Trao doi cac so
                int temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            }
            System.out.println("Vong lap thu " + (i + 1));
            display(arr);
        }
    }

    public void display(int arr[]) {
        int i;
        System.out.print("[");
        // Duyet qua tat ca phan tu
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        // khoi tao mang arr
        int arr[] = {5, 1, 12, -5, 16, 13, 4, 18, 7};
        Vidu5_2 sapXepChon = new Vidu5_2();
        System.out.println("Mang du lieu dau vao: ");
        sapXepChon.display(arr);
        System.out.println("-----------------------------");
        sapXepChon.selectionSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        sapXepChon.display(arr);
    }
}

