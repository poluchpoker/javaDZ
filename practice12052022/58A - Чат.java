import java.util.*;
 
public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase(Locale.ROOT);
        
        System.out.println(searchHello(s) ? "YES" : "NO");
    }
 
    public static boolean searchHello(String s) {
        String hello = "hello";
        int temp = 0;
        
        for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == hello.charAt(temp)) temp++;
        if (temp == 5) return true;
        }
        return false;
    }
}
