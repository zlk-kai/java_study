package Exception_;

import java.util.Date;

public class Person {
    public static void main(String[] args) {
        Object object   = new Date();
        Person person ;
        person = (Person) object;//ClassCastException
        System.out.println(person);
    }
}
