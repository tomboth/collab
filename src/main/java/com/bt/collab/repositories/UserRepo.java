package com.bt.collab.repositories;

import com.bt.collab.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, String> {
}
