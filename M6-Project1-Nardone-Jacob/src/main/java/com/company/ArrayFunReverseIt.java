package com.company;
import java.util.Arrays;

public class ArrayFunReverseIt {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; ++i){
            arr2[arr2.length-i-1] = arr1[i];
        }

        System.out.println("Initial: " + Arrays.toString(arr1));
        System.out.println("Reversed: " + Arrays.toString(arr2));
    }
}
