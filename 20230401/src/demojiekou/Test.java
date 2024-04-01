/*
package demojiekou;

*/
/**
 * Created with Intellij IDEA.
 * Description:
 * User:ruxia
 * Date:2024-04-01
 * Time:{TIME}
 *//*

package demomoreinher;

*/
/**
 * @Author 12629
 * @Description：
 *//*

        package demo4;

import java.util.Arrays;

*/
/**
 * @Author 12629
 * @Description：
 *//*

class Student implements Comparable<Student> {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return o.age - this.age;
    }*/
/**//*


   /* @Override
    public int compareTo(Student o) {
        if(this.name.compareTo(o.name) > 0) {
            return 1;
        }else if(this.name.compareTo(o.name) == 0) {
            return 0;
        }else {
            return -1;
        }
    }*/

    /*@Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("zhangsan",10);
        students[1]  = new Student("lisi",8);
        students[2]  = new Student("abc",15);
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
    public static void main1(String[] args) {
        String str1 = "abcd";
        String str2 = "cdef";
        //System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
    }
    public static void main2(String[] args) {
        Student student1 = new Student("zhangsan",10);
        Student student2 = new Student("lisi",10);
*/
        /*if(student1.compareTo(student2) > 0) {
            System.out.println("student1 > student2");
        }else {
            System.out.println("student1 <= student2");
        }*/

        /*int a = 10;
        int b = 20;
        System.out.println(a > b);
        if(a > b) {
            针对的是基本数据类型
        }*/
    }
}





}