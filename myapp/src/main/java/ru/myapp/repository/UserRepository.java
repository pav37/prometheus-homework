package ru.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.myapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}