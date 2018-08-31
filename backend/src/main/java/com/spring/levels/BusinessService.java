package com.spring.levels;

import com.spring.model.Account;

import java.util.List;

public interface BusinessService {
    Account view(Integer id);
    void delete(String data);
    void create(String data);
    void update(String data);
    List<Account> getAllAccounts();
}
