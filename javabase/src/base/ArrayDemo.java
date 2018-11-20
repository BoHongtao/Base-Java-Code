package base;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] x;
        x = new int[10];
        //or int[] x = new int[10];
        int i;
        for(i = 0;i<x.length;++i){
            x[i] = i;
        }
        show(x);
        System.out.println(sum(x));
    }
    //show array element
    private static void show(int [] array){
        for(int i =0; i<array.length;++i){
            System.out.println(array[i]);
        }
    }
    //sum
    private static int sum(int [] array){
        int sum = 0;
        for(int i =0; i<array.length;++i){
            sum +=array[i];
        }
        return sum;
    }
}
