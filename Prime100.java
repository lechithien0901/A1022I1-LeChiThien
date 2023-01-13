package ss02_java_for_loop.Menu;

public class Prime100 {
    public static void main(String[] args) {
        int n=2;
        while(n<=100){
            boolean check=true;
            int i=2;
            while (i<Math.sqrt(n)){
                if (n%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(n);

            }
            n++;
        }
    }
}
