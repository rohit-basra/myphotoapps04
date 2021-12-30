package com.assignment.myphotoapp.validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidNameValidator.class)
@Documented
public @interface CustomNameValidations {
    String message() default "{allow only letters a-z or A-Z and numbers}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
