import javafx.scene.Scene;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
 
/** Drag the anchors around to change a polygon's points. */
public class ProblemB1 extends Application {
	
  int n = 6;
	
  public static void main(String[] args) throws Exception { 
	  launch(); 
  }
 
  // main application layout logic.
  @Override public void start(final Stage stage) throws Exception {
	
	StackPane pane = new StackPane();
    Polygon polygon = createPolygon(n);
    pane.setPadding(new Insets(20));
    pane.getChildren().add(polygon);
    
    HBox hBox = new HBox();
    hBox.setSpacing(10);
    hBox.setAlignment(Pos.CENTER);
    Button btEnlarge = new Button("Add Side");
    Button btShrink = new Button("Remove Side");
    hBox.getChildren().add(btEnlarge);
    hBox.getChildren().add(btShrink);
    
    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(pane);
    borderPane.setBottom(hBox);
    borderPane.setPadding(new Insets(10));
    BorderPane.setAlignment(hBox, Pos.CENTER);
 
    stage.setTitle("Problem B.1");
    stage.setScene(
        new Scene(
            borderPane,
            400, 400
        )
    );
    stage.show();
    
    btShrink.setOnAction(e -> {
		n -= 1;
		pane.getChildren().clear();
		pane.getChildren().add(createPolygon(n));
	});
	
	btEnlarge.setOnAction(e -> {
		n += 1;	
		pane.getChildren().clear();
		pane.getChildren().add(createPolygon(n));
	});
}
 
  // Creates a polygon
  private Polygon createPolygon(int n) {
	  
    Polygon polygon = new Polygon();
 
    int width = 300;
	int height = 300;
	 
	int xCenter = width / 2;
	int yCenter = height / 2;
	int radius = (int)(Math.min(width, height) * 0.4);
	
	double angle = 2 * Math.PI / n;
	
	// add points to the polygon
	for (int i = 0; i < n; i++){
		polygon.getPoints().add((double)(xCenter + radius * Math.cos(i * angle)));
		polygon.getPoints().add((double)(yCenter - radius * Math.sin(i * angle)));
	}
 
	polygon.setStroke(Color.BLACK);
	polygon.setStrokeWidth(2);
	polygon.setFill(Color.WHITE);
 
    return polygon;
  }
 
}