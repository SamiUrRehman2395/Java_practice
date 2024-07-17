public class VarArgs {

    static int sum (int ...arr){
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 2, 3, and 4 is : " +sum(2,3,4));
        System.out.println("The sum of 2, 3, 4, and 5 is : " +sum(2,3,4,5));
        System.out.println("The sum of 245, 888, 967 and 1045 is : " +sum(245,888,967,1045));
    }
}
