import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int n1 = sc.nextInt();

        System.out.println("Enter Operator : ");
        System.out.println("1-Add\n2-Minus\n3-Multiply\n4-Divide");
        int operator = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int n2 = sc.nextInt();

        int result = 0;

        switch (operator){
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                result = n1 / n2;

            default:
                System.out.println("Entered operator is not valid");
        }
    }
}
