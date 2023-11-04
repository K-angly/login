//package com.team2.howeather.Service;
//
//import com.fasterxml.jackson.databind.util.JSONPObject;
//import org.apache.tomcat.util.json.JSONParser;
//import org.springframework.stereotype.Service;
//
//import java.io.*;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//@Service
//public class KakaoService {
//    public String getToken(String code) throws IOException {
//        String host = "https://kauth.kakao.com/oauth/token";
//        URL url = new URL(host);
//        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//        String token = "";
//        try {
//            urlConnection.setRequestMethod("POST");
//            urlConnection.setDoOutput(true);
//
//            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(urlConnection.getOutputStream()));
//            StringBuilder sb = new StringBuilder();
//            sb.append("grant_type=authorization_code");
//            sb.append("&client_id=4d36ebc7c118a619f644448861b482f4");
//            sb.append("&redirect_uri=http://localhost:8080/login/oauth2/code/kakao");
//            sb.append("&code=" + code);
//
//            bw.write(sb.toString());
//            bw.flush();
//
//            BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//            String line = "";
//            String res = "";
//            while((line=br.readLine()) != null) {
//                res += line;
//            }
//
//            System.out.println("res = " + res);
//
//
//        }
//    }
//}
