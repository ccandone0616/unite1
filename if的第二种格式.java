package one.four;

import java.util.Scanner;

public class if的第二种格式 {
    public static void main(String[] args) {
//      if(关系表达){
//          语句1;
//      }else{
//          语句体2;
//      }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你身上的钱");
        int money = sc.nextInt();
        if (money >= 100) {
            System.out.println("吃网红餐厅");
        } else {
            System.out.println("吃经济实惠的沙县小吃");
        }

        //第二题
        Scanner mi = new Scanner(System.in);
        System.out.println("请录入一个整数表示支付的钱");
        int money1 = mi.nextInt();

        if (money1 >= 600) {
            System.out.println("支付成功");
        } else {
            System.out.println("支付失败");
        }

//        第三题
        Scanner set = new Scanner(System.in);
        System.out.println("请输入您的座位号");
        int setnum = set.nextInt();

        //
//        只有当setnum 在0 - 100之间才是有效的;
        if (setnum > 0 && setnum <= 100) {   //坐除了限制 只有当大于0 小于等于100才能进入
            if (setnum % 2 == 1) {  //判断奇数
                System.out.println("坐左边");
            } else {
                System.out.println("坐右边");
            }
        }


    }
}
