package com.javaguru.lessons.lesson8.validation;

abstract class AbstractValidationRule implements ValidationRule {
    
    public boolean checkNotNull(String str) {
        if (str == null) {
            return false;
        }
        return true;
    }
}
