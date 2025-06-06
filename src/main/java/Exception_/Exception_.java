package Exception_;

/**
 * @author 张林凯
 * @version 1.0
 * 异常处理
 */
public class Exception_ {
    public static void main(String[] args) throws Exception {
//        int num1 = 10;
//        int num2 = 0;
//        //抛出异常后程序自动退出，不再执行
//        int res = num1 / num2;
//        System.out.println(res);
        String friends[] = {"tom","jack","milan"};
        for (int i = 0; i < 4; i++) {
            System.out.println(friends[i]);//ArrayIndexOutOfBoundsException异常

        }
    }
}
