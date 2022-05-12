import java.util.Scanner;
 
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int count = 0;
		
		for (int i = 0; i < n; i++){
		    String x = scanner.next();
		   if (x.charAt(1) == '+'){
		       count += 1;
		   }else{
		       count -= 1;
		   }
		}
		System.out.println(count);
	}
}
