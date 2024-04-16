import java.util.Arrays;

/**
 * Created with Intellij IDEA.
 * Description:
 * User:ruxia
 * Date:2024-03-21
 * Time:{TIME}
 */
/*第2题/共6题【编程题】
        作业标题(1682)
        奇数位于偶数之前
        作业内容
        调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
        如数组：[1,2,3,4,5,6]
        调整后可能是：[1, 5, 3, 4, 2, 6]*/
public class Test02 {
    public static void trasnform(int[] array){
        for (int i = 0; i < array.length ; i++) {
            if(array[i]%2==0){
                if(i+1<array.length) {
                    if (array[i + 1] % 2 != 0) {
                        int tmp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = tmp;
                    }
                }
            }
        }
        for(int x:array){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6};
        trasnform(array);
    }

}