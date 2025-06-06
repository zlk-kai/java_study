package java_Basics.Exception_;

public class Exception01 {
    public static void main(String[] args) {
        try{
            //代码块/可能有异常
        }catch (Exception e){
            e.printStackTrace();
            //1.当异常发生时
            //2。系统将异常封装成Exception对象e，传递给Cath
            //3.得到异常对象后，程序员，自己处理
            //4.注意，如果没有发生异常catch代买快不执行
        }finally {
            //1.不管try代码块是否有异常发生，始终要执行finally
            //2.所以，通常将释放资源的代码，放在finally
        }
    }
}
