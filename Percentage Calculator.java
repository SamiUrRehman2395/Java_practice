import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int sub1, sub2, sub3, sub4, sub5;
        System.out.println("Enter marks of Subject 1: ");
        sub1 = sc.nextInt();

        System.out.println("Enter marks of Subject 2: ");
        sub2 = sc.nextInt();

        System.out.println("Enter marks of Subject 3: ");
        sub3 = sc.nextInt();

        System.out.println("Enter marks of Subject 4: ");
        sub4 = sc.nextInt();

        System.out.println("Enter marks of Subject 5: ");
        sub5 = sc.nextInt();

        int ans= (sub1+sub2+sub3+sub4+sub5);
        int answer= ans*100;
        int a=answer/500;

        System.out.println(a);

    }
}