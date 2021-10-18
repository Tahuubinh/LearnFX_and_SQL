package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Lesson1 extends Application{
	Button button;
	public static void runLesson1(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello World");
		button = new Button();
		button.setText("Say Hello World");
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Hello Howkteam");
				
			}
		});
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
}