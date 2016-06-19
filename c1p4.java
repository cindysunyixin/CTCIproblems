import java.util.Scanner;
import java.util.HashSet;
public class c1p4{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(PalindromePermutation(line));
    }
    public static boolean PalindromePermutation(String word) {
        HashSet<Character> s = new HashSet<Character>();
        for (int i = 0; i < word.length(); i++) {
            if (s.contains(word.charAt(i))) {
                s.remove(word.charAt(i));
            } else {
                s.add(word.charAt(i));
            }
        }
        return s.size() <= 1;

        }

    }
