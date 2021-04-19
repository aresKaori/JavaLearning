package cn.itcast.day10.demo01;

public class Demo04Interface {

    public static void main(String[] args) {
        MyInterfacePrivateAImpl a = new MyInterfacePrivateAImpl();
        a.methodDefault1();
        a.methodDefault2();
        MyInterfacePrivateB.methodStatic1();
        MyInterfacePrivateB.methodStatic2();
        // 错误写法！
//        MyInterfacePrivateB.methodStaticCommon();
    }

}
