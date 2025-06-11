package java_Basics.Interface_.interface01;

/**
 * @author 张林凯
 * @version 1.0
 */

public class Camera  implements UsbInterface{
    //实现接口
    @Override
    public void start() {
        System.out.println("相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作");

    }
}
