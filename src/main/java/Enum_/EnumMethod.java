package Enum_;

import java.util.Arrays;

/**
 * @author 张林凯
 * @version 1.0
 * 演示Enum方法使用
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用Season2 枚举类，来演示各种方法
        Season2 spring = Season2.SPRING;
//        //输出枚举对象名称
//        System.out.println(spring.name());
//        //输出该枚举对象的次序，从0开始编号
//        System.out.println(spring.ordinal());
//        //返回Season2数组，
//        //含有定义的所有枚举对象
//        Season2[] values = Season2.values();
//        for (Season2 value : values) {
//            //System.out.println(value.name());
//            //System.out.println(value.ordinal());
//        }

//        System.out.println(Season2.valueOf("SPRING"));
//        System.out.println(Season2.valueOf("SPRING") == spring);
        //编号的差，相当于3-5 = -2
//        System.out.println(Season2.AUTUMN.compareTo(Season2.WHAT));
    }
}
