package ro.fasttrackit.temacurs12.ex3;

import ro.fasttrackit.temacurs12.ex2.Person;

import java.util.*;

public class EmployeeServices {
    private final List<Employee> employees;

    public EmployeeServices(Collection<Employee> employees) {
        super();
        this.employees = employees == null
                ? new ArrayList<>()
                : new ArrayList<>(employees);


    }

    public Map<String, Integer> mapNameToSalary(int salary) {
        Map<String, Integer> result = new HashMap<>(salary);
        for (Employee employee : employees) {
            if ((employee.getSalary() > salary)) {
                result.put(employee.getName(), employee.getSalary());
            }
        }
        return result;


    }
}

