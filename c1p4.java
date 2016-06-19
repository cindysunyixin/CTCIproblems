import java.util.Scanner;
import java.util.HashMap;
public class c1p4{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(PalindromePermutation(line));
    }
    public static boolean PalindromePermutation(String input) {
        String word = input.trim();
        char[] letters = word.toCharArray();
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for (char a: letters) {
            count.put(a, 1);
            if (count.containsKey(a)) {
                count.put(a, count.get(a) + 1);
            }
        }
        for (char b: count.keySet()) {
            if (count.get(b) % 2 == 0) {
                return true;
            } else {
                
            }
        }

    }




}
