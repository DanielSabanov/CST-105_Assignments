// Made By Daniel Sabanov
package nflteammanager;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class GUIforNFLTeamManager extends Application {

    private int SPACING = 30;

    @Override
    public void start(Stage primaryStage) {

        //Initiates the rest of the app
        NflTeamManager manager = new NflTeamManager();
        manager.createPlayers();

        //VBoxes
        VBox backFrame = new VBox(SPACING);
        VBox myPlayersInfoFrame = new VBox();
        VBox otherPlayersInfo = new VBox();
        
        //TextFields
        TextField search = new TextField();
        
        HBox hbox = new HBox(SPACING);
        
        //Buttons
        Button myPlayersLogo = new Button("My players");
        Button otherPlayersLogo = new Button("Other players");
        Button btnAddPlayer = new Button("Add player to my team");
        Button btnRemovePlayer = new Button("Remove player from my team");
        
        //ListView
        ListView<NFLPlayer> myPlayers = new ListView();
        ListView<NFLPlayer> otherPlayers = new ListView<>();
        myPlayers.getItems().addAll(manager.ownedPlayers);
        otherPlayers.getItems().addAll(manager.notOwnedPlayers);
        
        
        
        //Scene
        Scene scene = new Scene(backFrame);

        
        backFrame.getChildren().addAll(search, hbox);
        hbox.getChildren().addAll(myPlayersInfoFrame, otherPlayersInfo);
        myPlayersInfoFrame.getChildren().addAll(myPlayersLogo, myPlayers, btnRemovePlayer);
        otherPlayersInfo.getChildren().addAll(otherPlayersLogo, otherPlayers, btnAddPlayer);

        

        primaryStage.setTitle("NFL Team Manager");
        primaryStage.setScene(scene);
        primaryStage.show();


        btnRemovePlayer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                NFLPlayer selectedPlayer = myPlayers.getSelectionModel().getSelectedItem();
                
                manager.notOwnedPlayers.add(selectedPlayer);
                
                manager.ownedPlayers.remove(selectedPlayer);
                
                myPlayers.getItems().clear();
                myPlayers.getItems().addAll(manager.ownedPlayers);
                
                otherPlayers.getItems().clear();
                otherPlayers.getItems().addAll(manager.notOwnedPlayers);
            }
        });
        
        btnAddPlayer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                NFLPlayer selectedPlayer = otherPlayers.getSelectionModel().getSelectedItem();
                
                manager.notOwnedPlayers.remove(selectedPlayer);
                
                manager.ownedPlayers.add(selectedPlayer);
                
                myPlayers.getItems().clear();
                myPlayers.getItems().addAll(manager.ownedPlayers);
                
                otherPlayers.getItems().clear();
                otherPlayers.getItems().addAll(manager.notOwnedPlayers);
            }
        });
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
