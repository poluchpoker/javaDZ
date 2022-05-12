import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String tick = "";
        str = str.toLowerCase();
        for (int i = 0; i < str.length();i++){
            if (!((str.charAt(i) == 'a') || (str.charAt(i) == 'o') || (str.charAt(i) == 'y') || (str.charAt(i) == 'e') || (str.charAt(i) == 'u') || (str.charAt(i) == 'i'))){
                tick += "." + str.charAt(i);
            }
        }
        System.out.println(tick);
    }
}
