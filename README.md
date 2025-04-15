
# Java EE - Hibernate : TP1 à TP3

## 👤 Informations

- **Nom** : Jacques Junior LEBAMA  
- **Classe** : IR4 - Majeure BIG DATA  
- **Technologies utilisées** : Java 17+, JPA, Hibernate, IntelliJ IDEA, MariaDB

---

## 🎯 Objectifs pédagogiques

### 🧪 TP1 – Prise en main de JPA
- Comprendre la configuration de la **persistence unit** (`persistence.xml`)
- Mettre en place la connexion entre une application Java et une base de données
- Créer et utiliser un `EntityManager` pour commencer à manipuler les entités

### 🧪 TP2 – Manipulation d’entités simples
- Créer une entité JPA (`Livre`) mappée sur une table réelle de la base
- Comprendre l’annotation `@Entity`, `@Id`, `@GeneratedValue`, etc.
- Utiliser `em.find()` et `em.persist()` pour tester la lecture/écriture en base

### 🧪 TP3 – Relations entre entités
- Créer les entités `Client`, `Emprunt`, et mettre en place les relations :
  - `@ManyToOne` (Emprunt → Client)
  - `@OneToMany` (Client → Emprunt)
  - `@ManyToMany` (Emprunt ↔ Livre via la table `COMPO`)
- Réaliser des requêtes pour extraire :
  - un emprunt et les livres associés
  - les emprunts d’un client donné

---

## 🗃️ Base de données utilisée

- **SGBD** : MariaDB
- **Nom de la base** : `livres`
- **Tables** : `livre`, `client`, `emprunt`, `compo`
- **Création via script SQL** (fourni dans TP2), comprenant :
  - des insertions de livres, clients, emprunts
  - la table d’association `compo` pour la relation Many-to-Many

---

## ⚙️ Ressources à mettre en place

### ✅ Côté Java
- Fichier `persistence.xml` configuré avec :
  - Nom de l’unité de persistance : `livresPU`
  - Driver JDBC MariaDB
  - User/password pour la base
- Entités :
  - `Livre.java`
  - `Client.java`
  - `Emprunt.java`
- Classe de test : `ConnexionJpa.java`

### ✅ Côté BDD
- MariaDB local
- Script SQL d’initialisation fourni dans le TP

---

## 📚 Concepts abordés

- Mapping objet-relationnel avec JPA
- Annotations JPA : `@Entity`, `@Table`, `@Id`, `@GeneratedValue`, `@Column`, `@ManyToOne`, `@OneToMany`, `@ManyToMany`, `@JoinColumn`, `@JoinTable`
- Utilisation de `EntityManager` pour effectuer des opérations CRUD
- Requêtes JPQL simples

---

## 📁 Arborescence du projet

```
src/
├── fr/esaip/
│   ├── Livre.java
│   ├── Client.java
│   ├── Emprunt.java
│   └── ConnexionJpa.java
resources/
└── META-INF/
    └── persistence.xml
```

---

## 🚀 Pour exécuter

1. Lancer MariaDB localement avec la base `livres` installée
2. Ouvrir le projet dans IntelliJ
3. S'assurer que les dépendances JDBC sont présentes
4. Exécuter `ConnexionJpa.java` pour tester les requêtes

---
