

import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by intern on 8/21/17.
 */
public class TestJunit1 {

    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        assertEquals(message, messageUtil.pringMessage());
    }
}
