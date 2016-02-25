import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Problem5 extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Pane myPane = new Pane();
		
		for (int i = 1; i <= 3; i+= 2) {
			for (int j = 1; j <= 3; j+=2) {
				Circle circle = new Circle(110*j, 110*i, 100, Color.TRANSPARENT);
				circle.setStroke(Color.BLACK);
				myPane.getChildren().add(circle);
				
				for (int a = 30; a <= 360; a += 90) {
					Arc arc = new Arc();
					arc.setCenterX(circle.getCenterX());
					arc.setCenterY(circle.getCenterY());
					arc.setRadiusX(85);
					arc.setRadiusY(85);
					arc.setStartAngle(a);
					arc.setLength(30);
					arc.setType(ArcType.ROUND);
					arc.setFill(Color.RED);
					myPane.getChildren().add(arc);
				} // End of for loop for arcs
				
			} // End of inner for loop
		} // End of outer for loop
		
		Scene scene = new Scene(myPane, 440, 440);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch();
	}

}
