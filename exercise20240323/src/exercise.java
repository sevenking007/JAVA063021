import java.util.Arrays;

/**
 * Created with Intellij IDEA.
 * Description:
 * User:ruxia
 * Date:2024-03-23
 * Time:{TIME}
 */
//打印数组扩大两倍
public class exercise {
    public static void expen(int[] array){
        //foreach
        for (int x:array){
            System.out.print((2*x)+" ");
        }
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
       expen(array);

    }
}
