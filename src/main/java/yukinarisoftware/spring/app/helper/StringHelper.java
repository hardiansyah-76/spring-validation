package yukinarisoftware.spring.app.helper;

import org.springframework.stereotype.Component;

/*
* This is string helper for example custom spring validation*/

@Component
public class StringHelper {

    public boolean isPalindrome (String value) {

        String reverse = new StringBuilder().reverse().toString();

        return value.equals(reverse);
    }
}
