import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ProblemB3 extends Application{
	
	int mouseClicks = 1;
	
	@Override
	public void start(Stage stage) throws Exception {
		
		long startTime = System.currentTimeMillis();
		
		Pane pane = new Pane();
		pane.setPadding(new Insets(10));
		
		Circle circle = new Circle(20, 150, 10);
		circle.setFill(Color.rgb(randomColor(), randomColor(), randomColor()));
		pane.getChildren().add(circle);
		
		//scene declaration has been moved above the handler in order to have access to scene.getWidth()
		Scene scene = new Scene(pane, 400, 400);
		
			circle.setOnMouseClicked(new EventHandler<MouseEvent>(){
				@Override
				public void handle(MouseEvent e){
					if (mouseClicks < 10) {
						++mouseClicks;
						circle.setCenterX(Math.random() * (scene.getWidth()-10));
						circle.setCenterY(Math.random() * (scene.getHeight()-10));
						circle.setFill(Color.rgb(randomColor(), randomColor(), randomColor()));
					}
					else {
						double currentTime = System.currentTimeMillis();
						double timeElapsed = currentTime - startTime;
						Text text = new Text();
						text.setFont(new Font(16));
						text.setWrappingWidth(200);
						text.setText("Time Spent: \n\n" + timeElapsed/1000 + " seconds");
						text.setX(scene.getWidth()/3);
						text.setY(scene.getHeight()/2);
						pane.getChildren().clear();
						pane.getChildren().add(text);
					}
				}
			});
		
		stage.setTitle("Problem B.3");
		stage.setScene(scene);
		stage.show();
		
	}

	private int randomColor() {
		int color = (int) (Math.random() * 255);
		return color;
	}

	public static void main(String[] args) {
		launch();

	}

}
