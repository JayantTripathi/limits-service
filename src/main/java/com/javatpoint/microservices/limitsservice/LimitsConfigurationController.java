package com.javatpoint.microservices.limitsservice;
import com.javatpoint.microservices.limitsservice.bean.Employee;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LimitsConfigurationController 
{
@GetMapping("/employee")
public List<Employee> retriveLimitsFromConfigurations()
{

    List<Employee> employeeData = new ArrayList<Employee>();
    employeeData.add(new Employee(1,"Jay","St Louis","MO","US"));
    employeeData.add(new Employee(2,"Ron","Arlington","TX","US"));
    employeeData.add(new Employee(3,"Brad","Dallas","TX","US"));
    employeeData.add(new Employee(4,"John","Phoenix","AZ","US"));
    employeeData.add(new Employee(5,"Shaq","Glendale","AZ","US"));
    return employeeData;
}
}