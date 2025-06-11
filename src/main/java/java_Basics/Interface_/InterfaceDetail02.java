package java_Basics.Interface_;

/**
 * @author 张林凯
 * @version 1.0
 */
public class InterfaceDetail02 {
    public static void main(String[] args) {
        //证明接口属性是public static final类型
        System.out.println(IB.n1);
    }
}

//5)一个类同时实现多个接口
//6)接口中属性只能是final，而且是public static final修饰符
//7)接口中属性的访问形式：接口名.属性名
//8）一个接口不能继承其它的类，但是可以继承多个别的接口。  interface A extend B,C{}
//9)接口的修饰符只能是public和默认，这点和类的修饰符是一样的。
interface IB{
    int n1 = 10;//等价public static final int n1 =10;
    void hi();
}

interface IC{
    void say();
}

interface IE extends IB,IC{

}
//一个类同时实现多个接口
class Pig implements IB,IC,IE{
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}