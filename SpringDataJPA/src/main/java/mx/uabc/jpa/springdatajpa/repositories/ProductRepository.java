package mx.uabc.jpa.springdatajpa.repositories;

import mx.uabc.jpa.springdatajpa.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
