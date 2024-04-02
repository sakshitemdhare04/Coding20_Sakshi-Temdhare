import java.util.*;
class Pangram
{

       public static void main(String[] args) {
      String str = "The quick brown fox jumps over the lazy dog";
      if (checkPangram(str))
         System.out.println("It is a Pangram");
      else
         System.out.println("It is Not a Pangram");
   }

   static boolean checkPangram(String str) {
      Set<Character> set = new HashSet<>();

      for (char ch : str.toCharArray()) {
         if (ch >= 'a' && ch <= 'z')
            set.add(ch);

         if (ch >= 'A' && ch <= 'Z') {
            ch = Character.toLowerCase(ch);
            set.add(ch);
         }
      }

      return set.size() == 26;
   }
}
