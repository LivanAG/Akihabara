package com.akihabara.market.product_service.controller;

import com.akihabara.market.product_service.model.ProductoOtaku;
import com.akihabara.market.product_service.repository.ProductoRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Productos", description = "Operaciones CRUD para productos otaku")
@RestController
@RequestMapping("/productos")
public class ProductoController{


    private final ProductoRepository productoRepository;

    public ProductoController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }


    @Operation(summary = "Obtener todos los productos", description = "Devuelve una lista de todos los productos registrados.")
    @GetMapping
    public List<ProductoOtaku> getAllProductos() {
        return productoRepository.findAll();
    }

    @Operation(summary = "Obtener producto por ID", description = "Devuelve un producto específico según su ID.")
    @GetMapping("/{id}")
    public ProductoOtaku getProductoById(@PathVariable long id) {
        return productoRepository.findById(id).orElseThrow();
    }

    @Operation(summary = "Crear nuevo producto", description = "Agrega un nuevo producto al inventario otaku.")
    @PostMapping
    public ProductoOtaku createProducto(@Valid @RequestBody ProductoOtaku producto) {
        return productoRepository.save(producto);
    }

    @Operation(summary = "Actualizar producto", description = "Actualiza un producto existente por ID.")
    @PutMapping("/{id}")
    public ProductoOtaku updateProducto(@PathVariable long id, @Valid @RequestBody ProductoOtaku producto) {
        ProductoOtaku productoAntiguo = productoRepository.findById(id).orElseThrow();
        producto.setId(productoAntiguo.getId());
        return productoRepository.save(producto);
    }

    @Operation(summary = "Eliminar producto", description = "Elimina un producto del inventario otaku por ID.")
    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable long id) {
        productoRepository.deleteById(id);
    }
}
