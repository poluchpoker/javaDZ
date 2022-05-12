import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < k; i++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            if(n - m >= 2){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
