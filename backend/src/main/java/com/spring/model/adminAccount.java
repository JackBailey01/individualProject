package com.spring.model;


import javax.persistence.*;


@Entity
@Table(name="adminAccounts")
public class adminAccount {
    public adminAccount(){}

    public adminAccount(Integer accNo, String userName, String password){
        this.accNo=accNo;
        this.UserName=userName;
        this.Password=password;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="accNo")
    private Integer accNo;

    @Column(name="userName")
    private String UserName;

    @Column(name="password")
    private String Password;

    public Integer getAccNo() {
        return accNo;
    }

    public void setAccNo(Integer accNo) {
        this.accNo = accNo;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}
