package com.spring.levels;
import com.google.gson.Gson;
import com.spring.model.Account;
import com.spring.model.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class BusinessLogic implements BusinessService{

    @Autowired
    private AccountRepository dao;

    public void create(String data){
        Account account = new Gson().fromJson(data, Account.class);
        dao.save(account);
    }
    public void delete(Integer accNo){
        Account account = dao.getById(accNo);
        dao.delete(account);
    }
    public Account view(Integer accNo){
        Account account = dao.getById(accNo);
        return account;

    }
    public void update(String data){
        Account account = new Gson().fromJson(data, Account.class);
        int accNo = account.getAccNo();
        Account account2 = dao.getById(accNo);
        account2.setFirstName(account.getFirstName());
        account2.setLastName(account.getLastName());
        dao.save(account);
    }

    public List<Account> getAllAccounts(){
        List<Account> accounts = dao.getAllAccounts();
        return accounts;
    }

}
