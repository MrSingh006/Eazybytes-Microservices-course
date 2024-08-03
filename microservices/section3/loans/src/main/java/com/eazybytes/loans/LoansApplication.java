package com.eazybytes.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eazybytes.loans.controller") })
@EnableJpaRepositories("com.eazybytes.loans.repository")
@EntityScan("com.eazybytes.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Loans microservice REST API Documentation",
                description = "EazyBank Loans microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Paurav Singh",
                        email = "paurav@gmail",
                        url = "http://www.pauravsingh.com"
                ),
                license = @License(
                        name = "Published by Paurav",
                        url = "http://www.thisUrlIsASecret.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "EazyBank Loans microservice REST API Documentation",
                url = "http://www.thisUrlIsAlsoASecret.com"
        )
)
public class LoansApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoansApplication.class, args);
        System.out.println("Loans application Started");
    }

}
