package com.kopivad.testingsystem.service.impl;

import com.kopivad.testingsystem.exception.UserNotFoundException;
import com.kopivad.testingsystem.form.SignUpForm;
import com.kopivad.testingsystem.domain.Role;
import com.kopivad.testingsystem.domain.User;
import com.kopivad.testingsystem.repository.UserRepository;
import com.kopivad.testingsystem.service.UserService;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ServiceUtils serviceUtils;


    @SneakyThrows
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User userFromDB = userRepository.findByEmail(email);
        return serviceUtils.getFullUser(userFromDB);
    }

    @Override
    public User saveUser(User user) {
        User userFromDB = userRepository.saveUser(user);
        return serviceUtils.getFullUser(userFromDB);

    }

    @SneakyThrows
    @Override
    public User getUserByEmail(String email) {
        User userFromDB = userRepository.findByEmail(email);
        return serviceUtils.getFullUser(userFromDB);
    }

    @Override
    public User getUserById(Long userId) {
        User userFromDB = userRepository.findUserById(userId);
        return serviceUtils.getFullUser(userFromDB);
    }

    @Override
    public User saveUser(SignUpForm signUpForm) {
        return this.saveUser(getUserFromForm(signUpForm));
    }

    @Override
    public boolean isUserExistByEmail(String email) {
        try {
            userRepository.findByEmail(email);
        } catch (UserNotFoundException e) {
            return false;
        }
        return true;
    }

    public User getUserFromForm(SignUpForm form) {
        return User
                .builder()
                .email(form.getEmail())
                .nickname(form.getNickname())
                .roles(Collections.singleton(Role.USER))
                .password(passwordEncoder.encode(form.getPassword()))
                .build();
    }
}
