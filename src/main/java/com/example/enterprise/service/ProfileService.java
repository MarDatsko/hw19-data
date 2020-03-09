package com.example.enterprise.service;

import com.example.enterprise.model.Profile;

import java.util.List;

public interface ProfileService {
    List<Profile> getAll();

    Profile getById(Long id);

    Profile saveOrUpdate(Profile account);

    void delete(Long id);
}
