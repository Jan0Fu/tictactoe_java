package ticTacToe;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;


public class TicTacToeApplication extends Application{

    String currentPlayer = "X";
    
    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
    
    @Override
    public void start(Stage window) throws Exception {
        Buttons buttons = new Buttons();
        BorderPane layout = new BorderPane();
        Label turnText = new Label("Turn: " + currentPlayer);
        turnText.setFont(Font.font("Monospaced", 30));
        
        layout.setTop(turnText);
        layout.setCenter(buttons.getView());
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

}
