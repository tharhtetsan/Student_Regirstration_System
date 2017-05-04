package StudentRegistrationSystem;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StudnetMenu {
	static Stage primaryStage1=new Stage();
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
	
		
		//contain items 
		Line li3=new Line(0,0,550,0);
		Label lbucsm=new Label("  University of Computer Studies Mandalay ",li3);
		lbucsm.setContentDisplay(ContentDisplay.BOTTOM);
		Label lbAdmin=new Label("    Student..");

		Label lbtext=new Label("  You have a permit\n \t to only access  to register...");
	
		
		Line line1=new Line(10,10,220,10);
		
		//add left
		VBox vboxLeft=new VBox();
	
		
		vboxLeft.getChildren().add(lbAdmin);
		vboxLeft.getChildren().add(line1);
		vboxLeft.setSpacing(5);
		vboxLeft.getChildren().add(lbtext);
		
		
		
		
		Image im1=new Image("ProjectImage/102.jpg");
		ImageView imv1=new ImageView(im1);
		imv1.setFitHeight(200);
		imv1.setFitWidth(250);
		Label lbnewStu=new Label("New Student Registratoin",imv1);
		lbnewStu.setContentDisplay(ContentDisplay.TOP);
		
		Image im2=new Image("ProjectImage/99.png");
		ImageView imv2=new ImageView(im2);
		imv2.setFitHeight(200);
		imv2.setFitWidth(250);
		Label lbStuupdate=new Label("Student Update",imv2);
		lbStuupdate.setContentDisplay(ContentDisplay.TOP);
		


		
		
		GridPane gpaneCenter=new GridPane();
		gpaneCenter.setHgap(50);
		gpaneCenter.setVgap(50);
		gpaneCenter.setAlignment(Pos.CENTER);
		gpaneCenter.add(lbnewStu, 0, 0);
		gpaneCenter.add(lbStuupdate, 1, 0);
		
		
		VBox vboxCenter=new VBox();
		vboxCenter.setSpacing(180);
		vboxCenter.getChildren().add(lbucsm);
		vboxCenter.getChildren().add(gpaneCenter);
		
		
	
		VBox vboxRight=new VBox();
		
		vboxRight.setSpacing(600);
		Line line2=new Line(10,10,150,10);
		Label lbBack=new Label("To Main Menu",line2);
		lbBack.setContentDisplay(ContentDisplay.BOTTOM);
		
		Line line3=new Line(10,10,200,10);
		Label lbChangeAdmin=new Label("Change to Admin",line3);
		lbChangeAdmin.setContentDisplay(ContentDisplay.BOTTOM);
		vboxRight.getChildren().add(lbBack);
		vboxRight.getChildren().add(lbChangeAdmin);
		
		vboxRight.setAlignment(Pos.TOP_RIGHT);
		
		HBox hBox=new HBox();
		
		hBox.getChildren().add(vboxLeft);
		hBox.setSpacing(150);
		hBox.getChildren().add(vboxCenter);
		hBox.getChildren().add(vboxRight);
		
		Scene scene=new Scene(hBox,1400,720);
		primaryStage.setTitle("..:Admin Menu:..");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	
	//Set style
		vboxLeft.setStyle("-fx-background-color :royalblue;");
		lbucsm.setFont(Font.font("Times New Roman",30));
		lbAdmin.setFont(Font.font(25));
		lbtext.setFont(Font.font("Times New Roman",20));
		hBox.setStyle("-fx-background-color :skyblue");
		lbChangeAdmin.setFont(Font.font("Times New Roman",23));
		lbBack.setFont(Font.font("Times New Roman",23));
		lbnewStu.setFont(Font.font("Times New Roman",18));
		lbStuupdate.setFont(Font.font("Times New Roman",18));
		
		
	lbChangeAdmin.setOnMouseClicked(e->
	{
		try {
			AdminLogIn adminLogIn=new AdminLogIn();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
	});
	
	lbBack.setOnMouseClicked(e->{
		StratWelcome stuWelcome=new StratWelcome("show");
		primaryStage1.close();
		
	});
	
	
	lbnewStu.setOnMouseClicked(e->{
		try {
			CheckStudent stuNew=new CheckStudent();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	});
	
	lbStuupdate.setOnMouseClicked(e->{
		try {
			UpdateStudent UpdaateStu=new UpdateStudent();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	});
	
	
	

	
	}
	
	
	public StudnetMenu()
	{
		try {
			start(primaryStage1);
			
			StratWelcome stu=new StratWelcome (1);
		
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public StudnetMenu(int a)
	{
		primaryStage1.close();
	}

}
