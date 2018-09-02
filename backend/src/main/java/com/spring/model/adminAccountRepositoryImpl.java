package com.spring.model;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import static javax.transaction.Transactional.TxType.SUPPORTS;

@Repository
@Transactional(SUPPORTS)
public class adminAccountRepositoryImpl implements adminAccountRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public adminAccount login(String userName, String password){
        TypedQuery<adminAccount> query = entityManager.createQuery("SELECT m FROM adminAccount m WHERE m.UserName='"+ userName +"' AND m.Password = '"+ password +"'" , adminAccount.class);
        adminAccount account = (adminAccount) query.getSingleResult();
        return account;
    }
}
