package deom2;

/**
 * Created with Intellij IDEA.
 * Description:
 * User:ruxia
 * Date:2024-04-10
 * Time:{TIME}
 */
class Animal{
    public String name;
    public int age;
    public void eat(){
        System.out.println(name+"正在吃东西");
    }
}
class Dog extends Animal{

    public void eat(){
        System.out.println(name+"正在吃狗粮");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println(name+"正在吃猫粮");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog =new Dog();
        dog.name="jj";
        dog.age=12;
        dog.eat();
    }
}
