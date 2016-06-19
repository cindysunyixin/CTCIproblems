import java.util.Scanner;
import java.util.HashMap;
public class c1p3{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int length = sc.nextInt();
        System.out.println(URLify(line, length));


    }

    public static String URLify(String word, int length) {
        return word.replaceAll(" ", "%20");
    }

}
