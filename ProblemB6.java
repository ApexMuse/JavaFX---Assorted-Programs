import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ProblemB6 extends Application {
	
	public void start(Stage primaryStage){
		
		ClockPane clock = new ClockPane();
		
		EventHandler<ActionEvent> eventHandler = e -> {
			clock.setCurrentTime();
		};
		
		Timeline animation = new Timeline();
		animation.getKeyFrames().add(new KeyFrame(Duration.millis(1000), eventHandler));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		
		HBox hBox = new HBox();
	    hBox.setSpacing(10);
	    hBox.setAlignment(Pos.CENTER);
	    Button btStop = new Button("Stop");
	    Button btStart = new Button("Start");
	    hBox.getChildren().add(btStop);
	    hBox.getChildren().add(btStart);
	    
	    btStop.setOnAction(e -> {
	    	animation.pause();
	    });
	    
	    btStart.setOnAction(e -> {
	    	animation.play();
	    });
	    
	    BorderPane borderPane = new BorderPane();
	    borderPane.setPadding(new Insets(10));
	    borderPane.setCenter(clock);
	    borderPane.setBottom(hBox);
	    BorderPane.setAlignment(hBox, Pos.CENTER);
		
		Scene scene = new Scene(borderPane, 270, 300);
		primaryStage.setTitle("Problem B.6");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}