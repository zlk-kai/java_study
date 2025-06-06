package Exception_;

/**
 * @author 张林凯
 * @version 1.0
 */
public class Exception02    {
    public static void main(String[] args) {
        try {
            int n1 = 10;
            int n2 = 0;
            System.out.println(n1/n2);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("执行了finally");
        }
    }
}
