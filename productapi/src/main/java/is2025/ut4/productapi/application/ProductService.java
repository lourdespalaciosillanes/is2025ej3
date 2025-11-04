package is2025.ut4.productapi.application;

import is2025.ut4.productapi.domain.Product;
import is2025.ut4.productapi.data.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void createProduct(Product product) {
        repository.save(product);
    }

    public List<Product> listProducts() {
        return repository.findAll();
    }
}
