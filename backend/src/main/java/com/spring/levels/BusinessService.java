package com.spring.levels;

import com.spring.model.Account;
import com.spring.model.adminAccount;

import java.util.List;

public interface BusinessService {
    Account view(Integer id);
    void delete(int id);
    void create(String data);
    void update(String data);
    List<Account> getAllAccounts();
    adminAccount checklogin(String data);
}
