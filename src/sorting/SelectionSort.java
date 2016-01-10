package sorting;

/**
 * Created by Abhinav on 1/10/2016.
 */
public class SelectionSort {


    public static int[] selectionSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int pos= smallest(arr,i,arr.length-1);
            //System.out.println(pos);
            int temp =arr[pos];
            arr[pos]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

    public static int smallest(int[] arr, int f,int l){
        int temp= arr[f];
        int pos=f;
        for (;f<l;f++){
            if (arr[f+1]<temp){ temp=arr[f+1]; pos=f+1;}
        }
        return pos;
    }

    public static void printNum(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int[] arr = {0,9, 4, 5,6, 3, 7,8,8,1};
        arr = selectionSort(arr);
        //int temp= smallest(arr,0,arr.length-1);
        //System.out.println(temp);
        printNum(arr);
    }

}
