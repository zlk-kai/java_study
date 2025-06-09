package java_web.JDBC.tools;

import java.util.Scanner;

/**
 * @author 张林凯
 * @version 1.0
 */
public class ScannerUtils {
    static Scanner scanner = new Scanner(System.in);
    public static String username(){

        System.out.println("请输入账号：");
        String usernanme = scanner.nextLine();
        return usernanme;
    }

    public static String password(){
        System.out.println("请输入密码：");
        String userpassword = scanner.nextLine();
        return userpassword;
    }
}
