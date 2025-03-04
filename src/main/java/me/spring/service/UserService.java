package me.spring.service;
import me.spring.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);

}
