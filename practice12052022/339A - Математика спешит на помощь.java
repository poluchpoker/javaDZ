import java.util.Scanner;
import java.util.*;
 
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String n = scanner.nextLine();
		List<Integer> mass = new ArrayList<Integer>();
		
		String z = "";
		
		for (int i = 0; i < n.length(); i++){
		    int q = n.charAt(i);
		    if (q != 43){
		        if (q == 49){
		            q = 1;
		            mass.add(q);
		        }else if (q == 50){
		            q = 2;
		            mass.add(q);
		        }else if (q == 51){
		            q = 3;
		            mass.add(q);
		        }
		    }
		}
		Collections.sort(mass);
		
		for (Integer i : mass){
		    z += i + "+";
		}
		System.out.println(z.substring(0, z.length() - 1));
	}
}
