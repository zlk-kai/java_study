package java_Basics.reflection;

public class Cat {
    private String name = "招财猫";
    public int age = 10;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void hi(){
//        System.out.println("Say hi");
    }
    public void cry(){
        System.out.println(name+"喵喵叫");
    }
}
