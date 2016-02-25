import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ProblemB5 extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		
		FanPane myPane = new FanPane();
		
		HBox hBox = new HBox();
	    hBox.setSpacing(10);
	    hBox.setAlignment(Pos.CENTER);
	    Button btPause = new Button("Pause");
	    Button btResume = new Button("Resume");
	    Button btReverse = new Button("Reverse");
	    hBox.getChildren().add(btPause);
	    hBox.getChildren().add(btResume);
	    hBox.getChildren().add(btReverse);
	    
	    btPause.setOnAction(e -> {
	    	myPane.pause();
	    });
	    
	    btResume.setOnAction(e -> {
	    	myPane.resume();
	    });
	    
	    btReverse.setOnAction(e -> {
	    	myPane.reverse();
	    });
	    
	    BorderPane borderPane = new BorderPane();
	    borderPane.setCenter(myPane);
	    borderPane.setBottom(hBox);
	    borderPane.setPadding(new Insets(10));
	    BorderPane.setAlignment(hBox, Pos.CENTER);
	 
	    stage.setTitle("Problem B.5");
	    stage.setScene(
	        new Scene(
	            borderPane,
	            420, 420
	        )
	    );
	    stage.show();
		
	}

	public static void main(String[] args) {
		launch();
	}

}
