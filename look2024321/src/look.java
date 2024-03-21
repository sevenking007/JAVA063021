/**
 * Created with Intellij IDEA.
 * Description:
 * User:ruxia
 * Date:2024-03-21
 * Time:{TIME}
 */
import java.util.Scanner;

/**
 * @Author 12629
 * @Description：
 */
public class Test {

    public static void main(String[] args) {
        /*int[] array = {1,2,3,4,5};

        int[] array2 = new int[]{1,2,3,4,5};
        //长度为5的数字  但是 里面的值 默认为 0
        int[] array3 = new int[5];
        array3[0] = 11;
*/
        //int arr[] = {1,2,3,4,5};

        //int[] array = null;
        //array = new int[]{1,2,3,4};
        //array = {1,2,3,4};//只能和定义写在同一行
        int[] array = {1,2,3,4,5};
        //数组名. length 可以求长度
        System.out.println(array.length);
        System.out.println(array[3]);//越界

        /*int[] array2 = null;
        System.out.println(array2.length);*/

        boolean[] flgs = new boolean[10];


    }


    public static int fac(int n) {
        //if(n == 1) {
        // return 1;
        //}
        return n * fac(n-1);
    }

    public static void func3(int n) {
        if(n < 10) {
            System.out.println(n);
            return;
        }
        func3(n/10);
        System.out.println(n%10);
    }

    public static int sum(int n) {
        if(n == 1) {
            return n;
        }
        return n + sum(n-1);
    }

    public static int func4(int n) {
        if(n < 10) {
            return n;
        }
        //       3 +      func4(12)
        return n % 10 + func4(n/10);
    }

    public static int count = 0;
    public static int fib(int n) {
        if(n == 1 || n == 2) {
            count++;
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static int fib2(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        for (int i = 3; i <= n; i++) {
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static void move(char pos1,char pos2) {
        System.out.print(pos1+" -> "+pos2+" ");
    }

    /**
     *
     * @param n 盘子
     * @param pos1 起始位置
     * @param pos2 中转位置
     * @param pos3 目标位置
     */
    public static void hanio(int n,char pos1,char pos2,char pos3) {
        if(n == 1) {
            move(pos1,pos3);
        }else {
            hanio(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanio(n-1,pos2,pos1,pos3);
        }
    }
    public static void main11(String[] args) {
        hanio(1,'A','B','C');
        System.out.println();
        hanio(2,'A','B','C');
        System.out.println();
        hanio(3,'A','B','C');
        System.out.println();
        hanio(4,'A','B','C');

        /*System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib2(40));
        //System.out.println(count);*/
    }



    public static int add(int a,int b) {
        return a+b;
    }
    public static double add(double a,double b) {
        return a+b;
    }
    public static double add(double a,double b,double c) {
        return a + b + c;
    }
    public static void main5(String[] args) {
        int ret1 = add(1, 2);
        System.out.println(ret1);

        double ret2 = add(1.0,2.0);
        System.out.println(ret2);

        //方法的调用者
        add(1,3);
    }

    public static double func() {
        double sum = 0.0;
        int flg = 1;
        for (int i = 1; i <= 100; i++) {
            sum += 1.0/i * flg;
            flg = -flg;//1  -1  1  -1
        }
        return sum;
    }

    public static void login() {
        int count = 3;
        Scanner in = new Scanner(System.in);
        while (count != 0) {
            System.out.println("请输入你的密码：");
            String password = in.nextLine();
            //if(password == "123456") {
            if(password.equals("hello")) {
                System.out.println("登陆成功！");
                break;
            }else {
                count--;
                System.out.println("你还有 "+count+" 次机会！");
            }
        }
    }

    public static void func2(int n) {
        while (n != 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }

    public static void main3(String[] args) {
        //System.out.println(func());
        func2(123);
    }

    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < n;j++) {
                    if(i == j || (i+j == n-1)) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static int countNine() {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            //个位是不是9
            if(i % 10 == 9) {
                count++;
            }else if(i / 10 == 9) {
                count++;
            }
        }
        return count;
    }
    public static void main1(String[] args) {
        int ret = countNine();
        System.out.println(ret);
    }
}