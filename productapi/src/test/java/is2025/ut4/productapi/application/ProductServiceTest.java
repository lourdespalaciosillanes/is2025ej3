package is2025.ut4.productapi.application;

import is2025.ut4.productapi.domain.Product;
import is2025.ut4.productapi.data.InMemoryProductRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @Test
    void testCreateAndListProducts() {
        var repository = new InMemoryProductRepository();
        var service = new ProductService(repository);

        Product p = new Product("P001", "Laptop", 1500.0, 10);
        service.createProduct(p);

        List<Product> products = service.listProducts();
        assertEquals(1, products.size());
        assertEquals("Laptop", products.get(0).getDescription());
    }
}
