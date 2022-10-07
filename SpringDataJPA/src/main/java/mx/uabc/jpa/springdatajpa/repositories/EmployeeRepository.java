package mx.uabc.jpa.springdatajpa.repositories;

import mx.uabc.jpa.springdatajpa.entities.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findEmployeesByLastNameContaining(String str);

    Employee findByFirstName(String n);

    @Query("SELECT e from Employee e WHERE LOWER(e.firstName) = lower(:nombre) ")
    List<Employee> findEmployeesByCustom(String nombre);

}
