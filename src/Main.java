
import java.util.Scanner;
public class Main {
    static  int power(int a,int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;

        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the base number  :");
        int a = scan.nextInt();
        System.out.print("enter the power number  :");
        int b = scan.nextInt();

        System.out.println("üs alma :" + power(a,b));

    }
}
