package com.Pharmacy.Pharmacy.Controler;
import com.Pharmacy.Pharmacy.entities.Product;
import com.Pharmacy.Pharmacy.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProductController {

    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/Product")
    public List<Product> getAll() {
        return repository.findAll();
    }
    @PostMapping("/Product")
    public Product createProduct(@RequestBody Product product) {
        return repository.save(product);
    }
    @PutMapping("/Product/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product newProduct) {
        return repository.findById(id).map(product -> {
            product.setNom(newProduct.getNom());
            product.setQuantite(newProduct.getQuantite());
            product.setPrix(newProduct.getPrix());
            product.setDescription(newProduct.getDescription());
            return repository.save(product);
        }).orElseThrow(() -> new RuntimeException("Produit non trouvé"));
    }
    @DeleteMapping("/Product/{id}")
    public void deleteProduct(@PathVariable Long id) {
        repository.deleteById(id);
    }

}

