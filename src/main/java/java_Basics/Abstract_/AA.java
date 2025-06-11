package java_Basics.Abstract_;

/**
 * @author 张林凯
 * @version 1.0
 */
public class AA {
    public static void main(String[] args) {
            long num = 0;
            //得到开始时间
            long start = System.currentTimeMillis();
            for (int i = 0; i <= 1000000000 ;i++){
                num += i;
            }
            long end = System.currentTimeMillis();
            System.out.println(end -start);
            System.out.println(num);

        new BB().job();

    }


}
