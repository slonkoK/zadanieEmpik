package com.ola.empik.services;

import com.ola.empik.models.UserInformation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    public UserInformation process() {
        log.warn("przetwarzamy proces");
        return new UserInformation();
    }
}
