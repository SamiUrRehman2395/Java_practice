public class Method_using_object_creation {

    int logic (int x, int y) {
        int z;
        if(x>y){
            z= x+y;
        } else {
            z= (x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a2=3;
        int b2=6;
        Method_using_object_creation obj= new Method_using_object_creation();
        int c2= obj.logic(a2,b2);
        System.out.println(c2);
    }
}
