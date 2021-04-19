package cn.itcast.day09.demo07;

public class Fu {

    static int num;

    public Fu() {
        System.out.println("父类无参构造");
    }

    public Fu(int num) {
        System.out.println("父类有参构造！");
        this.num = num;
    }

}
