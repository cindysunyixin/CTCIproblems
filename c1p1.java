import java.util.Scanner;
import java.util.HashMap;
public class c1p1{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(isUnique(line));


     }


     public static boolean isUnique(String input) {

         HashMap<Character,Integer> mp = new HashMap<Character, Integer>();
         for (int i = 0; i < input.length(); i++) {
             char curr = input.charAt(i);
             if (mp.containsKey(curr)) {
                 return false;
             } else {
                 mp.put(curr, 1);
             }

         }
         return true;
     }
}
