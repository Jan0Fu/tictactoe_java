
package ticTacToe;

import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class Buttons {
    
    ArrayList<Button> buttons = new ArrayList<>();
    
    public Parent getView() {
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
        
        return grid;
        
    }
}
