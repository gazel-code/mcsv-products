package house.microservicio_products.services;

import house.microservicio_products.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();

    Optional<Product> findById(Long id);

}
