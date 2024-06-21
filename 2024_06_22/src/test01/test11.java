package test01;
import java.util.Scanner;
import java.util.Random;

/**
 * Created with Intellij IDEA.
 * Description:
 * User:ruxia
 * Date:2024-06-22
 * Time:{TIME}
 */
public class test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        System.out.println("欢迎来到猜数字游戏!");
        System.out.println("我已经从 1 到 100随机生成了一个数子");
        do {
            System.out.print("请输入你要猜的数字: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess > targetNumber) {
                System.out.println("猜高了! 重新输入.");
            } else if (guess < targetNumber) {
                System.out.println("猜低了! 重新输入");
            } else {
                System.out.println("恭喜你猜对了，这个数字就是：" + targetNumber );
                System.out.println("你一共猜了: " + attempts+"次");
            }
        } while (guess != targetNumber);
        scanner.close();
    }
}
