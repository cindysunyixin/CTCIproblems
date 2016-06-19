import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;
public class c1p5sol1{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String linea = sc.nextLine();
        String lineb = sc.nextLine();
        System.out.println(OneAway(linea, lineb));
     }

     public static boolean OneAway(String worda, wordb) {
         if (worda.length() == wordb.length()) {
             return oneEditReplace(worda, wordb);
         } else if (worda.length() + 1 == wordb.length()) {
             return oneEditInsert(worda, wordb);
         } else if (worda.length() - 1 == wordb.length()) {
             return oneEditInsert(wordb, worda);
         }

     }

     public static boolean oneEditReplace(String s1, String s2) {
         
     }



     }
