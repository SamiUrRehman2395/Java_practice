//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    static int logic (int x, int y) {
        int z;
        if(x>y){
            z= x+y;
        } else {
            z= (x+y)*5;
        }
        return z;
    }



    public static void main(String[] args) {

       //(1) Greeting user

       // System.out.println("Enter Your Name: ");
        //Scanner sc = new Scanner(System.in);
        //String name= sc.nextLine();

        //System.out.print("Hello " +name+ ",Have a good day!");



        //(2) Check Weather Int or not

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter a value: ");
//
//        if(sc.hasNextInt()){
//            int value = sc.nextInt();
//            System.out.println("Entered value is integer: " + value );
//
//        } else {
//            System.out.println("Entered value is not integer.");
//        }



        //(3)For Loop Pattern
//        for(int i=0;i<=5;i++){
//            for(int j=5;j>=i;j--){
//                System.out.print("* ");
//            }
//            System.out.println("\n");
//
//        }



        //(4) Table of 2

//        for(int i=1;i<=10;i++){
//
//            System.out.println(2*i);
//
//        }




        //(5) Array call

//        int [] marks={75,71,75,61,87};
//        for(int i=0;i< marks.length;i++){
//            System.out.println(marks[i]);
//        }




        // (6) Methods
        // method was put before main above in this code

//        int a=5;
//        int b=7;
//        int c= logic(a,b);
//        System.out.println(c);


        // example 2
//
//        int a1=7;
//        int b1=5;
//        int c1= logic(a1,b1);
//
//
//        System.out.println(c1);



        // (7) Method using by another method

//        int a2=3;
//        int b2=6;
//        Main obj= new Main();
//        int c2= obj.logic(a2,b2);
//        System.out.println(c2);




    }
}