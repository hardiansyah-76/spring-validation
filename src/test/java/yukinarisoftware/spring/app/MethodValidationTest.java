package yukinarisoftware.spring.app;


import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yukinarisoftware.spring.app.helper.SayHelloHelper;

@SpringBootTest
public class MethodValidationTest {

    @Autowired
    private SayHelloHelper sayHelloHelper;

    @Test
    void testSuccess() {
        String message = sayHelloHelper.sayHello("yuki");
        Assertions.assertEquals("hello yuki", message);
    }

    @Test
    void testFail() {
        Assertions.assertThrows(ConstraintViolationException.class, () -> {
           sayHelloHelper.sayHello("");
        });
    }
}
