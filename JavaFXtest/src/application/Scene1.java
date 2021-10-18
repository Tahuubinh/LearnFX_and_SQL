package application;

import java.util.Optional;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
public class Scene1 extends Test{
	public static Scene getScene(){
		Label label = new Label("Welcome to Howkteam");
        
		Button button1 = new Button("Go to course");
        button1.setOnAction(event -> {
            window.setScene(scene2);
        });
        Button button2 = new Button();
        button2.setText("Close");
        button2.setOnAction(e -> {
        	Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        	alert.setTitle("Confirmation");
        	alert.setHeaderText("Alert Information");
        	alert.setContentText("Choose your option");
        	
        	ButtonType button_yes = new ButtonType(
        			"Yes", ButtonBar.ButtonData.YES);
        	ButtonType button_no = new ButtonType(
        			"No", ButtonBar.ButtonData.NO);
        	ButtonType button_cancel = new ButtonType(
        			"Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
        	
        	alert.getButtonTypes().setAll(button_yes, button_no, 
        			button_cancel);
        	Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == button_yes)
                System.out.println("Code for yes");
            else if (result.get().getButtonData() == ButtonBar.ButtonData.NO)
                System.out.println("Code for no");
            else
                System.out.println("Code for cancel");
            String message = result.get().getText();
            Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
            alert1.setTitle("Information");
            alert1.setHeaderText("Notification");
            alert1.setContentText(message);
            alert1.show();
        });
        
        VBox layout1 = new VBox();
        layout1.getChildren().addAll(label, button1, button2);
        scene1 = new Scene(layout1, 300, 200);
        return scene1;
	}
}
