import java.util.Scanner;

/**
 * Created by Abhinav on 10/31/2015.
 */
public class Solution {
    public static void main (String[] args){
        StringSolutions sol = new StringSolutions();
        boolean result= sol.permutation("great","treag");
        System.out.println(result);
        char [] abc = sol.replacement("Mr John Smith J       ".toCharArray(), 15);
        System.out.println(abc);
        String def  = sol.zip("aabbaaa");
        System.out.println(def);
        //aabcccccaaa
        System.out.println(" Enter the size of a matrix");
        Scanner user_input = new Scanner(System.in);
        int size = user_input.nextInt();

        System.out.println(size);
        int[][] matrix= sol.inputmatrix(size);
        matrix=sol.matrixrotation(matrix,size);
        for(int i=0;i<size;i++) {
            System.out.println("");
            for (int j = 0; j <size; j++) {
                System.out.print(" " + matrix [i][j]);
            }
        }


    }

}
