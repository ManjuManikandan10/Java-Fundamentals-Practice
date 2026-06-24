import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:20");
        int a = sc.nextInt();
        System.out.print("Enter second number:50");
        int b = sc.nextInt();
        System.err.print("Enter operator(+,_,*,/):");
        char op =sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.print("Result = " + (a + b));
                break;
        case '-':
                System.out.print("Result = " +(a - b));
                break;
         case '*':
                System.out.print("Result = " + (a * b));
                break;
        case '/':
                System.out.print("Result = " + (a / b));
                break;
            default:
                System.out.println("invalid operator");
                break;
        }
    }
    
}
