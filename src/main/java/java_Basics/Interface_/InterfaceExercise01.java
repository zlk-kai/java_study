package java_Basics.Interface_;

/**
 * @author 张林凯
 * @version 1.0
 */
public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(A.a);
        System.out.println(B.a);
    }
}

interface A{
    int a = 33;
}
class B implements A{}
