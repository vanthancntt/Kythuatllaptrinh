package com.company;

public class Vidu4_3 {
    public static void main(String[] args) {
        // khai báo mảng array1 và array2
        int[] array1 = {2, 10, 3, 9, 8};
        int array2[] = new int[5];

        // gán giá trị của phần tử thứ 2 trong mảng array1
        // cho phần tử thứ 3 trong mảng array2
        array2[3] = array1[2];

        System.out.println("Giá trị của phần tử thứ 3 trong mảng array2 = " +
                array2[3]);
    }
}
