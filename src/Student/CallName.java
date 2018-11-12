package Student;

import java.util.*;

public class CallName {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        addStudent(list);
        printStudent(list);
        Map<String, String> res = randomStudent(list);
        System.out.println(res.get("name"));
        System.out.println(res.get("age"));
    }
    //添加
    private static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("存储第"+i+"个学生姓名：");
            String name = sc.next();
            s.setName(name);
            System.out.println("存储第"+i+"个学生年龄：");
            int age = sc.nextInt();
            s.setAge(age);
            list.add(s);
        }
    }
    //打印信息
    private static void printStudent(ArrayList<Student> list){
        for(int i = 0;i<list.size();++i){
            Student s = list.get(i);
            System.out.println("姓名："+s.getName() +",年龄："+s.getAge());
        }
    }
    //随机抽取
    private static  Map<String, String> randomStudent(ArrayList<Student> list){
        Map<String, String> map = new HashMap<String,String>();
        int random_index = new Random().nextInt(list.size());
        Student s = list.get(random_index);
        String age = s.getAge()+"";
        map.put("name",s.getName());
        map.put("age", age);
        return map;
    }

}
