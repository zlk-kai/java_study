package Exception_;

/**
 * @author 张林凯
 * @version 1.0
 * 自定义异常
 * throws 异常处理的一种方式， 位置在方法生命处，后面跟随异常类型
 * throw 手动生成异常对象的关键字，位置在方法体中，后面跟随异常对象
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 1120;
        //y要求在18-120 之间，否则抛出异常
        if (!(age >= 18 && age <= 120)){
            throw new AgeException("年龄需要在18-20之间");
        }
        System.out.println("年龄范围正确！！");
    }
}
//1.一般情况下，我们自定义异常是继承RuntimeException
//2.即把自定义异常做成 运行时异常 ，好处是，我们可以使用默认的处理机制
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}