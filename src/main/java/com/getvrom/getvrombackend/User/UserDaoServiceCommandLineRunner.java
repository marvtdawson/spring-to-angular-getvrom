package com.getvrom.getvrombackend.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log = (Logger) LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

    @Autowired
    UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {

        User user = new User("Marvin", "Dawson", "SuperAdmin");
        long insert = userDAOService.insert(user);
        log.info("New User is created: " + user);
    }
}
