package com.example.enterprise.repos;

import com.example.enterprise.model.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepo extends CrudRepository<Profile,Long> {
}
