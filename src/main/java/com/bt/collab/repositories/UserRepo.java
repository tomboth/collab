package com.bt.collab.repositories;

import com.bt.collab.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
    @Query(value = "SELECT user FROM user", nativeQuery = true)
    Iterable<String> findAllUsers();
}
