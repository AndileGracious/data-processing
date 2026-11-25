package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Smith", 27));
        people.add(new Person("Gracious", "Grace", 25));
        people.add(new Person("Hannah", "Dayrit", 25));
        people.add(new Person("Rachel", "Johnson", 32));
        people.add(new Person("Zoey", "Banfield", 45));
        people.add(new Person("Precious", "Wilson", 20));
        people.add(new Person("Elle", "Jones", 55));
        people.add(new Person("Edward", "Wood", 25));
        people.add(new Person("Kathleen", "Wood", 25));
        people.add(new Person("Mary", "Wright", 25));

    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter a name to search: ");

    String searchName = myScanner.nextLine();
    List<Person> matchingPeople = new ArrayList<>();
        for (Person person : people) {
            if(person.getFirstName().equalsIgnoreCase(searchName) ||
                    person.getLastName().equalsIgnoreCase(searchName)){
                matchingPeople.add(person);
            }
        }
        System.out.println("People with matching name: ");

        for (Person person : matchingPeople) {
            System.out.println(person.getFirstName() + " " + person.getLastName());

        }

        }


    }



