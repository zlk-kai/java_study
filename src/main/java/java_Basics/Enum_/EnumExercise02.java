package java_Basics.Enum_;

/**
 * @author 张林凯
 * @version 1.0
 */

@SuppressWarnings("all")
public class EnumExercise02 {
    public static void main(String[] args) {
        Week[] values = Week.values();
        for (Week w : values) {
            System.out.println(w.getName());

        }
    }
}
//声明已经过时
@Deprecated
enum Week{
    MONDAY("星期一"),Tuesday("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");

    private String name;

    private Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }
}
