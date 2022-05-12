import java.util.Scanner;
 
public class Main
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int n = scanner.nextInt();
  int k = 0;
    
	for (int i = 0; i < n; i++){
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    if (a + b + c > 1){
      k += 1;
    }
    scanner.nextLine();
  }
  System.out.println(k);
    }
}
