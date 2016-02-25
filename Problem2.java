import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Problem2 extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane myPane = new GridPane();
		
		Image imageX = new Image("image/x.gif");
		Image imageO = new Image("image/o.gif");
		
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++) {
				int status = (int)(Math.random()*3)-1;
				if (status == 0) {
					myPane.add(new ImageView(imageX), j, i);
				}
				else if (status == 1) {
					myPane.add(new ImageView(imageO), j, i);
				}
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
