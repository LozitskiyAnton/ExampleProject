package ru.newfirefly.exampleproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.newfirefly.exampleproject.model.User;


import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findByLastName(String lasatName);
}
