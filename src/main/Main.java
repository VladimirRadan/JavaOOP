package main;

import utils.Utils;


public class Main {


    public static void main(String[] args) {


        Student student1 = new Student();
        student1.setIme("Pera");
        student1.setPrezime("Peric");

        Student student2 = new Student("Marko", "Markovic", 30);


        System.out.println(student1.getIme());
        System.out.println(student2.getIme());

        student1.setEmail(Utils.randomEmail());

        Student.godine = 21;


    }


}
