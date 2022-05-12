import java.util.Scanner;
import java.lang.Math;
 
public class Main
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int n = scanner.nextInt();
  int k = scanner.nextInt();
  int z = 0;
  int[] numbers = new int[n];
 
  for (int i = 0; i < n; i++){
    numbers[i] = scanner.nextInt();
  }
 
  if (numbers[0] == 0){
    z = 0;
  }
 
  for (int i = 0; i < n; i++){
    if (numbers[i] >= numbers[k - 1] && numbers[i] > 0){
      z += 1;
    }
  }
  System.out.println(z);
    }
}
