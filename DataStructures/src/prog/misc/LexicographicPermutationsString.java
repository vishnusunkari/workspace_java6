package prog.misc;

import java.util.Arrays;

public class LexicographicPermutationsString {
    static int index=0;

    public static void main(String [] args) {
        String givenStr = "AAC";
        char [] givenCharArray = givenStr.toCharArray();
        Arrays.sort(givenCharArray);
        givenStr = String.valueOf(givenCharArray);
        String result = "";

        lexicographicPermOfString(givenStr, result);

    }

    private static void lexicographicPermOfString(String givenStr, String result) {
        if(givenStr.length() == 0){
            System.out.println(result+ ":" + ++index);
            return;
        }
        boolean alphabet[] = new boolean[26];
        for(int i=0; i< givenStr.length(); i++){
            char ch = givenStr.charAt(i);
            String excludedCharString = givenStr.substring(0,i) + givenStr.substring(i+1);
            if(alphabet[ch - 'A'] == false) {
                lexicographicPermOfString(excludedCharString, result + Character.toString(ch));
            }
            alphabet[ch - 'A'] = true;
            //lexicographicPermOfString(excludedCharString, result + Character.toString(ch));
        }
    }

}
