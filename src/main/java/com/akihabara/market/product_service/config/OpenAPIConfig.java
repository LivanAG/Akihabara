package com.akihabara.market.product_service.config;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Akihabara Product Service API",
                version = "1.0.0",
                description = "Microservicio REST para la gestión de productos otaku en la tienda Akihabara Market.",
                contact = @Contact(
                        name = "Livan - Desarrollador Otaku",
                        email = "livan@akihabara.dev",
                        url = "https://akihabara.dev"
                ),
                license = @License(
                        name = "MIT License",
                        url = "https://opensource.org/licenses/MIT"
                )
        )
)
public class OpenAPIConfig {
}

