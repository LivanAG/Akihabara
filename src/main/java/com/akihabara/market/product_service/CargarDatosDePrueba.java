package com.akihabara.market.product_service;

import com.akihabara.market.product_service.model.ProductoOtaku;
import com.akihabara.market.product_service.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CargarDatosDePrueba {

    @Bean
    CommandLineRunner init(ProductoRepository repo) {
        return args -> {
            repo.save(new ProductoOtaku(null, "Figura de Luffy", "Figura", 18.00, 8));
            repo.save(new ProductoOtaku(null, "Manga de Naruto", "Manga", 11.00, 14));
            repo.save(new ProductoOtaku(null, "Póster de One Piece", "Poster", 5.00, 27));
        };
    }
}
