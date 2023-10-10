package main;

public class Student extends Person{

    //atributi - polja

    public static int godine;


    //konstruktori - mehanizam za kreiranje objekta
    public Student(){}

    private Student(String ime, String prezime, int godine) {//parametrizovani konstruktor
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    private Student(String prezime, String godine) {
        this.ime = ime;
        this.prezime = prezime;
    }

    //get -set metode

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }





    void ispis(){
        String ime;
        System.out.println("Ime: " + this.ime + " Prezime " + prezime + " Godine " + this.godine + " email " + email);
    }

    private String ispis2(){
        String student = "Ime: " + ime + " Prezime " + prezime + " Godine " + godine;
        return student;
    }



    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
