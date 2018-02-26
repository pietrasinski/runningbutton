package RunningButton.java.fx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("running.fxml"));
		Pane stackPane = loader.load();
		Scene scena = new Scene(stackPane);	
		primaryStage.setScene(scena);
		primaryStage.setTitle("Running button");
		//primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();
		
		
	}

}
