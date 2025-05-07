# 💊 Pharmacy API – Gestion des produits pharmaceutiques

> Application RESTful développée avec **Spring Boot**, permettant la gestion complète d’un stock de produits pharmaceutiques (ajout, modification, suppression et consultation).

## 📌 Présentation

Ce projet a été conçu pour répondre aux besoins d’une nouvelle pharmacie souhaitant gérer efficacement ses produits en stock. L'application propose une API REST permettant de :

- Ajouter des produits à la base de données
- Modifier les informations des produits existants
- Supprimer des produits obsolètes
- Consulter la liste des produits disponibles

## 🚀 Fonctionnalités principales

- 🔄 CRUD complet sur les produits
- ✅ Gestion automatique des identifiants
- 📦 Structure MVC (Model-View-Controller)
- 🔒 Gestion d’exceptions (produit non trouvé, erreurs de validation, etc.)

## 🛠️ Technologies utilisées

| Outil/Technologie   | Rôle                            |
|---------------------|----------------------------------|
| Java 17+            | Langage principal                |
| Spring Boot         | Framework back-end               |
| Spring Data JPA     | ORM et gestion des données       |
| Hibernate           | Mapping objet-relationnel        |
| MySQL/PostgreSQL    | Base de données relationnelle    |
| Postman             | Tests des endpoints API          |
| Maven               | Gestion de dépendances           |
| Git / GitHub        | Suivi de version du code         |
| Lombok              | Réduction du boilerplate Java    |

## 🗂️ Structure du projet
src/
├── controller/
├── model/
├── repository/
├── service/
└── exceptions/
## 📬 Endpoints principaux

| Méthode | Endpoint             | Description                     |
|--------|----------------------|---------------------------------|
| POST   | /api/products        | Ajouter un nouveau produit      |
| GET    | /api/products        | Lister tous les produits        |
| GET    | /api/products/{id}   | Détails d’un produit            |
| PUT    | /api/products/{id}   | Modifier un produit             |
| DELETE | /api/products/{id}   | Supprimer un produit            |

## 🗓️ Délai & Modalités

- Date de lancement : 05/05/2025 à 10h00
- Date limite : 09/05/2025 à 23h59
- Travail individuel

## 👩‍💻 Auteur

**Sanaa Sadad**  
Projet réalisé dans le cadre de la formation développeur web & web mobile [2025]

