package abstractDemo;

public class Show extends abstractDemo {
    public static void main(String[] arus){
        Show show = new Show();
        show.show1();
    }
    @Override
    public void show1() {
        System.out.println("show1");
    }
}
