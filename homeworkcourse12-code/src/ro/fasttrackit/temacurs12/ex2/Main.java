package ro.fasttrackit.temacurs12.ex2;


import ro.fasttrackit.temacurs12.ex3.Employee;
import ro.fasttrackit.temacurs12.ex3.EmployeeServices;
import ro.fasttrackit.temacurs12.ex4.DaySchedule;
import ro.fasttrackit.temacurs12.ex4.DaysOfTheWeek;

import java.util.List;



public class Main {
    public static void main(String[] args) {
        PersonServices personServices = new PersonServices(List.of(
                new Person("Maria", 30, "blonde"),
                new Person("Ioana", 25, "black"),
                new Person("Emil", 23, "gry"),
                new Person("Matei", 17, "blue")
        ));


        System.out.println(personServices.getPersonsName(""));
        System.out.println(personServices.mapNameToAge());
        System.out.println(personServices.mapNameToOlderAge(25));
        System.out.println(personServices.mapHairColourToListName());
        System.out.println(personServices.mapAgeToListName());


        EmployeeServices employeeServices = new EmployeeServices(List.of(
                new Employee("Ion",32,"blonde","",2000),
                new Employee("Maria",33,"black","",2700),
                new Employee("Vasile",31,"gry","",2800),
                new Employee("Florica",30,"blonde","",2500)

        ));

        System.out.println(employeeServices.mapNameToSalary(2000));

        




    }
}
