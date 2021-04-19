package cn.itcast.day09.demo02;

public class Zi extends Fu {

    int numZi = 20;

    int num = 200;
    public void methodZi() {
        // 因为本类当中有num，所以这里用的是本类的num
        System.out.println(num);
        System.out.println(this.num);
        System.out.println("=========");
        System.out.println(numFu);
        System.out.println(super.numFu);
        System.out.println(this.numFu);

        System.out.println("=========");

        //子类成员方法
        this.methodS();
        methodS();//隐藏了this关键字
        //父类成员方法
        super.methodFu();
        methodFu();//隐藏了this关键字
        this.methodFu();

        System.out.println("=========");

        //覆盖重写，子类静态方法
        Zi.method(); //静态方法可以通过类名称+方法名调用
        method();
//        this.method();不推荐，本类method方法
//      父类静态方法
        Fu.method();
//        super.method();错误
        System.out.println("=========");


    }
    public void methodS(){
        System.out.println("子类非静态方法");
    }
    public static void method(){
        System.out.println("子类静态方法");
    }
}
