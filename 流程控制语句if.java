package one.four;

import java.util.Scanner;

public class 流程控制语句if {
    public static void main(String[] args) {
//        分支语句 if switch
//    if(关系表达式){
//        语句体
//    }
//        键盘录入女婿酒量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿酒量:");
        int wine = sc.nextInt();
        if (wine > 2) {
            System.out.println("小伙子,不错哟!");
        }
//        如果if只有一句代码可以省略不写
//        int a = 100; //此时有2句代码 定义变量a 然后100赋值给a
        if (wine < 2) System.out.println("haha");

        boolean flag = true;
        if (flag) {    //当判断语句体 (flag = true)这个是复制不是判断 判断是 ==  建议直接写布尔变量类型
            System.out.println("flag的值为true");
        }

        int ranking = 1;
        if (ranking == 1) {
            System.out.println("小红成为了小明的女朋友");
        }

        boolean isLightGreen = false;
        boolean isLightYellow = true;
        boolean isLightRed = false;
        if (isLightGreen){
            System.out.println("gogogo");
        }
        if (isLightYellow){
            System.out.println("wait wait");
        }
        if (isLightRed){
            System.out.println("stop stop");
        }


    }
}
