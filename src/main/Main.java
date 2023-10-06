package main;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Student student1 = new Student();//------>//@jfiewsf34
        student1.ime = "Pera";
        student1.prezime = "Peric";
        student1.godine = 20;

        student1.godine = 21;

        Student student2 = new Student("Marko", "Markovic", 21);


        System.out.println(student1);
        System.out.println(student2);



    }


}
