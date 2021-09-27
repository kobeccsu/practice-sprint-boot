package com.leizhou.restcontrollers;

import com.leizhou.beans.Login;
import com.leizhou.beans.User;
import com.leizhou.exceptions.LoginFailureException;
import com.leizhou.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginRestController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/api/loginuser")
    public ResponseEntity loginUser(@RequestBody Login login) throws LoginFailureException {
        System.out.println(login.getUsername() + " , " + login.getPassword());
        User user = userRepository.searchByName(login.getUsername());

        if(user == null){
            return ResponseEntity.status(404).build();
        }

        if(!user.getPassword().equals(login.getPassword())){
            throw new LoginFailureException("Not found login user");
        }

        return new ResponseEntity(HttpStatus.OK);
    }
}
