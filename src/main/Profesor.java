package main;

public class Profesor extends Person{


    private String predmet;


    public Profesor(String ime, String prezime, String email, Adresa adresa, String predmet) {
        super(ime, prezime, email, adresa);
        System.out.println("Ispis iz klase Profesor");
        this.predmet = predmet;
    }


    @Override
    public String toString() {
        return "Profesor{" +
                "predmet='" + predmet + '\'' +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", email='" + email + '\'' +
                ", adresa=" + adresa +
                '}';
    }

}
