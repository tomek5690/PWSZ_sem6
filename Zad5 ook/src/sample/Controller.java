package sample;

import com.sun.webkit.network.Util;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import sun.plugin.dom.core.Node;

public class Controller {

    private static final String ook_syntax_one = "Ook.";
    private static final String ook_syntax_two = "Ook!";
    private static final String ook_syntax_three = "Ook?";

    private static final String pointer_to_left = "Ook? Ook.";
    private static final String pointer_to_right = "Ook. Ook?";

    private static final String increment_memory = "Ook. Ook.";
    private static final String decrement_memory = "Ook! Ook!";

    private static final String output_the_character = "Ook! Ook.";
    private static final String input_the_character = "Ook. Ook!";

    private static final String jump_past_the_matching = "Ook! Ook?";
    private static final String jump_back_the_matching = "Ook? Ook!";

    @FXML
    TextArea textArea;

    @FXML
    private void initialize() {
        textArea.setOnKeyPressed(event -> {

        });

    }
}
