package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFun5Words {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String[] arr = new String[5];

        for (int i = 0; i < arr.length; ++i){
            arr[i] = myScanner.next();
        }

        System.out.println(Arrays.toString(arr));
    }
}
