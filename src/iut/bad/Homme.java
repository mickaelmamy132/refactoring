package iut.bad;

public class Homme extends Humain {
    public Homme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "HOMME : " + super.toString();
    }
}
