package ro.fasttrackit.temacurs12.ex3;

import ro.fasttrackit.temacurs12.ex2.Person;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

public class Employee extends Person {
    private String company;
    private int salary;



    public Employee(String name, int age, String hairColour,String company, int salary) {
        super("", 32, "");
        this.company = company;
        this.salary = salary;


    }


    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }


}
