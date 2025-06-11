package java_Basics.Interface_.interface02;

/**
 * @author 张林凯
 * @version 1.0
 */
public class InterFace02 {
    public static void main(String[] args) {

    }
}

//如果一个类implements实现 接口
//需要将该接口的所有抽象方法都实现
class A implements AInterface{

    @Override
    public void hi() {

    }

    @Override
    public void ok() {
        AInterface.super.ok();
    }
}
