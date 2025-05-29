package reflection;

/**
 * 获取Class对象的六种方式
 */
public class GetClass02 {
    public static void main(String[] args) throws Exception{
        //1.Class.forName
        String className = "reflection.Car";//读取配置文件获取
        Class cls1 = Class.forName(className);
        System.out.println("cls1"+cls1.getName());
        //2.类名.class,应用场景：用于参数传递
        Class cls2 = Car.class;
        System.out.println("cls2"+cls2);
        //3.对象.getClass(),应用场景：有对象实例
        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println("cls3"+cls3.getConstructor().newInstance());
        System.out.println("cls3"+cls3.getName());
        //4.通过类加载器【4种】来获取到类的Class对象
        //（1）先得到类加载器car
        ClassLoader classLoader = car.getClass().getClassLoader();
        //(2)通过类加载器得到Class对象
        Class cls4 = classLoader.loadClass(className);
        System.out.println("cls4"+cls4);
        //cls1,cls2,cls3,cls4都是同一个对象
        System.out.println(cls1.hashCode() == cls2.hashCode());
        System.out.println(cls2.hashCode() == cls3.hashCode());
        System.out.println(cls3.hashCode() == cls4.hashCode());
        //5.基本数据类型，
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Short> shortClass = short.class;
        Class<Byte> byteClass = byte.class;
        Class<Float> floatClass = float.class;
        System.out.println("integerClass="+integerClass.getName());
        System.out.println("characterClass="+characterClass.getName());
        System.out.println("shortClass="+shortClass.getName());
        System.out.println("byteClass="+byteClass.getName());
        System.out.println("floatClass="+floatClass.getName());

        //基本数据类型的包装类
        Class<Integer> type = Integer.TYPE;
        Class<Character> charType = Character.TYPE;
        System.out.println("type="+type.getName());
        System.out.println("integerClass.hashCode="+integerClass.hashCode());
        System.out.println(type.hashCode()==integerClass.hashCode());
    }
}
