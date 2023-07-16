package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.MySQLContainer;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringbootHibernateCompositeKeyDemoApplication {

    @Bean
    @ServiceConnection
    MySQLContainer<?> mysqlContainer() {
        return new MySQLContainer<>("mysql:latest");
    }

    public static void main(String[] args) {
        SpringApplication.from(SpringbootHibernateCompositeKeyDemoApplication::main)
                .with(TestSpringbootHibernateCompositeKeyDemoApplication.class)
                .run(args);
    }

}


