package one.four;

import java.util.Scanner;

public class swtich的拓展知识点与练习 {
    public static void main(String[] args) {
//        default 的位置和省略
//        如果多个case语句题重复了,那么我们考虑利用case穿透去简化代码
//        JDK12新特性:
//        switch:把有限个数据一一列举出来,让我们任选其一;
        int number = 10;
        switch (number) {
            case 1:
                System.out.println("1");
                break;
            case 10:
                System.out.println("10");
//                break;   这个时候匹配到10 但是没有break 会穿透下去 输出到20 有break的结束
            case 20:
                System.out.println("20");
                break;
            default:   //如果都没有匹配则执行default里的语句  可以写任意位置 习惯写在最后
                System.out.println("nothing");
                break;
//                如果没有写break会case穿透 每一行都执行 直到遇到break或者大括号为止
//              如果运行到那一个case 没有break 且是匹配上的 则会继续穿透下去执行
        }
//        int coco = 1;
//        switch (coco){
//            case 1:
//                System.out.println("一");
//                break;
//            case 2:
//                System.out.println("二");
//                break;
//            case 3:
//                System.out.println("三");
//                break;
//            default:
//                System.out.println("没有这种选项");
//                break;
//            }

        int num = 3;
        switch (num) {
            case 1 -> {    //jdk12新特性写法 case 1 ->{} 里面是执行的内容 不需要写break了
                System.out.println("一");
            }
            case 2 -> {
                System.out.println("二");
            }
            case 3 -> System.out.println("三");   //如果执行的只有一行代码 {}可以省略直接写 default 也可以这样
            default -> {   //default 也是如此
                System.out.println("没有这种选项");
            }
        }

//        1.键盘录入星期
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个整数表示星期");
        int week = sc.nextInt();
        switch (week) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            case 1, 2, 3, 4, 5:     //在简化 相同的 写在一行里
            case 1,2,3,4,5 -> System.out.println("工作日");
                //当语句题重复的时候可以只写一个其他就写case1234序号让穿透下去 不需要break
            case 6, 7 -> System.out.println("休息日");   //需要上面没有break才可以这么写
            default -> System.out.println("没有这个星期");  //在做优化
        }
        Scanner dd = new Scanner(System.in);
        System.out.println("请输入你的选择");
        int choose = dd.nextInt();
        switch (choose){
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预定");
            case 3 -> System.out.println("机票改签");
//            case 4 -> System.out.println("退出服务");   //4和其他都是退出都可以 4就可以优化
            default -> System.out.println("退出服务");
        }





    }
}

