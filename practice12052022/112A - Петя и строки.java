import java.util.Scanner;
 
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		int dist = a.length();
		int z = 0;
		
		String t = a.toLowerCase();
		String y = b.toLowerCase();
		
		for (int i = 0; i < dist; i++){
		    int q = t.charAt(i);
		    int w = y.charAt(i);
		    if (q > w){
		        System.out.println("1");
		        break;
		    }else if(q == w){
		        z += 1;
		    }else if(q < w){
		        System.out.println("-1");
		        break;
		    }
		}
		if (dist == z){
		    System.out.println("0");
		}
	}
}
