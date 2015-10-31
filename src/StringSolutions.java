/**
 * Created by Abhinav on 10/31/2015.
 */
//This class contains functions for all the string related questions

public class StringSolutions {
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

}
