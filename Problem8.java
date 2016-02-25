import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Problem8 extends Application {
	
	public void start(Stage primaryStage){
		
		GridPane myGridPane = new GridPane();
		
		ClockPane clock1 = new ClockPane();
		clock1.setH(200);
		clock1.setW(200);
		clock1.setHour(4);
		clock1.setMinute(30);
		clock1.setSecond(45);
		
		
		ClockPane clock2 = new ClockPane();
		clock2.setH(200);
		clock2.setW(200);
		clock2.setHour(22);
		clock2.setMinute(46);
		clock2.setSecond(15);
		
		myGridPane.add(clock1, 0, 0);
		myGridPane.add(clock2, 1, 0);
		
		Scene scene = new Scene(myGridPane, 400, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}


