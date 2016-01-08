package searching;

import java.util.Arrays;
/**
 * Created by Abhinav on 1/8/2016.
 */
public class BinarySearch {

    public static void binarySearch(int[] array,int val,int max,int min){

    int mid = (max+min)/2;
    if (val<array[mid]){
        max=mid-1;
        binarySearch(array,val,max,min);
    }else if (val>array[mid]) {
        min = mid + 1;
        binarySearch(array,val,max,min);
    }else{
        System.out.println("The value is present at " + ( mid +1));
    }


    }

    public static void main(String[] args) {

        int[] array = {1, 2,3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(array);

        binarySearch(array,1,array.length-1,0);
    }


}
