package com.example.enterprise.service.impl;

import com.example.enterprise.model.Account;
import com.example.enterprise.repos.AccountRepo;
import com.example.enterprise.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepo accountRepo;

    @Autowired
    public AccountServiceImpl(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    @Override
    public List<Account> getAll() {
        List<Account> accounts = new ArrayList<>();
        accountRepo.findAll().forEach(accounts::add);
        return accounts;
    }

    @Override
    public Account getById(Long id) {
        return accountRepo.findById(id).orElseThrow();
    }

    @Override
    public Account saveOrUpdate(Account account) {
        return accountRepo.save(account);
    }

    @Override
    public void delete(Long id) {
        accountRepo.deleteById(id);
    }
}
