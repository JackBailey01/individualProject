package com.spring.levels;
import com.spring.model.Account;
import com.spring.model.adminAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8081")
@RequestMapping("accounts")
public class intro{

    @Autowired
    private BusinessService service;


    @GetMapping("view/{accNo}")
    public ResponseEntity<Account> viewAccount(@PathVariable("accNo") Integer accNo){
        Account account = service.view(accNo);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<adminAccount> viewAccount(@RequestBody String data){
        adminAccount account = service.checklogin(data);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }



    @GetMapping("viewAll")
    public ResponseEntity<List<Account>> viewAll(){
        List<Account> accounts = service.getAllAccounts();
        return new ResponseEntity<>(accounts,HttpStatus.OK);
    }


    @PostMapping("create")
    public ResponseEntity<String> createAccount(@RequestBody String data){
        service.create(data);
        return new ResponseEntity<>("Account successfully added", HttpStatus.OK);

    }
    @PostMapping("delete/{id}")
    public ResponseEntity<String> deleteAccount(@PathVariable int id){
        service.delete(id);
        return new ResponseEntity<>("Account successfully deleted", HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<String> updateAccount(@RequestBody String data){
        service.update(data);
        return new ResponseEntity<>("success", HttpStatus.OK);

    }

}
