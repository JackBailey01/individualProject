package com.spring.model;



public interface adminAccountRepository {
    adminAccount login(String userName, String password);
}

