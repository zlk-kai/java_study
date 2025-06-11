package java_Basics.Interface_.interface01;

/**
 * @author 张林凯
 * @version 1.0
 */
public class Computer {
    //编写一个方法
    public void work(UsbInterface usbInterface) {
        //通过接口，来调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
