package InterfaceDemo;

public class Show implements InterfaceDemo {
    public static void main(String [] args){
        Show show = new Show();
        show.show1();
        show.show2();
    }

    @Override
    public void show1() {
        System.out.println("show1");
    }

    @Override
    public void show2() {
        System.out.println("show2");
    }
}
