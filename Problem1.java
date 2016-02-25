import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Problem1 extends Application{
	
	public void start(Stage primaryStage) throws Exception {
		
		GridPane myPane = new GridPane();
		myPane.setPadding(new Insets(50));
		
		// set horizontal gap
		myPane.setHgap(5);
		// set vertical gap
		myPane.setVgap(20);
		myPane.setAlignment(Pos.CENTER);
		
		Image image1 = new Image("image/us.gif");
		ImageView imageView1 = new ImageView(image1);
		
		ImageView imageView2 = new ImageView(new Image("image/china.gif"));
		
		// myPane.getChildren().add(imageView1, 0, 0);
		myPane.add(imageView1, 0, 0);
		myPane.add(imageView2, 0, 1);
		myPane.add(new ImageView(new Image("image/germany.gif")), 1, 0);
		myPane.add(new ImageView(new Image("image/uk.gif")), 1, 1);
		
		Scene scene = new Scene(myPane);
		primaryStage.setScene(scene);
		primaryStage.show();	
	}
	public static void main(String[] args) {
		launch();

	}

}
