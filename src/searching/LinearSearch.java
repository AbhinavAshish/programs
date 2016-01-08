package searching;

/**
 * Created by Abhinav on 1/8/2016.
 */
public class LinearSearch {
    public static void linearSearch(int[] array, int val) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            if (array[i] == val) {
                System.out.println("The value is present at " + (i + 1));
                return;
            }
        }
        System.out.println("The value is not found");

    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 5, 6, 7, 4, 5};
        linearSearch(array, 3);

    }


}
