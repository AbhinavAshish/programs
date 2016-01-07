package sorting;

import java.util.ArrayList;

/**
 * Created by Abhinav on 1/7/2016.
 */

public class InsertionSort {


    public static void printNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] insertionSort(int[] arr) {
        int key = 1;
        while (key <= arr.length - 1) {
            int x = arr[key];
            int i = key - 1;
            while (i > -1 && arr[i] > x) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = x;
            key++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 7, 8, 4, 6, 7,0,7,66,98};
        arr=insertionSort(arr);
        printNum(arr);


    }

}

