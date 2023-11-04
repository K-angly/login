package com.team2.howeather.Controller;

import jakarta.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class ImageController {
    @RequestMapping(
            value = "/image/kakao",
            method = RequestMethod.GET
    )
    public void getImageWithMediaType(HttpServletResponse response) throws IOException {
        InputStream in = getClass().getResourceAsStream("/static/static/images/Kakao.png");
        System.out.println(in.toString());
        response.setContentType(MediaType.IMAGE_PNG_VALUE);
        IOUtils.copy(in, response.getOutputStream());
    }
}
