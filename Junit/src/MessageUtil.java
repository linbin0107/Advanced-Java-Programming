/**
 * Created by intern on 8/21/17.
 */

/**
 * This class prints the given message on console.
 */

public class MessageUtil {
    private String message;

    // Constructor
    // @param message to be printed
    public MessageUtil(String message) {
        this.message = message;
    }

    // prints teh message
    public String pringMessage() {
        System.out.println(message);
        return message;
    }

    // add "Hi!" to the message
    public String salutationMessage() {
        message = "Hi! " + message;
        System.out.println(message);
        return message;
    }
}
