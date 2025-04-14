package fr.esaip;

import jakarta.persistence.*;

@Entity
@Table(name="client")

public class Client implements java.io.Serializable {
    // Declaration de la clé primaire ID
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;

    public Client() {
    }
    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    //Getters and setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setprenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
