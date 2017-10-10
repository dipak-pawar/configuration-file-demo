package org.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GreeterTest {

    @Test
    public void should_greet_to_user() {
        // given
        final Greeter greeter = new Greeter();

        // when
        final String greetMessage = greeter.greet("Smart Testing");

        // then
        Assertions.assertThat(greetMessage).isEqualTo("Hello, Smart Testing");
    }
}
