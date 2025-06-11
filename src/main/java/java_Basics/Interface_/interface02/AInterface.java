package java_Basics.Interface_.interface02;

/**
 * @author 张林凯
 * @version 1.0
 */
public interface AInterface {
    //写属性
    public int  n1 =10;
    //写方法
    //1.抽象方法
    //2.默认实现方法
    //3.静态方法
    //在接口中，抽象方法可省略abstract关键字
    public void hi();

    //需要使用default关键字修饰,默认的实现方法
    public default void ok(){
        System.out.println("ok!!!");
    }

    //可以使用静态方法
    public static void cry(){
        System.out.println("cry!!!s");
    }

}
