package com.tianyalei.hsl;

import com.tianyalei.hsl.core.base.SimpleJpaRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = SimpleJpaRepositoryImpl.class)
public class MachineApplication {

    public static void main(String[] args) {
        SpringApplication.run(MachineApplication.class, args);
    }

}

