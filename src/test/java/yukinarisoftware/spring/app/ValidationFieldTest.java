package yukinarisoftware.spring.app;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yukinarisoftware.spring.app.data.User;

import java.util.Set;

@SpringBootTest
public class ValidationFieldTest {

    @Autowired
    private Validator validator;

    @Test
    void testValid() {
        var user = new User("yuki", "1");
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        Assertions.assertTrue(violations.isEmpty());
    }

    @Test
    void testNotValid() {
        var user = new User();
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        Assertions.assertTrue(!violations.isEmpty());
        Assertions.assertEquals(2, violations.size());
    }
}
