import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;


public class Problem6 extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Pane myPane = new Pane();
		
		Circle face = new Circle(200, 200, 180, Color.TRANSPARENT);
		face.setStroke(Color.BLACK);
		myPane.getChildren().add(face);
		
		Ellipse leftEye = new Ellipse(130, 125, 40, 30);
		leftEye.setStroke(Color.BLACK);
		leftEye.setFill(Color.TRANSPARENT);
		myPane.getChildren().add(leftEye);
		
		Circle leftPupil = new Circle(130, 125, 20, Color.BLACK);
		myPane.getChildren().add(leftPupil);
		
		Ellipse rightEye = new Ellipse(260, 125, 40, 30);
		rightEye.setStroke(Color.BLACK);
		rightEye.setFill(Color.TRANSPARENT);
		myPane.getChildren().add(rightEye);
		
		Circle rightPupil = new Circle(260, 125, 20, Color.BLACK);
		myPane.getChildren().add(rightPupil);
		
		Polygon nose = new Polygon();
		nose.getPoints().addAll(new Double[]{
		    195.0, 140.0,
		    150.0, 235.0,
		    240.0, 235.0 });
		nose.setStroke(Color.BLACK);
		nose.setFill(Color.TRANSPARENT);
		myPane.getChildren().add(nose);
		
		Arc smile = new Arc(200, 225, 100, 100, -20, -140);
		smile.setStroke(Color.BLACK);
		smile.setFill(null);
		myPane.getChildren().add(smile);
		
		Scene scene = new Scene(myPane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch();
	}

}
