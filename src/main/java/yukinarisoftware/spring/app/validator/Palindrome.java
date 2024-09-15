package yukinarisoftware.spring.app.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Target({ElementType.FIELD, ANNOTATION_TYPE })
@Constraint(validatedBy = PalindromeValidator.class)
@Retention(RUNTIME)
public @interface Palindrome {

    String message() default "{application.messages}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
