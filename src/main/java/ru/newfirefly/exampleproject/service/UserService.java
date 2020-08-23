package ru.newfirefly.exampleproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.newfirefly.exampleproject.model.User;
import ru.newfirefly.exampleproject.repository.UserRepository;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(Integer id){
        return userRepository.getOne(id);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void delete(Integer id){
        userRepository.deleteById(id);
    }
}
