/**
 * Created with Intellij IDEA.
 * Description:
 * User:ruxia
 * Date:2024-03-21
 * Time:{TIME}
 */
import java.util.Arrays;

/**
 * @Author 12629
 * @Description：
 */
public class Test {

    /**
     * 1. 二维数组的真正表示形式
     * 2. 不规则二维数组
     * @param args
     */
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};

        int[][] array2 = new int[][]{{1,2,3},{4,5,6}};

        int[][] array3 = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main66(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};

        boolean flg = Arrays.equals(array1,array2);
        System.out.println(flg);

        int[] array3 = new int[10];

        //填充  可以局部填充
        Arrays.fill(array3,1,3,99);

        System.out.println(Arrays.toString(array3));

    }

    public static void main55(String[] args) {
        int[] array = {1,2,3,4,5};

        int[] copy = Arrays.copyOfRange(array,1,3);//[1,3)

        System.out.println(Arrays.toString(copy));

    }
    public static void main44(String[] args) {
        int[] array = {1,2,3,4,5};

        int[] copy = new int[array.length];

        System.arraycopy(array,0,copy,0,array.length);

        System.out.println(Arrays.toString(copy));

    }

    public static void main33(String[] args) {
        int[] array = {1,2,3,4,5};

        /**
         * 参数1：你要拷贝的数组
         * 参数2：代表你要拷贝的数组的长度
         *       此时 这个方法 可以看做是扩容
         */
        int[] copy = Arrays.copyOf(array,array.length*2);

        System.out.println(Arrays.toString(copy));

    }

    public static int[] copy1(int[] array) {
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        return tmp;
    }

    public static void main22(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] copy = copy1(array);
        System.out.println(Arrays.toString(copy));
        System.out.println("=====");

        //以下的方式 不叫拷贝
        int[] array2 = {1,2,3,4,5};
        int[] copy2 = array2;
        System.out.println(Arrays.toString(copy2));

    }
    /**
     * 把数组 转为字符串
     * @param array
     * @return
     */
    public static String myToString(int[] array) {
        if(array == null) {
            return "null";
        }
        if(array.length == 0) {
            return "[]";
        }
        String ret = "[";
        //
        for (int i = 0; i < array.length; i++) {
            ret = ret + array[i];
            if(i != array.length-1) {
                ret = ret + ", ";
            }
        }
        ret += "]";
        return ret;
    }

    /**
     *
     * @param array
     * @param key
     * @return 找到返回数组中当前数据的下标  没找到返回-1  数组没有负数的下标
     */
    public static int findNum(int[] array,int key) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    //二分查找
    public static int binarySearch(int[] array,int key) {
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            //int mid = (left+right) / 2;
            //int mid = (left+right) >>>1 ;
            int mid = left + ((right - left) >>> 1) ;
            if(array[mid] < key) {
                left = mid+1;
            }else if(array[mid] > key) {
                right = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void bubbleSort(int[] array) {
        //i 表示趟数
        for (int i = 0; i < array.length-1; i++) {
            boolean flg = false;
            // -i 代表每一趟都比上一趟少1次
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg == false) {
                break;
            }
        }
    }

    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length-1;
        while (left < right) {
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }


    public static void main10(String[] args) {
        int[] array = {1,21,3,4,10,4,11};
        reverse(array);

        //bubbleSort(array);
        //Arrays.sort(array);//[1,4)

        String ret = Arrays.toString(array);
        System.out.println(ret);

        int index = Arrays.binarySearch(array,31);
        System.out.println(index);



        /**/


        /*int index = binarySearch(array,3);
        System.out.println(index);*/


        /* int index = findNum(array,14);
        System.out.println(index);
       String ret = myToString(array);
        System.out.println(ret);*/
    }

    public static void main5(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]+" ");
        }
        System.out.println();
    }


    public static void Func(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array1[i] * 2;
        }
    }


    public static int[] Func2(int[] array1) {

        int[] tmp = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            tmp[i] = array1[i] * 2;
        }

        return tmp;
    }

    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] retArray = Func2(array);

        String ret = Arrays.toString(retArray);
        System.out.println(ret);

        ret = Arrays.toString(array);
        System.out.println(ret);
    }



    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5};
        array = new int[10];
        array = new int[20];
        array = new int[30];
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        //for each  遍历数组 把每个元素 存储到x里面
        for(int x : array) {
            System.out.print(x+" ");
        }
        System.out.println();

        //借助Java原生的方法  将 指定的数组  以字符串的形式 进行输出
        String ret = Arrays.toString(array);
        System.out.println(ret);

    }

    public static void main1(String[] args) {
         /*int[] array = {1,2,3,4,5};
       int[] array2 = new int[]{1,2,3,4,5};
        int[] array3 = new int[10];

        System.out.println(array.length);

        System.out.println(array[0]);*/

        int[] array4 = null;//array4这个引用 不指向任何的对象
        System.out.println(array4.length);

        System.out.println(array4[0]);

    }
}