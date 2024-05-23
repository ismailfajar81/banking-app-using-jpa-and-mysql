package com.ismailfajar.bankingapp.service;

import com.ismailfajar.bankingapp.dto.AccountDto;

public interface AccountService {

    AccountDto createAccount(AccountDto accounDto);

    AccountDto getAccountById(Long id);
}
