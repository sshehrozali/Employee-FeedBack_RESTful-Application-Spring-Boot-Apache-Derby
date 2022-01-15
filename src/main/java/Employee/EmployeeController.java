package Employee;

// Import Database Packages -> Classes
import Database.Data;
import Database.Performance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    // Dependency Injection
    @Autowired
    private EmployeeService employeeService;

    // GET (Employee Login -> By ID -> Primary Key)
//    @RequestMapping("/api/login/{id}")
//    public List<Data> employeeDashboard(@PathVariable Integer id) {
//        return employeeService.displayEmployeesPerformances(id);
//    }
}