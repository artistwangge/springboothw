import org.springboothw.demo.controller.HelloWorldController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldControllerTest {
    @Test
    public void testSayHello() {
        assertEquals("Hello World!",new HelloWorldController().sayHello());
    }

    public static void main(String[] args) {
        String str="荣昌区（双河街道胖哥副食店郭祖燕）";
        if(str.contains("（")){
            str = str.substring(0,str.lastIndexOf("（"));
            System.out.println(str);
        }
    }
}
