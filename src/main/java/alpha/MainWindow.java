package alpha;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * Controller for MainWindow. Provides the layout for the other controls.
 */
public class MainWindow extends AnchorPane {
    @FXML
    private ScrollPane scrollPane;
    @FXML
    private VBox dialogContainer;
    @FXML
    private TextField userInput;
    @FXML
    private Button sendButton;

    private Alpha alpha;
    private Image userImage = new Image(this.getClass().getResourceAsStream("/images/User.png"));
    private Image alphaImage = new Image(this.getClass().getResourceAsStream("/images/Squid.png"));

    /**
     * Initialises the messages.
     */
    @FXML
    public void initialize() {
        scrollPane.vvalueProperty().bind(dialogContainer.heightProperty());
        String welcomeMessage = "Welcome onboard!\nI am Alpha, your task manager!"
                + "\n(enter help to learn about the command rules)";
        dialogContainer.getChildren().addAll(
                DialogBox.getDukeDialog(welcomeMessage, alphaImage)
        );
    }

    /**
     * Set alpha object to interpret user input and generate response.
     * @param a Alpha object.
     */
    public void setAlpha(Alpha a) {
        alpha = a;
    }

    /**
     * Creates two dialog boxes, one echoing user input and the other containing Alpha's reply and then appends them to
     * the dialog container. Clears the user input after processing.
     */
    @FXML
    private void handleUserInput() {
        String input = userInput.getText();
        String response = alpha.getResponse(input);
        dialogContainer.getChildren().addAll(
                DialogBox.getUserDialog(input, userImage),
                DialogBox.getDukeDialog(response, alphaImage)
        );
        userInput.clear();
    }
}
