package gb.spring.springboot.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Component
@Getter
@Setter
public class Employee {

    private long id;

    private String firstName;

    private String lasName;

    private String email;

}
