package gb.spring.springboot.service;

import gb.spring.springboot.controller.response.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> getAllEmployees();
}
