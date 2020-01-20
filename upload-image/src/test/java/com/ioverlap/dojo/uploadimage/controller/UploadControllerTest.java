package com.ioverlap.dojo.uploadimage.controller;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.*;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.net.URI;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UploadControllerTest {

    @Value("${local.server.port}")
    private int port;

    @Test
    public void testUploadFile() throws IOException {
        URI uri = UriComponentsBuilder.fromHttpUrl("http://localhost").port(port).path("/upload").build().encode().toUri();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);

        MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.add("file", new FileSystemResource(new ClassPathResource("file2test.txt").getFile()));

        ResponseEntity<String> responseEntity = new RestTemplate().exchange(uri, HttpMethod.POST, new HttpEntity<>(body, headers) ,String.class);

        LogManager.getLogger(this.getClass()).info(responseEntity.getBody());
        assertEquals("{\"Success\":false}", responseEntity.getBody());
    }

    @Test
    public void testUploadImage() throws IOException {
        URI uri = UriComponentsBuilder.fromHttpUrl("http://localhost").port(port).path("/upload").build().encode().toUri();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);

        MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.add("file", new FileSystemResource(new ClassPathResource("image2test.png").getFile()));

        ResponseEntity<String> responseEntity = new RestTemplate().exchange(uri, HttpMethod.POST, new HttpEntity<>(body, headers) ,String.class);

        LogManager.getLogger(this.getClass()).info(responseEntity.getBody());
        assertEquals("{\"Success\":true}", responseEntity.getBody());
    }
}
