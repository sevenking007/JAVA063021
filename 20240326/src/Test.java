import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Description:
 * User:ruxia
 * Date:2024-03-26
 * Time:{TIME}
 */
/*欢迎使用中国人民银行ATM取款机
        输入取款金额：
        剩余金额：900，是否继续（'1'：结束，'2'：继续）：
        输入取款金额：
        目前余额：900无法满足您的取款需求！
        输入取款金额：
        剩余金额：800，是否继续（'1'：结束，'2'：继续）：
        取款结束！*/
public class Test {
    public static void main(String[] args) {
        System.out.println("欢迎使用中国人民银行ATM取款机");
        int sum = 1000;
        int chose = 1;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("输入取款金额：");

            int input = scan.nextInt();;
            if(input>sum){
                System.out.println("目前余额："+sum+"无法满足您的取款需求！");
                continue;
            }else{
                sum-=input;
                System.out.println("剩余金额："+sum+"，是否继续（'1'：结束，'2'：继续）：");
                int input2 = scan.nextInt();
                if(input2==2){
                    chose=2;
                }else{
                    System.out.println("取款结束！");
                    break;
                }
            }
        }
    }
}
