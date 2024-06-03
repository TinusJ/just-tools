package com.tinusj.justtools.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileService {

    /**
     * Reads the content of the provided MultipartFile.
     *
     * @param file The file to read.
     * @return The content of the file as a String.
     * @throws IOException if reading the file fails.
     */
    public String readFileContent(MultipartFile file) throws IOException {
        return new String(file.getBytes());
    }
}