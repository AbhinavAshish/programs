package sorting;

/**
 * Created by Abhinav on 1/7/2016.
 */

public class MergeSort {

    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int size = n1 + n2;
        int[] result = new int[size];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
                k++;
            } else {
                result[k] = arr2[j];
                j++;
                k++;

            }
        }
        while (i < n1) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }

    public static int[] mergeSort(int[] arr, int f, int l) {

        if (f < l) {
            int mid = (f + l) / 2;
            int[] arr1 = mergeSort(arr, f, mid);
            int[] arr2 = mergeSort(arr, mid + 1, l);
            return merge(arr1, arr2);
        } else {
            int[] temp = new int[1];
            temp[0] = arr[f];
            return temp;
        }
    }

    public static void printNum(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int[] arr = {9, 4, 5,6, 3, 7,8};
        arr = mergeSort(arr,0,arr.length-1);
        printNum(arr);
    }

}

