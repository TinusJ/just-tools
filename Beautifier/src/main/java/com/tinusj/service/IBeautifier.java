package com.tinusj.service;

import org.springframework.stereotype.Service;

@Service
public interface IBeautifier {

    String beautify(String fileAsString);
}
