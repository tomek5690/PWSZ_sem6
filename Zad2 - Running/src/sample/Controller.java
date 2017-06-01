package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.Random;
public class Controller {
    @FXML
    Button runningButton;
    @FXML
    private void initialize() {
        runningButton.setOnMouseEntered(event -> changeThePositionOfButton());
    }
    private void changeThePositionOfButton() {
        Random losowo = new Random();
        runningButton.setTranslateX(losowo.nextInt(600));
        runningButton.setTranslateY(losowo.nextInt(450));
    }
}
