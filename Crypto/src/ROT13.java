import java.util.Arrays;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    public int value;

    ROT13(Character cs, Character cf) {
        if(cs - cs>0){
            value = cf -cs;
        }
        else{
            value = cs - cf;
        }
    }

    ROT13() {
        value = 13;
    }


    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder returnString = new StringBuilder();

        for(int i=0;i<text.length();i++){
            char current = text.charAt(i);
            if(current >= 'a' && current <= 'm'){
                current += value;
            }
            else if(current >= 'A' && current <= 'M'){
                current += value;
            }
            else if(current >= 'n' && current <= 'z'){
                current -= value;
            }
            else if(current >= 'N' && current <= 'Z'){
                current -= value;
            }
            returnString.append(current);
        }
        return returnString.toString();
    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        return s.substring(s.indexOf(c)) + s.substring(0,s.indexOf(c));
    }

}
