package mx.uabc.jpa.springdatajpa;

import mx.uabc.jpa.springdatajpa.entities.Employee;
import mx.uabc.jpa.springdatajpa.entities.Product;
import mx.uabc.jpa.springdatajpa.repositories.EmployeeRepository;
import mx.uabc.jpa.springdatajpa.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.data.repository.CrudRepository;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    private void insertEmployees(EmployeeRepository repository) {
        repository.save(new Employee("Wilson","Perez"));
        repository.save(new Employee("Norma","Rodriguez"));
    }

    private void insertProducts(ProductRepository repository) {
        repository.save(new Product("Producto 1",1234.23));
        repository.save(new Product("Producto 2",7653.34));
    }


    @Order(value = 2)
    public CommandLineRunner run(EmployeeRepository repository){
        return (args)-> {
            repository.deleteAll();
            insertEmployees(repository);
            System.out.println(repository.findAll());
            System.out.println(repository.findEmployeesByLastNameContaining("Perez"));
            System.out.println(repository.findEmployeesByCustom("norma"));
            //System.out.println(repository.findByFirstName("Norma"));
        };
    }

    @Bean
    @Order(value = 1)
    public CommandLineRunner run(ProductRepository repository) {
        return (args) -> {
          repository.deleteAll();
          insertProducts(repository);
          System.out.println(repository.findAll());
        };
    }
}
