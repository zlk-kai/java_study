package java_Basics.Interface_;

/**
 * @author 张林凯
 * @version 1.0
 * 接口不能被实例化
 */
public class InterfaceDetail01{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.hi();
        cat.say();
    }
}


//1）接口不能被实例化
//2）接口中所有的方法是public方法，接口中抽象方法，可以不用abstract修饰
//3）一个普通类实现接口，就必须将该接口的所有方法都实现；
//4）abstract抽象类实现接口，可以不用实现接口的方法
//4）abstract 抽象类  实现接口，可以不用实现接口的方法
interface IA{
    void  say();
    void  hi();
}

class Cat implements IA{//alt+enter

    @Override
    public void say() {
        System.out.println("小猫吃东西！！");
    }

    @Override
    public void hi() {
        System.out.println("小猫向你打招呼！！");
    }
}
