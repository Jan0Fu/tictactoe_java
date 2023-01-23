package ticTacToe;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;


public class TicTacToeApplication extends Application{

    String currentPlayer = "X";
    ArrayList<Button> buttons = new ArrayList<>();
    
    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
    
    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();
        Label turnText = new Label("Turn: " + currentPlayer);
        turnText.setFont(Font.font("Monospaced", 30));
        
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));
        
        for (int i = 1; i < 10; i++) {
            Button btn = new Button(" ");
            btn.setFont(Font.font("Monospaced", 30));
            btn.setMinSize(70, 70);
            btn.setMaxSize(70, 70);
            
            btn.setOnMouseClicked((event) -> {
                btn.setText("X");
                
            });
            buttons.add(btn);
        }
        grid.add(buttons.get(0), 0, 0);
        grid.add(buttons.get(1), 0, 1);
        grid.add(buttons.get(2), 0, 2);
        grid.add(buttons.get(3), 1, 0);
        grid.add(buttons.get(4), 1, 1);
        grid.add(buttons.get(5), 1, 2);
        grid.add(buttons.get(6), 2, 0);
        grid.add(buttons.get(7), 2, 1);
        grid.add(buttons.get(8), 2, 2);
        
        layout.setTop(turnText);
        layout.setCenter(grid);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

}
