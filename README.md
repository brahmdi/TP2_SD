# Projet Spring Initializer avec JPA, H2, Spring Web et Lombok

Ce projet vise à créer une application Spring Boot avec les dépendances JPA, H2, Spring Web et Lombok pour la gestion de produits.

## Étapes de développement

1. **Installation d'IntelliJ Ultimate**
   - Installez IntelliJ Ultimate pour le développement de l'application.
     ![image](https://github.com/brahmdi/TP2_SD/assets/96790699/13e41c72-5ce6-4f68-bf30-94d5bc947b82)


2. **Création du projet Spring Initializer**
   - Utilisez Spring Initializer pour créer un nouveau projet Spring Boot.
     ![image](https://github.com/brahmdi/TP2_SD/assets/96790699/3e6bc523-637e-4369-8ff6-afa739e292c0)

   - Ajoutez les dépendances nécessaires : JPA, H2, Spring Web et Lombok.
     ![image](https://github.com/brahmdi/TP2_SD/assets/96790699/81b52382-d30b-46cf-b16f-5189125d15cd)


3. **Entité JPA Produit**
   - Créez une entité JPA `Produit` avec les attributs suivants :
     - `id` de type `Long`
     - `name` de type `String`
     - `price` de type `double`
     - `quantity` de type `int`
![image](https://github.com/brahmdi/TP2_SD/assets/96790699/dd8e58f2-a0ff-49b3-9632-fade6af6b92d)

4. **Configuration de l'unité de persistance**
   - Configurez l'unité de persistance dans le fichier `application.properties`.
![image](https://github.com/brahmdi/TP2_SD/assets/96790699/da67afcb-39a1-4aa8-ae98-e0e4c9f2f2b4)

5. **Interface JPA Repository**
   - Créez une interface JPA Repository basée sur Spring Data pour l'entité `Produit`.
![image](https://github.com/brahmdi/TP2_SD/assets/96790699/40c12450-a1ef-4db3-9932-9d5f0e01fcc0)

6. **Opérations de gestion des produits**
   - Implémentez les opérations de gestion suivantes pour les produits :
     - Ajouter des produits
       ![image](https://github.com/brahmdi/TP2_SD/assets/96790699/1f5b7724-f695-4ede-bc63-8b97314b4531)

     - Consulter tous les produits
       ![image](https://github.com/brahmdi/TP2_SD/assets/96790699/65806c5f-ea26-45c2-a896-80965ff52b14)

     - Consulter un produit par son identifiant
       ![image](https://github.com/brahmdi/TP2_SD/assets/96790699/f5826f96-9ac2-45e3-9ad3-dca2516728b1)

     - Chercher des produits par certains critères
       ![image](https://github.com/brahmdi/TP2_SD/assets/96790699/bf42e98d-067d-42a8-8c17-a3ec6f083f65)

     - Mettre à jour les informations d'un produit
       ![image](https://github.com/brahmdi/TP2_SD/assets/96790699/2408efe8-1834-4aac-87eb-494bdb31216e)

     - Supprimer un produit
       ![image](https://github.com/brahmdi/TP2_SD/assets/96790699/5085fa45-ed30-4d81-9b0e-d81e6656d2fe)


7. **Migration vers MySQL**
   - Lorsque les fonctionnalités de base sont implémentées et testées avec H2 Database, migrez vers MySQL ou une autre base de données relationnelle selon les besoins de l'application.
     ![image](https://github.com/brahmdi/TP2_SD/assets/96790699/6a0830b0-ec03-4af1-9781-a10d9892aeef)


