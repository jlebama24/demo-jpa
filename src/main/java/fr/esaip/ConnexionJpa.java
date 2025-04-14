package fr.esaip;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class ConnexionJpa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("livres");
        EntityManager em = emf.createEntityManager();

        // Rechercher un emprunt avec ID = 1
        Emprunt emprunt = em.find(Emprunt.class, 1);

        if (emprunt != null) {
            System.out.println("Emprunt trouvé : " + emprunt);
            System.out.println("Livres associés à l'emprunt :");

            for (Livre livre : emprunt.getLivres()) {
                System.out.println(" - " + livre);
            }

        } else {
            System.out.println("Aucun emprunt trouvé avec l'id 1");
        }

        em.close();
        emf.close();
    }
    }
