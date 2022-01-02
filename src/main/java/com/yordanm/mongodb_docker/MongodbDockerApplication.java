package com.yordanm.mongodb_docker;

import com.yordanm.mongodb_docker.model.Address;
import com.yordanm.mongodb_docker.model.Transaction;
import com.yordanm.mongodb_docker.model.User;
import com.yordanm.mongodb_docker.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MongodbDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongodbDockerApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            Address address1 = new Address("Chumerna", 12, "Madan");
            Address address2 = new Address("Elha", 1, "Polski Trumbesh");
            Transaction transaction1 = new Transaction(123.34);
            Transaction transaction2 = new Transaction(789.99);

            User user = new User(
                    "1",
                    "Jordan",
                    "Marinov",
                    List.of(address1, address2),
                    List.of(transaction1, transaction2)
            );
            userRepository.save(user);
        };
    }
}
