package com.example.enterprise.repos;

import com.example.enterprise.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends CrudRepository<Account,Long> {
}
