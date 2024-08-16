package com.example.daedong_dayt.domain.auth.application;

import com.example.daedong_dayt.domain.auth.dto.request.LoginRequest;
import com.example.daedong_dayt.domain.auth.dto.response.LoginResponse;
import com.example.daedong_dayt.domain.auth.exception.PasswordMismatchException;
import com.example.daedong_dayt.domain.user.dao.UserRepository;
import com.example.daedong_dayt.domain.user.domain.User;
import com.example.daedong_dayt.domain.user.exception.UserNotFoundException;
import com.example.daedong_dayt.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserRepository userRepository;
    private final JwtTokenProvider jwtTokenProvider;
    private final PasswordEncoder passwordEncoder;


    @Transactional
    public LoginResponse login(LoginRequest request) {

        if (userRepository.existsByUsername(request.getUsername())) {
            User user = userRepository.findByUsername(request.getUsername())
                    .orElseThrow(() -> UserNotFoundException.EXCEPTION);

            if (!passwordEncoder.matches(request.getPassword(), user.getPassword()))
                throw PasswordMismatchException.EXCEPTION;

        }
        return jwtTokenProvider.receiveToken(request.getUsername());
    }
}