import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Problem7 extends Application{
	
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
		
		Polyline cosine = new Polyline();
		for (int x = -170; x <= 170; x++) {
			cosine.getPoints().add(x + 200.0);
			cosine.getPoints().add(100 - scaleFactor * Math.cos((x / 100.0) * 2 * Math.PI));
		}
		cosine.setStroke(Color.BLUE);
		cosine.setLayoutX(100);
		cosine.setLayoutY(50);
		myPane.getChildren().add(cosine);
		
		Scene scene = new Scene(myPane, 600, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch();
	}

}
