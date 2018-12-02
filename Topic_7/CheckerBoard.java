//Made by Daniel Sabanov

package checkerboard;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CheckerBoard extends Application {
    
    static int RECTANGLE_SIZE = 50;
    static int BOARD_SIZE = 8;
    static int WINDOW_SIZE = RECTANGLE_SIZE * BOARD_SIZE;
    
    @Override
    public void start(Stage primaryStage) {
        Pane board = new Pane();

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                Rectangle recangle = new Rectangle(RECTANGLE_SIZE * j,
                        RECTANGLE_SIZE * i, RECTANGLE_SIZE, RECTANGLE_SIZE);
                if ((i + j) % 2 != 0) {
                    recangle.setFill(Color.BLACK);
                } else {
                    recangle.setFill(Color.WHITE);
                }

                board.getChildren().add(recangle);
            }
        }

        Scene scene = new Scene(board, WINDOW_SIZE, WINDOW_SIZE);
        
        primaryStage.setTitle("Checkboard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
