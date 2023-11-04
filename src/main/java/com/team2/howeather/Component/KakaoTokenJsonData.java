package com.team2.howeather.Component;

import com.team2.howeather.DTO.KakaoTokenResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Component
@RequiredArgsConstructor
public class KakaoTokenJsonData {
    private final WebClient webClient;
    private static final String TOKEN_URI = "https://kauth.kakao.com/oauth/token";
    private static final String REDIRECT_URI = "http://localhost:8080/oauth/";
    private static final String GRANT_TYPE = "authorization_code";
    private static final String CLIENT_ID = "1bc04bba90d5213d8d39d0622828b5bc";

    public KakaoTokenResponse getToken(String code) {
        String uri = TOKEN_URI + "?grant_type=" + GRANT_TYPE + "&client_id=" + CLIENT_ID + "&redirect_uri=" + REDIRECT_URI + "&code=" + code;
        System.out.println(uri);

        Flux<KakaoTokenResponse> response = webClient.post()
                .uri(uri)
                .contentType(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(KakaoTokenResponse.class);

        return response.blockFirst();
    }
}