package com.krillinator.demo;

public class Student {

    // TODO - Make these variables accessible to Main 'somehow'
    public int age;
    public int personNumber;

    public Student(int age, int personNumber) {
        this.age = age;
        this.personNumber = personNumber;
    }

    public Student(Calculator calculator) {

    }

    // TODO - Fix this code to make it apply to the DRY principle
    public void printDetails() {

        System.out.println("Hello, ");
        System.out.println("my age " + age);
        System.out.println("my number " + personNumber);
        System.out.println("This is the end");


    }


}
