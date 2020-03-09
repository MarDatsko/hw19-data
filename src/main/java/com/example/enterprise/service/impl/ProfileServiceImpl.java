package com.example.enterprise.service.impl;

import com.example.enterprise.model.Profile;
import com.example.enterprise.repos.ProfileRepo;
import com.example.enterprise.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepo profileRepo;

    @Autowired
    public ProfileServiceImpl(ProfileRepo profileRepo) {
        this.profileRepo = profileRepo;
    }

    @Override
    public List<Profile> getAll() {
        List<Profile> profiles = new ArrayList<>();
        profileRepo.findAll().forEach(profiles::add);
        return profiles;
    }

    @Override
    public Profile getById(Long id) {
        return profileRepo.findById(id).orElseThrow();
    }

    @Override
    public Profile saveOrUpdate(Profile account) {
        return profileRepo.save(account);
    }

    @Override
    public void delete(Long id) {
        profileRepo.deleteById(id);
    }
}
