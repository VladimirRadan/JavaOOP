package main;

public class Student extends Person{

    private String brIndexa;


    public Student(String ime, String prezime, String email, Adresa adresa, String brIndexa) {
        super(ime, prezime, email, adresa);
        System.out.println("Ispis iz klase Student");
        this.brIndexa = brIndexa;
    }


    public String getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(String brIndexa) {
        this.brIndexa = brIndexa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "brIndexa='" + brIndexa + '\'' +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", email='" + email + '\'' +
                ", adresa=" + adresa +
                '}';
    }


}
