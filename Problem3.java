import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Problem3 extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane myPane = new GridPane();
		myPane.setPadding(new Insets(20));
		
		ArrayList<Integer> myCardsList = new ArrayList<Integer>();
		for (int i = 0; i <=52; i++) {
			myCardsList.add(i);
		}
		Collections.shuffle(myCardsList);
		
		for (int i = 0; i < 3; i++) {
			Image card = new Image("image/card/" + myCardsList.get(i) + ".png");
			card.heightProperty().add(25);
			card.widthProperty().add(25);
			ImageView cardView = new ImageView(card);
			myPane.add(cardView, i, 0);
		}
		
		// set horizontal gap
		myPane.setHgap(10);
		// set vertical gap
		myPane.setVgap(10);
		
		Scene scene = new Scene(myPane);
		scene.setFill(Color.DARKGREEN);
		primaryStage.setScene(scene);
		primaryStage.show();	
		
	}

	public static void main(String[] args) {
			launch();
	}

}
