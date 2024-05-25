package com.ismailfajar.bankingapp.service;

import com.ismailfajar.bankingapp.dto.AccountDto;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto accounDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, Double amount);

    AccountDto withdraw(Long id, Double amount);

    List<AccountDto> getAllAccounts();
}
