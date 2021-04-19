package cn.itcast.day05.demo03;

/*
数组元素的反转：
本来的样子：[1, 2, 3, 4]
之后的样子：[4, 3, 2, 1]

要求不能使用新数组，就用原来的唯一一个数组。

1.其实就是【对称位置】的元素交换。

2.通常遍历数组用的是一个索引：
int i = 0；
现在表示对称位置需要两个索引：
int min = 0；
int max = array.length - 1；

3.如何交换两个变量的值？
int a = 10；
int b = 20；
int temp = a；
a = b；
b = temp；

4.什么时候停止交换？
(1)min == max
(2)min > max
【min < max】
 */
public class Demo07ArrayReverse {

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };

        // 遍历打印数组本来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("============");

        /*
        初始化语句：int min = 0, max = array.length - 1
        条件判断：min < max
        步进表达式：min++, max--
        循环体：用第三个变量倒手
         */
        for (int min = 0, max = array.length - 1; min <max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        // 再次打印遍历输出数组后来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
