package one.four;

import java.util.Scanner;

public class switch语句 {
    public static void main(String[] args) {
//首先执行表达式的值;依次和case后面的值比较,如果就对应的值就执行,遇到break就会结束,如果都不匹配则执行default语句然后结束switch
//    switch(表达式){
//        case 值1:  case后面跟的是要和表达式用来比较的值(被匹配的值) case后面只能是字面量,不能是变量
//            语句体1;
//            break;
//        case 值2:
//            语句题2;
//            break;;
//        default:
//            语句题n+1;
//            break;

//        记得要写break 然后case后面没有括号
        String noodles = "龙虾面";
        switch(noodles){
            case "兰州拉面":
                System.out.println("吃拉面");
                break;
            case "武汉热干面":
                System.out.println("吃热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃油泼面");
                break;
            default:
                System.out.println("吃泡面");
                break;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("今天星期几");
        int week = sc.nextInt();

        switch (week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }




//    }



        System.out.println();
    }
}
