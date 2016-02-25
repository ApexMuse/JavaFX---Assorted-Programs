import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Problem4 extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Pane myPane = new Pane();
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Rectangle r = new Rectangle(40*j, 40*i, 40, 40);				
				if ((i + j) % 2 == 0) {
					r.setFill(Color.WHITE);
				}
				else {
					r.setFill(Color.BLACK);
				}
				myPane.getChildren().add(r);
			}
		}
		
		Scene scene = new Scene(myPane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch();
	}

}
