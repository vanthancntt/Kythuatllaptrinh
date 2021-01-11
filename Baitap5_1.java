public class Baitap5_1 {
    private static final int [] a ={6,0,-9,1,10,5};
    public static void main(String[] args) {
        int temp;
        for (int i = 0; i < a.length - 1 ; i++){
            for (int j = 0; j < a.length - 1; j++){
                if (a [j]<a[j + 1]){
                    temp = a [j];
                    a [j] = a [j + 1];
                    a [j + 1] = temp;
                }
            }
        }
        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i] + " ");
        }
    }
}
