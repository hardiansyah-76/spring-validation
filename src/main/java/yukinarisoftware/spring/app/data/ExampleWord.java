package yukinarisoftware.spring.app.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import yukinarisoftware.spring.app.validator.Palindrome;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExampleWord {

    @Palindrome
    private String word;
}
