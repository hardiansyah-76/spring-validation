package yukinarisoftware.spring.app.helper;

import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
public class SayHelloHelper {

    public String sayHello(@NotBlank String name) {
        return "hello " + name;
    }
}
