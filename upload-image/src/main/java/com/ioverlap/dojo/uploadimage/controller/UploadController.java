package com.ioverlap.dojo.uploadimage.controller;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UploadController {

    public static final String UPLOAD = "/upload";

    @Value("${server.bucket.path}")
    private String bucketPath;

    @PostMapping(value = UPLOAD)
    public Map<String, Object> upload(@RequestParam("file") MultipartFile file) throws IOException {
        LogManager.getLogger(this.getClass()).info(file.getName() + " | " + file.getSize() + " | type: " + file.getContentType());

        // save file
        file.transferTo(new File(bucketPath + file.getOriginalFilename()));

        Map<String, Object> result = new HashMap<>();
        result.put("Success", true);
        return result;
    }
}
