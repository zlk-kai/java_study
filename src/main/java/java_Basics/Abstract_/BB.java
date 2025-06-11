package java_Basics.Abstract_;

/**
 * @author 张林凯
 * @version 1.0
 */
public class BB {
    //j计算任务
    //1 + ....+ 10000
    public void job(){
        long num = 0;
        //得到开始时间
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 1000000000 ;i++){
            num += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end -start);
        System.out.println(num);
    }
}
