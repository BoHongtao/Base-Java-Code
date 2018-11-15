package base;

import java.util.Random;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a number");
        int n = sc.nextInt();
        System.out.println("you input is "+ n);

        System.out.println("please input a string");

        //这里需要注意scanner遇到空格结束
        String str = sc.next();
        System.out.println("you input is "+ str);
        Random rd = new Random();

        System.out.println("create a random number above 100:"+ rd.nextInt(100));
        System.out.println("create a random number (0~1):"+ rd.nextDouble());

    }
}
