import javax.xml.crypto.dsig.Transform;
import java.util.Arrays;

/**
 * Created with Intellij IDEA.
 * Description:
 * User:ruxia
 * Date:2024-03-21
 * Time:{TIME}
 */
/*第1题/共6题【编程题】
        作业标题(1705)
        改变原有数组元素的值
        作业内容
        实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
        例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}*/
public class Test01 {
    public static void transform(int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]*2+" ");
        }
    }
    public static void main(String[] args) {
        int[] array ={1,2,3};
        transform(array);
    }
}
