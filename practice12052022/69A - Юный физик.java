import java.util.Scanner;
 
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int z = 0;
		int x = 0;
		int v = 0;
		
		for (int i = 0; i < n; i++){
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    int c = scanner.nextInt();
		    z += a;
		    x += b;
		    v += c;
		    if ((z == 0) && (x == 0) && (v == 0) && (i == n - 1)){
		        System.out.println("YES");
		    }else if(((z != 0) || (x != 0) || (v != 0)) && (i == n - 1)){
		        System.out.println("NO");
		    }
		    scanner.nextLine();
		}
	}
}
