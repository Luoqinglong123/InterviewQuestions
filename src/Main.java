import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("你输入的a为："+a);
        int b = scanner.nextInt();
        System.out.println("你输入的b为："+b);

        if (a >= b) {
            a = b - a;
            b = b - a;
            a = b + a;
        }
        System.out.println("结果：   a的值：" + a + ",b的值：" + b);
    }
    //将线程不安全的集合转为线程安全的集合
    @Test
    public void test1(){
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        List<String> synchronizedList = Collections.synchronizedList(list);
    }
}
