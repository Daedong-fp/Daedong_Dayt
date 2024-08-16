package com.example.daedong_dayt.domain.user.application;

import com.example.daedong_dayt.domain.user.application.facade.UserFaced;
import com.example.daedong_dayt.domain.user.dao.UserRepository;
import com.example.daedong_dayt.domain.user.domain.User;
import com.example.daedong_dayt.domain.user.dto.Request.UpdateMyInfoRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateMyInfoService {

    private final UserRepository userRepository;

    private final UserFaced userFaced;

    private final PasswordEncoder passwordEncoder;

    public void updateMyInfo(UpdateMyInfoRequest request){

        User user = userFaced.currentUser();

        user.updateMyInfo(
                request.getUsername(),
                passwordEncoder.encode(request.getPassword()),
                request.getName(),
                request.getIntroduce());

    }


}
