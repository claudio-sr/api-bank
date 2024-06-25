package com.claudio.api_banco.service;

import com.claudio.api_banco.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
