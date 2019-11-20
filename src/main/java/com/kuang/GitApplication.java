package com.kuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ServletComponentScan
@EnableTransactionManagement
@EnableCaching
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GitApplication {
    public static void main(String[] args) {
        SpringApplication.run(GitApplication.class,args);
    }
}
