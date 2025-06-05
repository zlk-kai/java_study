package Enum_;

/**
*@author 张林凯
*@version 1.0
*
*/
public class enum02{
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.SUMMER);
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.WINTER);
        System.out.println(Season2.WHAT.name());
    }
}

enum Season2{

    SPRING("春天","温暖"),
    SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"),
    WINTER("冬天","寒冷"),
    WHAT();

    private String name;

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }

    private String desc;

    private Season2(String name, String desc){
        this.name = name;
        this.desc = desc;
    }
    Season2(){}

    @Override
    public String toString() {
        return super.toString();
    }
}