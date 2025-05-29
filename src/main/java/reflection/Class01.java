package reflection;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

//all/
public class Class01 {
    //查看Class类常用方法
    public static void main(String[] args) throws Exception {
        String classAllPath = "reflection.Car";
        //获取Car类，对应的Class对象
        Class cls = Class.forName(classAllPath);
        //输出Class
        System.out.println(cls);
        System.out.println(cls.getName());
        System.out.println(cls.getPackage().getName());
        System.out.println(cls.getName());
        //通过cls实例，创建对象实例
        Car car = (Car) cls.getConstructor().newInstance();
        car.setName("123");
        System.out.println(car.getName()
        );
        System.out.println(car.getName());
        System.out.println(car.toString());

        Method price = cls.getMethod("getName");
        System.out.println(price.getName().toString()+"=");
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName()+"="+field.get(car));
        }
    }
}
