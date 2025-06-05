package Enum_;

/**
 * @author 张林凯
 * @version 1.0
 * 枚举
 */
public class enum01 {
    public static void main(String[] args) {
        //使用
        Season spring = new Season("春天","温暖");
        Season summer = new Season("夏天","炎热");
        Season autumn = new Season("秋天","凉爽");
        Season winter = new Season("冬天","寒冷");
        System.out.println(spring);
        System.out.println(summer);
        System.out.println(autumn);
        System.out.println(winter);
        //这样不合适，要使用枚举类
    }
}
class Season{

    private String name;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
