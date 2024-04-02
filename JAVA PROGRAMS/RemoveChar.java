//remove all character from string except alphabets
import java.util.*;
class RemoveChar
{
    public static void main(String[] args) {
        String s = "@Sa%k+shi,Tem^dha!r#e?>";
        remove(s);
    }
    static void remove(String s) {
        String new1 = "";
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch))
                new1 += ch;
        }
        System.out.println(new1);
    }
 
    
    
}