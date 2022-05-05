import java.util.Scanner;
import java.lang.Math;
 
public class Main
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int  n = scanner.nextInt();
  int m = scanner.nextInt();
  int a = scanner.nextInt();
  long x;
  long y;
 
  x = n / a;
  y = m / a;
  if (n % a != 0){
    x += 1;
  }
  if (m % a != 0){
    y += 1;
  }
  System.out.println(x * y);
    }
}
