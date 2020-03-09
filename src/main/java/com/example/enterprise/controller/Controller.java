package com.example.enterprise.controller;

import com.example.enterprise.model.Account;
import com.example.enterprise.model.Profile;
import com.example.enterprise.service.AccountService;
import com.example.enterprise.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {

    private final AccountService accountService;
    private final ProfileService profileService;

    @Autowired
    public Controller(AccountService accountService, ProfileService profileService) {
        this.accountService = accountService;
        this.profileService = profileService;
    }

    public void executeProgram(){
        createModel();
        readModel();
        updateModel();
        deleteModel();
    }

    private void createModel(){
        Account account = new Account( 1001L,"Marik", "Cat", "Kiev", "male", "Kin");
        accountService.saveOrUpdate(account);
        Profile profile = new Profile( 1001L,"Kin", "Trainee", "Ok", "Google", "SQL");
        profileService.saveOrUpdate(profile);
    }

    private void readModel(){
        accountService.getAll().forEach(System.out::println);
        profileService.getAll().forEach(System.out::println);
    }

    private void updateModel(){
        Account account = new Account( 3L,"Igor", "Dog", "Lviv", "female", "Kinza");
        accountService.saveOrUpdate(account);
        Profile profile = new Profile(3L, "Kinza", "Trainee", "Ok", "Bazar", "c/c++");
        profileService.saveOrUpdate(profile);
    }

    private void deleteModel(){
        accountService.delete(251L);
        profileService.delete(251L);
    }

}
