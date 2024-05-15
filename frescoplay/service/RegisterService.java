package com.fresco.apigateway.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import com.fresco.apigateway.model.User;
import com.fresco.apigateway.repo.UserRepository;


@Service
public class RegisterService {
  @Autowired
  private UserRepository repo;
  @Autowired
  private BCryptPasswordEncoder passwordEncoder;


  public void registerUser(String fullname, String username, String password) {
      String encryptedPassword = passwordEncoder.encode(password);
      User user = new User();
        user.setFullname(fullname);
        user.setUsername(username);
        user.setPassword(encryptedPassword);


        // Save the user to the database
        repo.save(user);
  }
}
