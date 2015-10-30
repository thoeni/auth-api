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
public interface UserService {

    User getUserById(String id);
}
