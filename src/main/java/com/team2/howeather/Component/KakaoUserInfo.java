package com.team2.howeather.Component;

import com.team2.howeather.DTO.KakaoUserInfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Component
public class KakaoUserInfo {
    private final WebClient webClient;
    private static final String USER_INFO_URI = "https://kapi.kakao.com/v2/user/me";

    public KakaoUserInfoDto getUserInfo(String token) {
        String uri = USER_INFO_URI;

        Flux<KakaoUserInfoDto> response = webClient.get()
                .uri(uri)
                .header("Authorization", "Bearer " + token)
                .retrieve()
                .bodyToFlux(KakaoUserInfoDto.class);

        return response.blockFirst();
    }
}