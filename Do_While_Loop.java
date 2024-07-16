import java.util.Scanner;

public class Do_While_Loop {
    public static void main(String[] args) {
                Scanner sc = new Scanner (System.in);
        int k=1;
        do{
            System.out.println("Input your number");
            k = sc.nextInt();
            System.out.print("here is your number : ");
            System.out.println(k);
        }while(k<=10);
        System.out.println("End");
    }
}
