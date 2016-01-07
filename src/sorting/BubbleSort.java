package sorting;

//*
//        *Created by Abhinav on 1/7/2016.


public class BubbleSort {

    public static void printNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] bubbleSort(int arr[]) {

        for (int k=arr.length-1; k>0;k--){
            for (int j = 0; j <= k - 1; j++) {
                //System.out.println(j);
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        return arr;
    }

    public static void main(String args[]) {
        int[] arr = {9, 4, 5,6, 3, 7,8};
        arr = bubbleSort(arr);
        printNum(arr);
    }
}
