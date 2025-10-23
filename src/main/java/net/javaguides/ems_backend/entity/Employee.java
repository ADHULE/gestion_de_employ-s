package net.javaguides.ems_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Représente un employé dans la base de données.
 * Cette classe est une entité JPA liée à la table "employees".
 * Lombok génère automatiquement les getters, setters et le constructeur sans argument.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employees") // Convention : nom de table au pluriel
public class Employee {

    /**
     * Identifiant unique de l'employé.
     * Généré automatiquement par la base de données (auto-incrémentation).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Prénom de l'employé.
     * Mappé à la colonne "first_name" dans la base de données.
     */
    @Column(name = "first_name", nullable = false)
    private String firstName;

    /**
     * Nom de famille de l'employé.
     * Mappé à la colonne "last_name".
     */
    @Column(name = "last_name", nullable = false)
    private String lastName;

    /**
     * Adresse e-mail unique de l'employé.
     * Le champ est obligatoire (nullable = false) et doit être unique.
     */
    @Column(name = "email_id", nullable = false, unique = true)
    private String email;


}
