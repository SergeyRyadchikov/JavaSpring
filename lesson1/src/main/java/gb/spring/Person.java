package gb.spring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {

    private String name;

    private int age;

    private String phone;

    public Person(String name) {
        this.name = name;
    }
}
