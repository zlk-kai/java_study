package Exception_;

/**
 * @author 张林凯
 * @version 1.0
 */
public class Exception03 {
    public static int method(){
        try {
            String[] names = new String[3];
            if (names[1].equals("tom")) {
                System.out.println(names[1]);
            }else{
                names[3]="zlkedu";
            }
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            return 2;
            }catch (NullPointerException e){
            return 3;
        }finally {
            return 4;
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
