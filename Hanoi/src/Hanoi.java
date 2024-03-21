/**
 * Created with Intellij IDEA.
 * Description:
 * User:ruxia
 * Date:2024-03-21
 * Time:{TIME}
 */
public class Hanoi {
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
    public static void main(String[] args) {
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

}
