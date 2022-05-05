import java.util.Scanner;
import java.lang.Math;
 
public class Main
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String slovo = scanner.nextLine();
  String a = slovo.charAt(0) + "";
 
  System.out.println(a.toUpperCase() + slovo.substring(1, slovo.length()));
    }
}
