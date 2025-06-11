package java_Basics.Interface_.interface01;

/**
 * @author 张林凯
 * @version 1.0
 * 接口
 */
public class Interfacetest01 {
    public static void main(String[] args) {
        //创建手机
        Camera camera = new Camera();
        //创建手机
        Phone phone = new Phone();
        //创建相机
        Computer computer = new Computer();
        computer.work(camera);
        System.out.println("=================");
        computer.work(phone);
    }
}
