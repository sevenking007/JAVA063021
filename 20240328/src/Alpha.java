/**
 * Created with Intellij IDEA.
 * Description:
 * User:ruxia
 * Date:2024-03-28
 * Time:{TIME}
 */
class Base {
    Base() {
        System.out.print("Base");
    }
}

public class Alpha extends Base {

    public static void main( String[] args ) {
        new Alpha();//1
        //调用父类无参的构造方法
        new Base();//2
    }
}
