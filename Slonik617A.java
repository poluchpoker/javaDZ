import java.util.Scanner;
import java.lang.Math;
 
public class Main
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int x = scanner.nextInt();
  int z = 0;
  while(x != 0){
    if(x / 5 != 0){
      z += x / 5;
      x = x % 5;
    }
    if(x / 4 != 0){
      z += x / 4;
      x = x % 4;
    }
    if(x / 3 != 3){
      z += x / 3;
      x = x % 3;
    }
    if( x / 2 != 0){
      z += x / 2;
      x = x % 2;
    }
    if(x / 1 != 0){
      z += x / 1;
      x = x % 1;
    }
  }
  System.out.println(z);
    }
}
