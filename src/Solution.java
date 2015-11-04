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
    }

}
