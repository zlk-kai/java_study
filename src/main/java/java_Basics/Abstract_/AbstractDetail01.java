package java_Basics.Abstract_;

/**
 * @author 张林凯
 * @version 1.0
 */
public class AbstractDetail01 extends A{
    public static void main(String[] args) {
        B b = new B();
        b.eat();


    }

    @Override
    public void eat() {
        System.out.println("吃不好吃的");
    }
}
//本质还是类，所以有类的各种成员，
//抽象方法不能使用private、final、和static来修饰
abstract class A {
    public void hi(){
        System.out.println("hi");
    }
    public abstract void eat();
}

class B  extends A{
    @Override
    public void eat() {
        System.out.println("吃好吃的！！！！！！");
    }
}
