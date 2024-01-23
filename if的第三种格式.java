package one.four;
//coco
//git update
import java.util.Scanner;
//pull
public class if的第三种格式 {
    public static void main(String[] args) {
//        if(关系表达){
//            语句体1;
//        }else if (关系表达2){
//            语句提2;
//        }else{
//            语句提n+1
//        }

//从上往下判断 只有一个为真,就执行对应的语句题 如果所有判断为假,则执行else语句体

//hhaha  k
//        1.
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入小明的成绩");
        int score = sc.nextInt();
//        根据不同的考试成绩,给出不同奖励
        //对异常数据进行判断校验
//        0-100之间
        if (score >= 0 && score <= 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("送自行车");
            } else if (score >= 90 && score <= 94) {
                System.out.println("游乐园玩一天");
            } else if (score >= 80 && score <= 89) {
                System.out.println("变形金刚");
            } else {
                System.out.println("揍一顿");
            }
        } else {
            System.out.println("假分数");  //对应最上面的if
        }

        //商品的价格
        int price = 1000;
//        录入级别
        Scanner vip = new Scanner(System.in);
        System.out.println("输入你的会员等级");
        int vipLevel = vip.nextInt();

        if (vipLevel > 0 && vipLevel < 4) {
            if (vipLevel == 1) {
                System.out.println("实际支付的钱为:" + (price * 0.9));  //当vip=1打9这 要加括号运算
            } else if (vipLevel == 2) {
                System.out.println("实际支付的钱为:" + (price * 0.8));
            } else if (vipLevel == 3) {
                System.out.println("实际支付的钱为:" + (price * 0.7));
            } else {
                System.out.println("不打折,原价:" + price);
            }
        } else {
            System.out.println("抓起来");
        }

        //红绿灯案例
        boolean isLightGreen = true;
        boolean isLightYellow = false;
        boolean isLightRed = false;
        if (isLightGreen) {
            System.out.println("gogogo");
        } else if (isLightYellow) {
            System.out.println("wait wait");
        } else if (isLightRed) {
            System.out.println("stop stop");
        }


    }
}
