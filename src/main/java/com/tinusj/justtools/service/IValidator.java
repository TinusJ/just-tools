package com.tinusj.justtools.service;

import com.tinusj.justtools.entity.ValidationResponse;

public interface IValidator {
    ValidationResponse validate(String fileAsString);
}
