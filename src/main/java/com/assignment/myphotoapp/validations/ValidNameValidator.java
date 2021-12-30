package com.assignment.myphotoapp.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidNameValidator implements ConstraintValidator<CustomNameValidations, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s.matches("[a-zA-Z 0-9.]+")){
            return true;
        }else {
            return false;
        }
    }
}
