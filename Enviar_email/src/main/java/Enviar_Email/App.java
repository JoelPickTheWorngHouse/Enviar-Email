package Enviar_Email;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

	
private Controller control;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		control=new Controller();
		
		Scene secen=new Scene(control.getView());
		primaryStage.setTitle("Enviar email");
		primaryStage.setScene(secen);
		primaryStage.getIcons().add(new Image("iconito.png"));
		primaryStage.show();
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
