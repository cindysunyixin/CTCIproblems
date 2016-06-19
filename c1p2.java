import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;
public class c1p2{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String linea = sc.nextLine();
        String lineb = sc.nextLine();
        System.out.println(checkPermutation(linea, lineb));
     }

     public static boolean checkPermutation(String word1, String word2) {
         char[] a1 = word1.toCharArray();
         char[] a2 = word2.toCharArray();
         if (word1.length()!= word2.length()){
             return false;
         }
         Map<Character, Integer> mapa = new HashMap<Character, Integer>();
         Map<Character, Integer> mapb = new HashMap<Character, Integer>();
         for (char a: a1) {
             mapa.put(a, 1);
             if (mapa.containsKey(a)) {
                 mapa.put(a,mapa.get(a) + 1);
             }
         }
         for (char b: a2) {
             mapb.put(b, 1);
             if (mapb.containsKey(b)) {
                 mapb.put(b,mapb.get(b) + 1);
             }
         }
         if (mapa.size() != mapb.size()) {
             return false;
         }
         for (char c : mapa.keySet()) {
             if (!mapb.containsKey(c) || mapa.get(c) != mapb.get(c)) {
                 return false;
             }
         }
         return true;

    }


}
