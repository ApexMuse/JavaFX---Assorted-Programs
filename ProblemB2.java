import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class ProblemB2 extends Application {
	
	GridPane myPane = new GridPane();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		myPane.setPadding(new Insets(20));
		// set horizontal gap
		myPane.setHgap(10);
		// set vertical gap
		myPane.setVgap(10);
		
		getCards();
		
		HBox hBox = new HBox();
	    hBox.setSpacing(10);
	    hBox.setAlignment(Pos.CENTER);
	    Button refresh = new Button("Refresh");
	    hBox.getChildren().add(refresh);
	    
	    BorderPane borderPane = new BorderPane();
	    borderPane.setCenter(myPane);
	    borderPane.setBottom(hBox);
	    borderPane.setPadding(new Insets(10));
	    BorderPane.setAlignment(hBox, Pos.CENTER);
		
		Scene scene = new Scene(borderPane);
		primaryStage.setTitle("Problem B.2");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		refresh.setOnAction(e -> {
			getCards();
		});
		
	}

	public static void main(String[] args) {
			launch();
	}
	
	public void getCards() {
		ArrayList<Integer> myCardsList = new ArrayList<Integer>();
		for (int i = 0; i <=52; i++) {
			myCardsList.add(i);
		}
		Collections.shuffle(myCardsList);
		
		for (int i = 0; i < 4; i++) {
			Image card = new Image("image/card/" + myCardsList.get(i) + ".png");
			card.heightProperty().add(25);
			card.widthProperty().add(25);
			ImageView cardView = new ImageView(card);
			myPane.add(cardView, i, 0);
		}		
	}

}
