import java.util.Arrays;

/**
 * Created with Intellij IDEA.
 * Description:
 * User:ruxia
 * Date:2024-03-23
 * Time:{TIME}
 */
public class Test01 {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5,6,7,8,9};
   /*    int[] copy =new int[array1.length];
        System.arraycopy(array1,0,copy,0,array1.length);
        String ret=Arrays.toString(copy);
        System.out.println(ret);*/
       /* Arrays.fill(array1,0,2,3);//[0,2)填充了下标0，1.左闭右开不包括下标2的元素。
        for (int x:array1){
            System.out.print(x+" ");
        }*/
        /*for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print(array1[i][j]+" ");//为什么会提示数组越界了呢？
            }
            System.out.println();
        }*/
       /* int[][] array2=new int[2][3];//默认初始值为0
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(array2[i][j]+" ");//这次就没有报错了
            }
            System.out.println();
        }*/
        /*int[][] array2=new int[2][3];
        array2[1][2]=2;
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(array2[i][j]+" ");//这次就没有报错了
            }
            System.out.println();
        }*/
    /*    int[] array2={2,3,45,5};
        boolean flag = Arrays.equals(array1,array2);//比较两个一维数组是否一样
        System.out.println(flag);*/
    }
}
