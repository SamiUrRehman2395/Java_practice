import java.util.Scanner;

public class Greet_User {
    public static void main(String[] args) {
        System.out.println("Enter Your Name: ");
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();

        System.out.print("Hello " +name+ ",Have a good day!");
    }
}
