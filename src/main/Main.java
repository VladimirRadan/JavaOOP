package main;

import utils.Utils;


public class Main {


    public static void main(String[] args) {

        Adresa adresa = new Adresa("First", 100, "London");

        Student student = new Student("John", "Smith", Utils.randomEmail(), adresa, "34243/2023");

        Profesor profesor = new Profesor("Pera", "Peric", Utils.randomEmail(), adresa, "Programiranje u Javi");

//        System.out.println(student);
//        System.out.println(profesor);


    }


}
