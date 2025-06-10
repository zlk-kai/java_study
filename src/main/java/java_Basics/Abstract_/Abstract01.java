package java_Basics.Abstract_;

/**
 * @author 张林凯
 * @version 1.0
 * 抽象类
 */
public class Abstract01 {
    public static void main(String[] args) {

    }
}

//当一个类中有抽象方法时，该类也同时要声明成抽象方法
abstract class Animal {

    private String name;
    public Animal() {
        this.name = name;
    }

    //父类方法不确定性
    //抽象方法（abstract）
    //所谓抽象方法，就是没实现的方法
    //没有方法体
    public abstract void eat();

}
