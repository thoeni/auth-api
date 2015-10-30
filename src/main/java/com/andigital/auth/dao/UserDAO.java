package com.andigital.auth.dao;

import com.andigital.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by antoniotroina
 * on 29/10/2015.
 */

public interface UserDAO extends JpaRepository<User, Integer> {
    User findById(int id);
}
