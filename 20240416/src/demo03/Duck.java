package demo03;

/**
 * Created with Intellij IDEA.
 * Description:
 * User:ruxia
 * Date:2024-04-16
 * Time:{TIME}
 */
public class Duck extends Animal implements IRunning,ISwiming{
    public Duck(String name){
        super(name);
    }

    @Override
    public void running() {
        System.out.println(name+"在跑步");
    }

    @Override
    public void swiming() {
        System.out.println(name+"在游泳");
    }
}
