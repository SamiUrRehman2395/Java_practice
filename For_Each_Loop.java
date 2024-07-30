public class For_Each_Loop {
    public static void main(String[] args) {

        int [] marks = {75, 71, 75, 87, 61};

        for (int i=0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        //in reverse order
        System.out.println("Array in reverse order");
        for (int i= marks.length-1; i >=0 ; i--){
            System.out.println(marks[i]);
        }

        //using for each loop
        System.out.println("Using for-each loop");
        for(int element : marks){
            System.out.println(element);
        }
    }
}
