import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
public class c1p5sol1{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String linea = sc.nextLine();
        String lineb = sc.nextLine();
        System.out.println(OneAway(linea, lineb));
     }

     public static boolean OneAway(String worda, String wordb) {
         if (worda.length() == wordb.length()) {
             return oneEditReplace(worda, wordb);
         } else if (worda.length() + 1 == wordb.length()) {
             return oneEditInsert(worda, wordb);
         } else if (worda.length() - 1 == wordb.length()) {
             return oneEditInsert(wordb, worda);
         }
         return false;

     }

     public static boolean oneEditReplace(String s1, String s2) {
         boolean foundDiff = false;
         for (int i = 0; i < s1.length(); i++) {
             if (s1.charAt(i) != s2.charAt(i)) {
                 foundDiff = true;
                 if (foundDiff) {
                     return false;
                 }
             }

         }
         return true;
     }

     /* insert a character into s1 to make s1 become s2 */
     public static boolean oneEditInsert(String s1, String s2) {
         int index1 = 0;
         int index2 = 0;
         while (index2 < s2.length() && index1 < s1.length()) {
             if (s1.charAt(index1) != s2.charAt(index2)) {
                 if (index1 != index2) {
                     return false;
                 }
                 index2++;
             } else {
                 index1++;
                 index2++;
             }
         }
         return true;
     }



     }
