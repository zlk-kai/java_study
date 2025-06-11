package java_Basics.Interface_.interface01;

/**
 * @author 张林凯
 * @version 1.0
 * Phone这个类需要实现使用接口的规定/声明的方法
 */

public class Phone implements UsbInterface{
    //实现接口
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
