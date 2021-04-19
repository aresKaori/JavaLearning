package cn.itcast.day08.demo03;

public class Student {

    private int id; // 学号
    private String name; // 姓名
    private int age; // 年龄
    static String room; // 所在教室，没写private，对象可以直接调用，Student.room
    private static int idCounter = 0; // 学号计数器，每当new了一个新对象的时候，计数器++

    public Student() {
        this.id = ++idCounter;
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;//自动生成学号，无需参数指定

    }
/*
   public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Student.idCounter = idCounter;
        成员变量idCounter使用了static关键字变成静态变量，不再属于对象，而是属于类，Student.idCounter，而不是this.idCounter
        没必要这样，静态成员变量赋值、使用：类名称.静态变量名称
    }
*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
