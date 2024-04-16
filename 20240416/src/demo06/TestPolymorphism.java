package demo06;

/**
 * Created with Intellij IDEA.
 * Description:
 * User:ruxia
 * Date:2024-04-16
 * Time:{TIME}
 */
public class TestPolymorphism {
    public static void main(String[] args) {
        // 以多态方式分别实例化子类对象并调用eat()方法
        /********* begin *********/
        Cat cat=new Cat();
        cat.eat();
        Dog dog=new Dog();
        dog.eat();
        Lion lion=new Lion();
        lion.eat();
        /********* end *********/
    }
}
// Animal类中定义eat()方法
class Animal {
    /********* begin *********/
    void eat(){}
    /********* end *********/
}

// Dog类继承Animal类 复写eat()方法
class Dog extends Animal {
    /********* begin *********/
    @Override
    void eat() {
        System.out.println("eating bread...");
    }
    /********* end *********/
}

// Cat类继承Animal类 复写eat()方法
class Cat extends Animal {
    /********* begin *********/
    @Override
    void eat() {
        System.out.println("eating rat...");
    }
    /********* end *********/
}

// Lion类继承Animal类 复写eat()方法
class Lion extends Animal {
    /********* begin *********/
    @Override
    void eat() {
        System.out.println("eating meat...");
    }
    /********* end *********/
}
