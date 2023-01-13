package ss02_java_for_loop.Menu;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int n=2;
        int count=0;
        while(count!=20){
            boolean check=true;
            int i=2;
            while(i<=Math.sqrt(n)){
            if (n%i==0){
                check=false;
                break;
            }
            i++;
        }
        if ((check)){
            System.out.println(n+"\t");
            count++;
        }
        n++;
        }


    }

}
