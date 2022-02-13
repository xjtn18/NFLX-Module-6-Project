package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFunUserArray {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; ++i){
            arr[i] = myScanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}
