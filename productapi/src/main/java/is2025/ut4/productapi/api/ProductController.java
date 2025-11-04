package is2025.ut4.productapi.api;

import is2025.ut4.productapi.domain.Product;
import is2025.ut4.productapi.application.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public void createProduct(@RequestBody Product product) {
        service.createProduct(product);
    }

    @GetMapping
    public List<Product> listProducts() {
        return service.listProducts();
    }
}
