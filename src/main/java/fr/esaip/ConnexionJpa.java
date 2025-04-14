package fr.esaip;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class ConnexionJpa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("livres");
        EntityManager em = emf.createEntityManager();

        // Rechercher un livre avec l'id 1
        Livre livre = em.find(Livre.class, 1);

        if (livre != null) {
            System.out.println("Livre trouvé : " + livre);
        } else {
            System.out.println("Aucun livre trouvé avec l'id 1");
        }

        em.close();
        emf.close();
    }
}