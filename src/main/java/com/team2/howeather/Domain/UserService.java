package com.team2.howeather.Domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public Long createUser(String nickname, String email) {
        User user = User.builder()
                .email(email)
                .nickname(nickname)
                .build();

        userRepository.save(user);
        log.info("새로운 회원 저장 완료");
        return user.id;
    }
}