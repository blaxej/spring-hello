package pl.sda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collection;

@RestController
public class GreetingRestController {

    @GetMapping(name = "/greetings")
    public Collection<Greeting> greetings() {
        return Arrays.asList(new Greeting("hello", "goobar"), new Greeting(
                "hi", "foobar"));
    }

}
