package com.getvrom.getvrombackend.User;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user) {
        // Open Transaction
        entityManager.persist(user);
        return user.getId();
    }
}
