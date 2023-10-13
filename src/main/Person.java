package main;

public class Person {

    protected String ime;
    protected String prezime;
    protected String email;
    protected Adresa adresa;

    public Person() {}

    public Person(String ime, String prezime, String email, Adresa adresa) {
        System.out.println("Ispis iz super klase Person");
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.adresa = adresa;
    }


    public void ispis(){}



    @Override
    public String toString() {
        return "Person{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", email='" + email + '\'' +
                ", adresa=" + adresa +
                '}';
    }

}
