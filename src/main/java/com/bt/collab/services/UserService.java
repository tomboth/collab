package com.bt.collab.services;

import com.bt.collab.models.Message;
import com.bt.collab.models.User;
import com.bt.collab.repositories.MessageRepo;
import com.bt.collab.repositories.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepo userRepo;
    MessageRepo messageRepo;

    public UserService(UserRepo userRepo, MessageRepo messageRepo) {
        this.userRepo = userRepo;
        this.messageRepo = messageRepo;
    }

    public void saveUser(User user) {
        userRepo.save(user);
    }

    public void saveMessage(Message message) {
        message.setTimeStamp(System.currentTimeMillis());
        messageRepo.save(message);
    }

    public Iterable<Message> findMessages() {
        return messageRepo.findAll();
    }
}
