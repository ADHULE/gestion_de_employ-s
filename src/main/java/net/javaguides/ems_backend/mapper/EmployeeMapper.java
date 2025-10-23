package net.javaguides.ems_backend.mapper;

import net.javaguides.ems_backend.dto.EmployeeDto;
import net.javaguides.ems_backend.entity.Employee;

/**
 * Classe utilitaire qui permet de convertir un objet Employee (entité)
 * en EmployeeDto (DTO) et inversement.
 *
 * Cette couche permet de séparer la logique métier (entité)
 * de la représentation exposée à l’extérieur (DTO).
 */
public class EmployeeMapper {

    /**
     * Convertit un objet Employee (entité JPA) vers un EmployeeDto.
     *
     * @param employee entité provenant de la base de données
     * @return EmployeeDto contenant les mêmes données
     */
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    /**
     * Convertit un EmployeeDto (reçu par le frontend) vers un objet Employee (entité JPA).
     *
     * @param employeeDto données reçues via l'API REST
     * @return entité Employee prête à être enregistrée en base de données
     */
    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setEmail(employeeDto.getEmail());
        return employee;
    }
}
