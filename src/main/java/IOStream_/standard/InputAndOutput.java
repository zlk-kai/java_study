package IOStream_.standard;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        //System.in:编译类型  InputStream
        //System.in:运行类型  BufferedInputStream,字节流
        //标准输入  键盘
        System.out.println(System.in.getClass());
        //System.out:编译类型为  PrintStram,
        //System.out:运行类型为  PrintStram,
        //表示标准输出 显示器
        System.out.println(System.out.getClass());

        Scanner scanner = new Scanner(System.in);
        System.out.printf(scanner.next());
    }
}
