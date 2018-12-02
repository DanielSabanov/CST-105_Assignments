//Made by Daniel Sabanov
package colorandfont;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class ColorAndFont extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        ArrayList<Text> textList = new ArrayList();
        
        Text a = new Text("Java");
        Text b = new Text("Java");
        Text c = new Text("Java");
        Text d = new Text("Java");
        Text e = new Text("Java");
        HBox frame = new HBox();
        
        textList.add(a);
        textList.add(b);
        textList.add(c);
        textList.add(d);
        textList.add(e);
        
        for(int i = 0; i < textList.size(); i++){
            textList.get(i).setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            textList.get(i).setOpacity(Math.random());
            textList.get(i).setFill(Color.color (Math.random(),Math.random(),Math.random()));
            textList.get(i).setRotate(90);
            frame.getChildren().add(textList.get(i));
        }
        
        frame.setAlignment(Pos.CENTER);
        Scene scene = new Scene(frame, 250, 100);
        
        primaryStage.setTitle("ColorAndFont");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
