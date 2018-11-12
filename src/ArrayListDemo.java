import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //create a arraylist
        ArrayList<String> list = new ArrayList<String>();
        //add element
        list.add("stu1");
        list.add("stu2");
        list.add("stu3");
        list.add("stu4");
        System.out.println(list.size());
        //常用get set remove clear
        for (int i = 0 ; i < list.size() ;++i){
            System.out.println(list.get(i));
        }
    }
}
