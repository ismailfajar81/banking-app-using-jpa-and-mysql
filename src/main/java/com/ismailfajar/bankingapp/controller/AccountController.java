package com.ismailfajar.bankingapp.controller;

import com.ismailfajar.bankingapp.dto.AccountDto;
import com.ismailfajar.bankingapp.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    //add Account Rest API
    @PostMapping
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto) {
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }

    //Get Account Rest API
    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable("id") Long id) {
        AccountDto accountDto = accountService.getAccountById(id);
        return ResponseEntity.ok(accountDto);
    }

}
