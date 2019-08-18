package com.javaguru.lessons.lesson10.validation;

class UserValidationService {

    void validate(User user) {
        if (user.getName() == null) {
            throw new UserValidationException("User name must be not null.");
        }
        if (user.getName().isEmpty()) {
            throw new UserValidationException("User name must be not empty.");
        }
    }
}
