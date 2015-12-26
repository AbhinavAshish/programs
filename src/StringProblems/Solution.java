package StringProblems;

import java.util.Scanner;
import linkedlist.*;

/**
 * Created by Abhinav on 10/31/2015.
 */
public class Solution {
    public static void main (String[] args){
       /* StringProblems.StringSolutions sol = new StringProblems.StringSolutions();
        boolean result= sol.permutation("great","treag");
        System.out.println(result);
        char [] abc = sol.replacement("Mr John Smith J       ".toCharArray(), 15);
        System.out.println(abc);
        String def  = sol.zip("aabbaaa");
        System.out.println(def);*/


        //aabcccccaaa
        /*System.out.println(" Enter the size of a matrix");
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
*/

        /*System.out.println(" Enter the row and column of a matrix");
        Scanner user_input = new Scanner(System.in);
        int row = user_input.nextInt();
        int column= user_input.nextInt();
        int[][] matrix= sol.inputMatrix(row, column);
        matrix = sol.matrixSetZero(row,column,matrix);
        for(int i=0;i<row;i++) {
            System.out.println("");
            for (int j = 0; j <column; j++) {
                System.out.print(" " + matrix [i][j]);
            }
        }
*/
        /*Scanner userInput = new Scanner(System.in);
        System.out.println(" Enter String 1");
        String s1= userInput.next();
        System.out.println(" Enter String 2");
        String s2= userInput.next();
        boolean resultnew = sol.checkStringRotation(s1,s2);
        System.out.println(resultnew);
*/
        LinkedList list1 = new LinkedList();
        list1.insertAtStart(1);
        list1.insertAtStart(2);
        list1.insertAtStart(3);
        list1.display();
    }

}
