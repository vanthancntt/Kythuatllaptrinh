public class Vidu5_1 {
    // Sort the original data
    private static final int[] array = {5, 1, 12, -5, 16};

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
