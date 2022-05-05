import java.util.Scanner;
 
public class Main
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int n = scanner.nextInt();
	String k;
  String z = "";
	
	for (int i = 0; i <= n; i++){
	    k = scanner.nextLine();
	    if (k.length() > 10){
	        z = k.charAt(0) + "" + (k.length() - 2) + "" + (k.charAt(k.length() - 1));
	        System.out.println(z);
	    }else{
	        System.out.println(k);
	    }
	}
	}
}
