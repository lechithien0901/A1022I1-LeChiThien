package ss01_introduction_java.bai_tap;

import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        System.out.print("enter your name:");
        String name=sv.nextLine();
        System.out.println("hello:"+name);
}
}