package com.am.springboot.controller;

import java.util.Map;

import com.am.springboot.service.PropertyDataService;
import com.am.springboot.model.PropDataBean;
import org.springframework.web.bind.annotation.*;

@RestController
class PropertyController {

    private final PropertyDataService repository;

    PropertyController(PropertyDataService repository) {
        this.repository = repository;
    }
    @ResponseBody
    @GetMapping("/displayProp")
    public Map<String, PropDataBean> displayAll() {
        return repository.getAllData();
    }

    @ResponseBody
    @PostMapping("/addProp")
    public Map<String, PropDataBean> addToList(@RequestBody PropDataBean propDataBean) {
        repository.addToList(propDataBean);
        return repository.getAllData();
    }

    @RequestMapping("/about")
    @ResponseBody
    String sayHello()
    {
        return "Hi this service accepts input params and returns java hashmap that can be retireved and used else where. ";
    }

    @RequestMapping("/")
    @ResponseBody
    String say()
    {
        return "Hello / / /";
    }

//
//    // Aggregate root
//    // tag::get-aggregate-root[]
//    @GetMapping("/employees")
//    List<Employee> all() {
//        return repository.findAll();
//    }
//    // end::get-aggregate-root[]
//
//    @PostMapping("/employees")
//    Employee newEmployee(@RequestBody Employee newEmployee) {
//        return repository.save(newEmployee);
//    }
//
//    // Single item
//
//    @GetMapping("/employees/{id}")
//    Employee one(@PathVariable Long id) {
//
//        return repository.findById(id)
//                .orElseThrow(() -> new EmployeeNotFoundException(id));
//    }
//
//    @PutMapping("/employees/{id}")
//    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
//
//        return repository.findById(id)
//                .map(employee -> {
//                    employee.setName(newEmployee.getName());
//                    employee.setRole(newEmployee.getRole());
//                    return repository.save(employee);
//                })
//                .orElseGet(() -> {
//                    newEmployee.setId(id);
//                    return repository.save(newEmployee);
//                });
//    }
//
//    @DeleteMapping("/employees/{id}")
//    void deleteEmployee(@PathVariable Long id) {
//        repository.deleteById(id);
//    }
}