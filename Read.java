import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;
public class Read {
     static  String b="";
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("Enter the Number");
        int so=value.nextInt();
        if (so<10&&so>=0){
        switch (so){
            case 0:
                b="zero";
                break;
            case 1:
                b="One";
                break;
            case 2:
                b="Two";
                break;
            case 3:
                b="Three";
                break;
            case 4:
                b="Four";
                break;
            case 5:
                b="five";
                break;
            case 6:
                b="Six";
                break;
            case 7:
                b="Seven";
                break;
            case 8:
                b="Eight";
                break;
            case 9:
                b="Nine";
                break;



        }}
        else if(so<20&&so>=10){
            switch (so%10){
                case 0:
                    b="ten";
                    break;
                case 1:
                    b="Elevent";
                    break;
                case 2:
                    b="Twelve";
                    break;
                case 3:
                    b="thirteen";
                    break;
                case 4:
                    b="fourteen";
                    break;
                case 5:
                    b="fifteen";
                    break;
                case 6:
                    b="sixteen";
                    break;
                case 7:
                    b="seventeen";
                    break;
                case 8:
                    b="eightten";
                    break;
                case 9:
                    b="nineteen";
                    break;
            }

            }
        else if (so<100&&so>=20){
            switch (so/10){
                case 2:
                    b="twenty";
                    break;
                case 3:
                    b="thirty";
                    break;
                case 4:
                    b="fourty";
                    break;
                case 5:
                    b="fifty";
                    break;
                    case 6:
                        b="sixty";
                        break;
                case 7:
                    b="seventy";
                    break;
                case 8:
                    b="eightty";
                    break;
                case 9:
                    b="ninety";
                    break;
            }
            switch (so%10){
                case 1:
                    b+="one";
                    break;
                case 2:
                    b+="two";
                    break;
                case 3:
                    b+="three";
                    break;
                case 4:
                    b+="four";
                    break;
                case 5:
                    b+="five";
                    break;
                case 6:
                    b+="six";
                    break;
                case 7:
                    b+="seven";
                    break;
                case 8:
                    b+="eight";
                    break;
                case 9:
                    b+="nine";
                    break;
            }
        }
        else if (so<1000&&so>=100){
            switch (so/100){
                case 1:
                    b="one hundred";
                    break;
                case 2:
                    b="two hundred";
                    break;
                case 3:
                    b="three hundred";
                    break;
                case 4:
                    b="four hundred";
                    break;
                case 5:
                    b="five hundred";
                    break;
                case 6:
                    b="six hundred";
                    break;
                case 7:
                    b="seven hundred";
                    break;
                case 8:
                    b="eight hundred";
                    break;
                case 9:
                    b="nine hundred";
                    break;
            }
            int dem=so%100;
            if (dem>=10&&dem<20){
                switch (dem){
                    case 10:
                        b+="and ten";
                        break;
                    case 11:
                        b+="and twenty";
                        break;
                    case 12:
                        b+="and threety";
                        break;
                    case 13:
                        b+="and fourty";
                        break;
                    case 14:
                        b+="and fifty";
                        break;
                    case 15:
                        b+="and sixty";
                        break;
                    case 16:
                        b+="and sventy";
                        break;
                    case 17:
                        b+="and eighty";
                        break;
                    case 18:
                        b+="and ninety";
                        break;
                    case 19:
                        b+="and ninety";
                        break;

                }
            }
            else {
                switch ((so%100)/10){
                    case 2:
                        b+="and twenlty";
                        break;
                    case 3:
                        b+="and threety";
                        break;
                    case 4:
                        b+="and fourty";
                        break;
                    case 5:
                        b+="and fifty";
                        break;
                    case 6:
                        b+="and sixty";
                        break;
                    case 7:
                        b+="and seventy";
                        break;
                    case 8:
                        b+="and eightty";
                        break;
                    case 9:
                        b+="and ninety";
                        break;






                }
                switch ((so%100)%10){
                    case 1:
                        b+=" one";
                        break;
                    case 2:
                        b+=" two";
                        break;
                    case 3:
                        b+=" three";
                        break;
                    case 4:
                        b+=" four";
                        break;
                    case 5:
                        b+=" five";
                        break;
                    case 6:
                        b+=" six";
                        break;
                    case 7:
                        b+=" seven";
                        break;
                    case 8:
                        b+=" eight";
                        break;
                    case 9:
                        b+=" nine";
                        break;
                }

            }





        }
        System.out.println(+so+":"+"read is:"+b);



}
}
