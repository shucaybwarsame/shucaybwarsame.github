package com.krillinator.demo;

import com.krillinator.demo.Calculator;
import com.krillinator.demo.Student;


public class Main {
    public static void main(String[] args) {

        // TODO - Fix all the errors in the code, make sure names are correct and follow best practices!
        // TODO - (Make sure you don't remove 'methods'. Code should be able to 'run' )
        // TODO - Code needs to follow DRY principles

        int[] myScore = {0, 15, 100};

        Calculator calculator  = new Calculator();
        Student mMmM = new Student(calculator);

        mMmM.printDetails();



        // TODO - Fix the crash! (The for loop should run 3 times)
        for (int i = 0; i <= 2; i++) {
            System.out.println("index " + i);


            System.out.println();

        }

        // TODO - What is an algorithm?
        // When you're done, send in a PDF-document explaining what an algorithm is!
        // TODO - Once the code is fixed without errors and functions are running as intended. As well as DRY!
        //  Zip the project and send it in on STI (you can set it up on GitHub too)
    }
}
