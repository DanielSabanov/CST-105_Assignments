//Made by Daniel Sabanov
package displaythreecards;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import java.util.ArrayList;



public class DisplayThreeCards extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        final double FIT = 200;
        ArrayList<Integer> randomizer = new ArrayList<Integer>();
        HBox frame = new HBox();
        Scene scene = new Scene(frame);
          
        for(int i = 1; i <=52 ; i++){
            randomizer.add(i);
        }
        
        java.util.Collections.shuffle(randomizer);
        
        ImageView imageOne = new ImageView("Image/(" + randomizer.get(1) + ").png");
        ImageView imageTwo = new ImageView("Image/(" + randomizer.get(2) + ").png");
        ImageView imageThree = new ImageView("Image/(" + randomizer.get(3) + ").png");
        
        imageOne.setFitHeight(FIT);
        imageOne.setFitWidth(FIT);
        
        imageTwo.setFitHeight(FIT);
        imageTwo.setFitWidth(FIT);
        
        imageThree.setFitHeight(FIT);
        imageThree.setFitWidth(FIT);
        
        frame.getChildren().add(imageOne);
        frame.getChildren().add(imageTwo);
        frame.getChildren().add(imageThree);

        primaryStage.setTitle("DisplayThreeCards");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
