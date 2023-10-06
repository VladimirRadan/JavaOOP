package main;

public class Student {

    //atributi
    public String ime;
    public String prezime;
    public int godine;

    //konstruktori - mehanizam za kreiranje objekta
    public Student(){}

    public Student(String ime, String prezime, int godine) {//parametrizovani konstruktor
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    public Student(String prezime, String godine) {
        this.ime = ime;
        this.prezime = prezime;
    }




    //metode -> ono sto objekat radi



    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godine=" + godine +
                '}';
    }
}
