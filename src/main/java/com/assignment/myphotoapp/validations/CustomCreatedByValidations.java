package com.assignment.myphotoapp.validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidCreatedByValidator.class)
@Documented
public @interface CustomCreatedByValidations {
    String message() default
        "{allow only letters a-z and numbers}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
