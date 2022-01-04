package ro.fasttrackit.temacurs12.ex2;

import ro.fasttrackit.temacurs12.ex3.Employee;

import java.util.*;

public class PersonServices {
    private final List<Person> person;


    public PersonServices(Collection<Person> person) {
        this.person = person == null
                ? new ArrayList<>()
                : new ArrayList<>(person);


    }


    public List<Person> getPersonsName(String name) {
        List<Person> listaNoua = new ArrayList<>();
        for (Person persons : person) {
            if (persons.getName().equalsIgnoreCase(name)) {
                listaNoua.add(persons);
            }
        }
        return listaNoua;
    }


    public Map<String, Integer> mapNameToAge() {
        Map<String, Integer> result = new HashMap<>();
        for (Person persons : person) {
            result.put(persons.getName(), persons.getAge());
        }
        return result;
    }

    public Map<String, Integer> mapNameToOlderAge(int age) {
        Map<String, Integer> result = new HashMap<>(age);
        for (Person persons : person) {
            if ((persons.getAge() > age)) {
                result.put(persons.getName(), persons.getAge());
            }
        }
        return result;
    }

    public Map<String, List<Person>> mapHairColourToListName() {
        Map<String, List<Person>> result = new HashMap<>();
        for (Person persons : person) {
            List<Person> hairColourOfPerson = result.get(persons.getHairColour());
            if (hairColourOfPerson == null) {
                hairColourOfPerson = new ArrayList<>();
                result.put(persons.getHairColour(), hairColourOfPerson);
            }
            hairColourOfPerson.add(persons);
        }
        return result;


    }

    public Map<Integer, List<Person>> mapAgeToListName() {
        Map<Integer, List<Person>> result = new HashMap<>();
        for (Person persons : person) {
            List<Person> ageOfPerson = result.get(persons.getAge());
            if (ageOfPerson == null) {
                ageOfPerson = new ArrayList<>();
                result.put(persons.getAge(), ageOfPerson);
            }
            ageOfPerson.add(persons);
        }
        return result;

    }
}

