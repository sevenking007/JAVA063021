package demo01;

/**
 * Created with Intellij IDEA.
 * Description:
 * User:ruxia
 * Date:2024-04-16
 * Time:{TIME}
 */
class Animai{
    private String name;
    private int age;

    public Animai(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void eat(){
        System.out.println("正在吃饭");
    }
    void sleep(){
        System.out.println("正在睡觉");
    }
}
class Cat extends Animai{
    public Cat(String name,int age) {
        super(name,age);
    }

    @Override
    void eat() {

        System.out.println(getName()+"正在吃猫粮");
    }

    void bark() {
        System.out.println(getName()+"喵喵叫");
    }
}
class Dog extends Animai{
    public Dog(String name,int age) {
        super(name,age);
    }
    @Override
    void eat() {
        super.eat();
        System.out.println(getName()+"正在吃狗粮");
    }
}
public class Test {
    public static void main(String[] args) {
        Cat cat=new Cat("咪咪",12);
        cat.eat();
        Dog dog=new Dog("大华",11);
        cat.eat();
        Animai animai=new Cat("w",12);
        animai.eat();//创建了一个子类对象，将其当做父类对象来使用。
    }
}
