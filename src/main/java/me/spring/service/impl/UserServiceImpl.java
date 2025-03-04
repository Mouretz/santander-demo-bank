package me.spring.service.impl;

import me.spring.domain.model.User;
import me.spring.domain.repository.UserRepository;
import me.spring.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
        //Bucar usuario por id, caso nao ache lance uma excecao de elemento nao encontrado
    }


    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This User Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }

}


