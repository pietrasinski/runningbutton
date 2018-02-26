package RunningButton.java.fx;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class RunningButtonController {
	public Button nowy = new Button();
	@FXML
	Random rand = new Random(); 
	@FXML
	Pane pane = new Pane(); 
	public void pozycja() {
	 double x = 0 + (pane.getWidth() - 0) * rand.nextDouble();
	 double y = 0 + (pane.getHeight() - 0) * rand.nextDouble();
	
	 nowy.setLayoutX(x);
	 nowy.setLayoutY(y);

	}
	
	@FXML
	public void handleCloseButtonAction(ActionEvent event) {
	    ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
	}

}
