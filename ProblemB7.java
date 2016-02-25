import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class ProblemB7 extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane myPane = new GridPane();
		
		// Number of squares in each row and column
		int squares = 12;
		int startPosition = 0;
		
	    int[][] board = new int[squares][squares];
	    solve(startPosition, board, squares);
	    
	    // If the board position is valid, place a Queen image on it
	    for (int i = 0; i < squares; i++) 
	    {
	      for (int j = 0; j < squares; j++) 
	      {
	        if(board[i][j] == 1) 
	        {
	        	myPane.add(new ImageView(new Image("image/queen.jpg")), i, j);
	        }
	      }
	    }	    
		
	    /* Draw the board, making the squares transparent so they won't 
	     * hide the Queens
	     */
		for (int i = 0; i < squares; i++) 
		{
			for (int j = 0; j < squares; j++) 
			{
				Rectangle r = new Rectangle(43, 43);
				r.setStroke(Color.BLACK);
				r.setFill(Color.TRANSPARENT);
				myPane.add(r, i, j);
			}
		}
		
		Scene scene = new Scene(myPane);
		primaryStage.setTitle("Problem B.7");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public static void main(String args[]) {
		launch();
	}
	
	boolean solve(int startPosition, int[][] board, int squares) {
        if (startPosition >= squares) 
        {
        	return true;
        }
        for (int currentPosition = 0; currentPosition < squares; currentPosition++) 
        {
          if (isValid(board, startPosition, currentPosition, squares)) 
          {
            board[startPosition][currentPosition] = 1;
            if (!solve(startPosition + 1, board, squares)) 
            {
              board[startPosition][currentPosition] = 0;
            } 
            else {
              return true;
            }
          }
        }
        return false;
      }

      public boolean isValid(int[][] board, int x, int y, int squares) {
        int i, j;
        
        for (i = 0; i < x; i++) 
        {
          if(board[i][y] == 1)
            return false;
        }
          
        i = x - 1;
        j = y - 1;
        
        while ((i >= 0) && (j >= 0)) 
        {
          if(board[i--][j--] == 1) return false;
        }
        
        i = x - 1;
        j = y + 1;
        
        while ((i >= 0) && (j < squares)) 
        {
          if(board[i--][j++] == 1) return false;
        }
        
        return true;
      }

}