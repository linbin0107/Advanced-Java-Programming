

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by intern on 8/21/17.
 */
public class TestJunit2 {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi! " + "Robert";
        assertEquals(message, messageUtil.salutationMessage());
    }
}
