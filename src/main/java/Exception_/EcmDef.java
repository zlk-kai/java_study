package Exception_;

/**
 * @author 张林凯
 * @version 1.0
 */
public class EcmDef {
    public static void main(String[] args) throws Exception {
        int n1 =2000;
        int n2 =0;
        if (n2 ==0){
            throw new Exception("n2分母不能为0");
        }else {
            System.out.println(cal(n1,n2));
        }
    }

    public static double cal(int n1, int n2) {
        return (double) n1 /n2;
    }
}
