import java.util.Arrays;
import java.util.Scanner;

/*
*
        *Created by Abhinav on 10/31/2015.
*/


//This class contains functions for all the string related questions

public class StringSolutions {
    //Checking if a string contains all unique characters
    public boolean unique(String input) {
        if (input.length() > 26) {
            return false;
        } else {
            int i, j;
            for (i = 0; i < input.length(); i++) {
                for (j = i + 1; j < input.length(); j++) {
                    if (input.charAt(i) == input.charAt(j)) {
                        return false;
                    }
                }
            }
            return true;
        }
    }


    // Function to check if two strings are permutaions of each other
    //sort both of the strings and macth


    public boolean permutation(String string1, String string2) {
        char[] charArray1 = new char[string1.length()];
        char[] charArray2 = new char[string2.length()];
        charArray1 = string1.toCharArray();
        charArray2 = string2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        string1 = new String(charArray1);
        string2 = new String(charArray2);
        //System.out.println(string1);
        //System.out.println(string2);
        if (string1.equals(string2)) {
            return true;
        } else {
            return false;
        }
    }

    //functions to replace space with %20

    public char[] replacement(char[] str, int length) {

        int numspaces = count(str, length);
        char[] retrunstring = new char[length + numspaces * 2];
        System.out.println(str);
        int counter = 0;
        for (int i = 0; i < length; i++) {

            if (str[i] == ' ') {
                retrunstring[counter] = '%';
                retrunstring[counter + 1] = '2';
                retrunstring[counter + 2] = '0';
                counter += 3;
                //System.out.println(retrunstring);
                //System.out.println(str[i]);
            } else {
                retrunstring[counter] = str[i];
                counter++;
                //System.out.println(retrunstring);
                //System.out.println(str[i]);
            }
        }
        System.out.println(retrunstring);
        return retrunstring;


    }


    //function to count number of spaces Solution ends here

    public int count(char[] str, int length) {
        int numberofspaces = 0;
        for (int i = 0; i < length; i++) {
            if (str[i] == ' ') {
                //System.out.println(str[i]);
                numberofspaces++;
            }

        }
        return numberofspaces;

    }

    //Solution to question 4 ends here

    //Solution to problem 5 starts here

    public int charnum(char[] str, int pos, int length) {
        int i = pos;
        int counter = 0;
        if (i < length - 1) {
            if (str[i] == str[i + 1]) {
                counter = counter + 1;
                counter = counter + charnum(str, pos + 1, length);
                return counter;

            } else {
                return counter;

            }
        } else {
            return counter;
        }
    }

    public String zip(String str) {
        int num, j = 0;
        //String str="aabcccccaaa";
        char[] result = new char[20];
        char[] abc = str.toCharArray();
        int strlength = str.length();
        for (int i = 0; i < strlength; i++) {
            result[j] = abc[i];
            num = charnum(abc, i, strlength);
            result[j + 1] = Integer.toString(num + 1).charAt(0);
            //System.out.println(result);
            //System.out.println(num);
            j = j + 2;
            i = i + num;
        }

        String first = new String(result);
        first = first.trim();
        String second = new String(str);

        if (first.length() < second.length())
            return first;
        else
            return second;
    }


//Solution to question number 6

    public int[][] inputmatrix(int size) {
        int i, j;
        Scanner user_input = new Scanner(System.in);


        int[][] matrix = new int[size][size];
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.println("Enter the value for row " + (i + 1) + "column" + (j + 1));
                matrix[i][j] = user_input.nextInt();
            }
        }
        return matrix;
    }

    // Function to change the matrix 90 degrees
    public int[][] matrixrotation(int[][] matrix, int size) {

        int i = 0, j = 0;

        int[][] temp = new int[size][size];
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                temp[i][j] = matrix[i][j];
            }
        }

        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                matrix[j][size - (i + 1)] = temp[i][j];
            }
        }

        return matrix;

    }

    //Solution to question 7 sETTING rows and columns as zero


    public int[][] inputMatrix(int row, int column) {
        int i = 0, j = 0;
        int[][] matrix = new int[row][column];
        Scanner userInput = new Scanner(System.in);
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.println(" Enter the values for" + (i + 1) + (j + 1));
                matrix[i][j] = userInput.nextInt();

            }
        }
        return matrix;
    }

    public int[][] matrixSetZero(int row, int column, int[][] matrix) {
        int i = 0, j = 0;
        int countRow, countColumn;
        Scanner userInput = new Scanner(System.in);
        int[] rowNumber = new int[row];
        int[] colNumber = new int[column];
        countRow = 0;
        countColumn = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (matrix[i][j] == 0) {
                    rowNumber[countRow] = i;
                    colNumber[countColumn] = j;
                    countRow += 1;
                    countColumn += 1;

                }

            }
        }

        for (i = 0; i < countRow; i++) {
            for (j = 0; j < column; j++) {
                //System.out.println(rowNumber[i] +" " + j );
                matrix[rowNumber[i]][j] = 0;

            }
        }

        for (j = 0; j < countColumn; j++) {
            for (i = 0; i < row; i++) {
                //System.out.println(i+" " + colNumber[j] );
                matrix[i][colNumber[j]] = 0;

            }
        }

        return matrix;

    }


    // Solution for question 1.8 . STring 1 is a rotation for string 2

    public boolean checkStringRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.println(" Strings length don't match");
            return false;

        } else {
            if ((s1 + s1).indexOf(s2) != -1) {
                System.out.println(" Strings match");
                return true;
            } else {
                System.out.println(" Strings don't match");
                return false;
            }

        }
        }
    }


