package yukinarisoftware.spring.app;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yukinarisoftware.spring.app.data.ExampleWord;

import java.util.Set;

@SpringBootTest
public class CustomValidationSpringTest {

    @Autowired
    private Validator validator;

    @Test
    void testValid() {
        Set<ConstraintViolation<ExampleWord>> violations = validator.validate(new ExampleWord("ini"));
        Assertions.assertFalse(violations.isEmpty());
    }

    @Test
    void testNotValid() {
        Set<ConstraintViolation<ExampleWord>> violations = validator.validate(new ExampleWord("itu"));
        Assertions.assertTrue(!violations.isEmpty());
        Assertions.assertEquals(1, violations.size());
    }


}
