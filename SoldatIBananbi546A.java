import java.util.Scanner;
import java.lang.Math;
 
public class Main
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int price = scanner.nextInt();
  int amount = scanner.nextInt();
  int c = scanner.nextInt();
  int k = 0;
 
  for (int i = 1; i <= c; i++){
    k += i * price;
  }
  if (k > amount){
    System.out.println(k - amount);
  }else{
    System.out.println("0");
  }
    }
}
