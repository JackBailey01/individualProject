package com.spring.model;

import org.springframework.stereotype.Repository;
import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional(SUPPORTS)
public class AccountRepositoryImpl implements AccountRepositoryCustom {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Account getById(Integer accNo){
        return entityManager.find(Account.class, accNo);
    }

    @Override
    public List<Account> getAllAccounts(){
        TypedQuery<Account> query = entityManager.createQuery("SELECT m FROM Account m", Account.class);
        List<Account> accounts = (List<Account>) query.getResultList();
        return accounts;

    }

}
