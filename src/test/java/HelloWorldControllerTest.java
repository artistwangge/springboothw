import org.springboothw.demo.controller.HelloWorldController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldControllerTest {
    @Test
    public void testSayHello() {
        assertEquals("Hello World!",new HelloWorldController().sayHello());
    }
}
