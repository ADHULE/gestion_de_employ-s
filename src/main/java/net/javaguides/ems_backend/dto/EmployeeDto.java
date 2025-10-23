package net.javaguides.ems_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Représente un objet de transfert de données (DTO) pour un employé.
 * Ce DTO est utilisé pour transférer les données entre le backend et le frontend,
 * sans exposer directement l'entité JPA.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    /** Identifiant de l'employé (même valeur que dans la base de données). */
    private Long id;

    /** Prénom de l'employé. */
    private String firstName;

    /** Nom de famille de l'employé. */
    private String lastName;

    /** Adresse e-mail de l'employé. */
    private String email;
}
