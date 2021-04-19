package cn.itcast.day11.demo05;

public class DemoMain02 {
    public static void main(String[] args) {
        Fu obj = new Fu(){
            @Override
            public void method() {
                System.out.println("方法执行啦");
            }
        };
        obj.method();
        System.out.println(obj.num);
    }
}
