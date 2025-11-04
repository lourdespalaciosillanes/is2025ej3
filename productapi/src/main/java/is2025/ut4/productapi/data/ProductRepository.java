package is2025.ut4.productapi.data;

import is2025.ut4.productapi.domain.Product;
import java.util.List;

public interface ProductRepository {
    void save(Product product);
    List<Product> findAll();
}
