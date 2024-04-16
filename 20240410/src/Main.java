class Animal {
    public String name;
    public int age;
    public String color;
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void eat() {
        System.out.println(this.name +" 正在吃饭！");
    }
}
class Dog extends Animal{
    public Dog() {
        super("haha",10,"黄色");
        System.out.println(name+" "+age+" "+color);
    }
    public void bark() {
        System.out.println(this.name +" 正在汪汪汪！");
    }
}
class Cat extends Animal{
    public Cat(String name,int age,String color) {
        super(name,age,color);
        System.out.println(name+" "+age+" "+color);
    }
    public void miaomiao() {
        System.out.println(this.name+" 正在喵喵喵！");
    }
}
public class Main{
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println("==============");
        Dog dog2 = new Dog();
    }

}