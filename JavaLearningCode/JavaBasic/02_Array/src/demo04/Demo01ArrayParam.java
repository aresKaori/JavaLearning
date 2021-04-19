package cn.itcast.day05.demo04;

/*
数组可以作为方法的参数。
当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值。
 */
public class Demo01ArrayParam {

    public static void main(String[] args) {
        int[] arraya = { 10, 20, 30, 40, 50 };
        int[] arrayb = { 50, 40, 30, 20, 10 };

        System.out.println(arraya); // 地址值
        System.out.println(arrayb); // 地址值

        printArray(arraya); // 传递进去的就是array当中保存的地址值
        System.out.println("==========AAA==========");
        printArray(arrayb);
        System.out.println("==========BBB==========");
    }

    /*
    三要素
    返回值类型：只是进行打印而已，不需要进行计算，也没有结果，用void
    方法名称：printArray
    参数列表：必须给我数组，我才能打印其中的元素。int[] array
     */
    public static void printArray(int[] array) {//任何数据类型都可以作为方法的参数
        System.out.println("printArray方法收到的参数是：");
        System.out.println(array); // 地址值
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
