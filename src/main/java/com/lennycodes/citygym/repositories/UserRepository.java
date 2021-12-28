package com.lennycodes.citygym.repositories;

import com.lennycodes.citygym.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
