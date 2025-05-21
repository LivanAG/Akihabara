package com.akihabara.market.product_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Min;

@Entity
public class ProductoOtaku {

    // 🔧 Constructor sin argumentos (necesario para JPA)
    public ProductoOtaku() {
    }

    // 💡 Constructor con argumentos (útil para insertar datos)
    public ProductoOtaku(Long id, String nombre, String categoria, Double precio, Integer stock) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "La categoría es obligatoria")
    private String categoria;

    @Positive(message = "El precio debe ser positivo")
    private Double precio;

    @Min(value = 0, message = "El stock no puede ser negativo")
    private Integer stock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "El nombre es obligatorio") String getNombre() {
        return nombre;
    }

    public void setNombre(@NotBlank(message = "El nombre es obligatorio") String nombre) {
        this.nombre = nombre;
    }

    public @NotBlank(message = "La categoría es obligatoria") String getCategoria() {
        return categoria;
    }

    public void setCategoria(@NotBlank(message = "La categoría es obligatoria") String categoria) {
        this.categoria = categoria;
    }

    public @Positive(message = "El precio debe ser positivo") Double getPrecio() {
        return precio;
    }

    public void setPrecio(@Positive(message = "El precio debe ser positivo") Double precio) {
        this.precio = precio;
    }

    public @Min(value = 0, message = "El stock no puede ser negativo") Integer getStock() {
        return stock;
    }

    public void setStock(@Min(value = 0, message = "El stock no puede ser negativo") Integer stock) {
        this.stock = stock;
    }
}
