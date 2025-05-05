package pe.edu.upc.ariseapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "pe.edu.upc.ariseapp.repositories")
@EntityScan(basePackages = "pe.edu.upc.ariseapp.entities")
public class AriseApp {

    public static void main(String[] args) {
        SpringApplication.run(AriseApp.class, args);
    }
}
