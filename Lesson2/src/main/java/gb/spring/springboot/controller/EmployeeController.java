package gb.spring.springboot.controller;

import gb.spring.springboot.controller.response.dto.EmployeeDto;
import gb.spring.springboot.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;

    //display list of employees
    @RequestMapping("/")
    public ModelAndView viewHomePage(){
        ModelAndView modelAndView = new ModelAndView("index");

        List<EmployeeDto> employeeList = employeeService.getAllEmployees();

        modelAndView.addObject("employeeList", employeeList);

        return modelAndView;
    }
}
