import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ProblemB4 extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Pane myPane = new Pane();
		
		Line horizontalLine = new Line();
		horizontalLine.setStartX(75);
		horizontalLine.setStartY(150);
		horizontalLine.setEndX(525);
		horizontalLine.setEndY(150);
		myPane.getChildren().add(horizontalLine);
		
		Line arrow1 = new Line();
		arrow1.setStartX(525);
		arrow1.setStartY(150);
		arrow1.setEndX(500);
		arrow1.setEndY(135);
		myPane.getChildren().add(arrow1);
		
		Line arrow2 = new Line();
		arrow2.setStartX(525);
		arrow2.setStartY(150);
		arrow2.setEndX(500);
		arrow2.setEndY(165);
		myPane.getChildren().add(arrow2);
		
		Text xText = new Text();
		xText.setText("X");
		xText.setX(500);
		xText.setY(125);
		myPane.getChildren().add(xText);
		
		Line verticalLine = new Line();
		verticalLine.setStartX(300);
		verticalLine.setStartY(25);
		verticalLine.setEndX(300);
		verticalLine.setEndY(275);
		myPane.getChildren().add(verticalLine);
		
		Line arrow3 = new Line();
		arrow3.setStartX(300);
		arrow3.setStartY(25);
		arrow3.setEndX(315);
		arrow3.setEndY(50);
		myPane.getChildren().add(arrow3);
		
		Line arrow4 = new Line();
		arrow4.setStartX(300);
		arrow4.setStartY(25);
		arrow4.setEndX(285);
		arrow4.setEndY(50);
		myPane.getChildren().add(arrow4);
		
		Text yText = new Text();
		yText.setText("Y");
		yText.setX(325);
		yText.setY(50);
		myPane.getChildren().add(yText);
		
		Polyline sine = new Polyline();
		double scaleFactor = 50;
		for (int x = -170; x <= 170; x++) {
			sine.getPoints().add(x + 200.0);
			sine.getPoints().add(100 - scaleFactor * Math.sin((x / 100.0) * 2 * Math.PI));
		}
		sine.setStroke(Color.RED);
		sine.setLayoutX(100);
		sine.setLayoutY(50);
		myPane.getChildren().add(sine);
		
		Circle circle = new Circle(20,100, 10); //circle with radius 10
		circle.setFill(Color.GREEN);
		myPane.getChildren().add(circle);
		
		for (int i = -3; i < 4; i++) {
			Text scaleText = new Text();
			if (i == 0) {
				scaleText.setText("0");
			}
			else {
				scaleText.setText(i + "\u03c0");
			}
			scaleText.setX(300 + (i*50));
			scaleText.setY(160);
			myPane.getChildren().add(scaleText);
		}
		
		Text instructions = new Text();
		instructions.setText("Left Click = PAUSE\nRight Click = RESUME");
		instructions.setX(250);
		instructions.setY(325);
		myPane.getChildren().add(instructions);
		
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(5000));
		pt.setPath(sine);
		pt.setNode(circle);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);
		pt.play();
		
		myPane.setOnMouseClicked(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent e){
				if (e.getButton() == MouseButton.PRIMARY) {
					pt.pause();
				}
				else if (e.getButton() == MouseButton.SECONDARY){
					pt.play();
				}
			}
		});
		
		Scene scene = new Scene(myPane, 600, 400);
		primaryStage.setTitle("Problem B.4");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}

	public static void main(String[] args) {
		launch();
	}

}
