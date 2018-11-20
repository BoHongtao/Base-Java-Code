package base;

public class FunctionDemo {
    public static void main(String []args){
        int sum = add(2,3);
        System.out.println(sum);
        sum = add(2,3,4);
        System.out.println(sum);
    }
    public static int add(int x,int y){
        return x+y;
    }
    public static int add(int x,int y,int z){
        return x+y+z;
    }

}
