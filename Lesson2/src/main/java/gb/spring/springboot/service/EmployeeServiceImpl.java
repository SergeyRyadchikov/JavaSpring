package gb.spring.springboot.service;

import gb.spring.springboot.controller.response.dto.EmployeeDto;
import gb.spring.springboot.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeServiceImpl implements EmployeeService{


    @Override
    public List<EmployeeDto> getAllEmployees() {
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setEmail("aaa@111");
        employee1.setFirstName("Nikolas");
        employee1.setLasName("Santana");

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setEmail("bbb@222");
        employee2.setFirstName("Mike");
        employee2.setLasName("Nikov");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);

        return EmployeeDto.convert(employeeList);
    }
}
