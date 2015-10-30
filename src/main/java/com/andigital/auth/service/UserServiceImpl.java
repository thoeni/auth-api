package com.andigital.auth.service;

import com.andigital.auth.dao.UserDAO;
import com.andigital.auth.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by antoniotroina
 * on 29/10/2015.
 */
@Component
public class UserServiceImpl implements UserService {

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDAO userDAO;


    public User getUserById(String id) {
        logger.info("Into UserService...");
        return userDAO.findById(Integer.valueOf(id));
    }
}
