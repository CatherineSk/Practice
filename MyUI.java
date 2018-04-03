import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class MyUI extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Count me!");
        Button button = new Button("Click me!");
        StackPane pane = new StackPane();
        pane.getChildren().add(button);
        primaryStage.setScene(new Scene(pane, 300, 400));
        button.setOnAction(new EventHandler<ActionEvent>() {
            int count=0;
            @Override
            public void handle(ActionEvent event) {
                System.out.println("!!!");
                button.setText(""+count++);
            }
        });
        primaryStage.show();
    }
}





