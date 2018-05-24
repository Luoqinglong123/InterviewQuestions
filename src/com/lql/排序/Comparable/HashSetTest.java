package com.lql.排序.Comparable;
import java.util.HashSet;
public class HashSetTest {
    // HashSet类的使用，不支持对元素数据进行排序
    public static void main(String[] args) {
        //即使泛型User类实现了comparable接口，但是结果还是没有排序
        HashSet<User> hSet = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            //即使泛型User类没有实现了comparable接口，add方法也不会报错
            hSet.add(new User("hSet_name" + i, "hSet_password" + (50 - i)));
        }
        for (User user : hSet) {
            System.out.println(user.toString());
        }
    }
}
