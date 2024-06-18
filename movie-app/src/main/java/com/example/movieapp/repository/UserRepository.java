package com.example.movieapp.repository;

import com.example.movieapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
<<<<<<< HEAD
    Object findByEmail(String email);
=======
    Optional<User> findByEmail(String email);
<<<<<<< HEAD

=======
>>>>>>> f26bf26f2b3ddaf48ba9fdfef84ec05492b9ebee
>>>>>>> 5ca0e6c9ec4499f555668404fb6c6f118afc1c0d
}