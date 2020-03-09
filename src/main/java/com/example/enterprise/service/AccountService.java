package com.example.enterprise.service;

import com.example.enterprise.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAll();

    Account getById(Long id);

    Account saveOrUpdate(Account account);

    void delete(Long id);
}
