package com.getvrom.getvrombackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class GetvromBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetvromBackendApplication.class, args);

        String dbUrl = "jdbc:h2://localhost:3306/getVrom?useSSL=false&serverTimezone=UTC";
        String dbUser = "root";
        String dbPassword = "TayTay@1972";

        try {
            Connection myConn = DriverManager.getConnection(dbUrl,dbUser, dbPassword);
            System.out.println("Successful Connection!!!");

        }catch (Exception exc) {
            exc.printStackTrace();
        }
    }

}
