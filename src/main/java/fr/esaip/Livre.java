package fr.esaip;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="livre")


public class Livre implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String titre;
    private String auteur; //

    public Livre() {
    }
    public Livre(String titre, String auteur){
        this.titre = titre;
        this.auteur = auteur;
    }
    // Getters et setters
    public String getTitre(){
        return titre;
    }
    public void setTitre(String titre){
        this.titre = titre;
    }
    public String getAuteur(){
        return auteur;
    }
    public void setAuteur(String auteur){
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + "]";
    }
}

