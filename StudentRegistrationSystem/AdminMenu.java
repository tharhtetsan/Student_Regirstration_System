package StudentRegistrationSystem;


import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AdminMenu extends Application{
static Stage primaryStage1=new Stage();
	@Override
	public 	void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
	
		
		//contain items 
		Line li3=new Line(0,0,550,0);
		Label lbucsm=new Label("  University of Computer Studies Mandalay ",li3);
		lbucsm.setContentDisplay(ContentDisplay.BOTTOM);
		Label lbAdmin=new Label("    Admin");

		Label lbtext=new Label("  You have a permit\n \tto access the whole system.   ");
		
		GetAndSetPassword pass=new GetAndSetPassword();
		String str="\n\tBecareful "+pass.getUserName()+" !     ";
		Label lbBecareful=new Label(str);
		Line line1=new Line(10,10,220,10);
		
		//add left
		VBox vboxLeft=new VBox();
	
		
		vboxLeft.getChildren().add(lbAdmin);
		vboxLeft.getChildren().add(line1);
		vboxLeft.setSpacing(5);
		vboxLeft.getChildren().add(lbtext);
		vboxLeft.getChildren().add(lbBecareful);
		
		
		
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
		


		Image im3=new Image("ProjectImage/101.png");
		ImageView imv3=new ImageView(im3);
		imv3.setFitHeight(200);
		imv3.setFitWidth(250);
		Label lbStuListing=new Label("Student list View",imv3);
		lbStuListing.setContentDisplay(ContentDisplay.TOP);
		
		Image im4=new Image("ProjectImage/100.png");
		ImageView imv4=new ImageView(im4);
		imv4.setFitHeight(200);
		imv4.setFitWidth(250);
		Label lbStuSearch=new Label("Student Searching ",imv4);
		lbStuSearch.setContentDisplay(ContentDisplay.TOP);
		
		
		GridPane gpaneCenter=new GridPane();
		gpaneCenter.setHgap(50);
		gpaneCenter.setVgap(50);
		gpaneCenter.setAlignment(Pos.CENTER);
		gpaneCenter.add(lbnewStu, 0, 0);
		gpaneCenter.add(lbStuupdate, 1, 0);
		gpaneCenter.add(lbStuListing, 0,1);
		gpaneCenter.add(lbStuSearch, 1, 1);
		
		VBox vboxCenter=new VBox();
		vboxCenter.setSpacing(20);
		vboxCenter.getChildren().add(lbucsm);
		vboxCenter.getChildren().add(gpaneCenter);
		
		
	
		VBox vboxRight=new VBox();
		Line line2=new Line(10,10,220,10);
		Label lbChangePassowrd=new Label("Change Password",line2);
		lbChangePassowrd.setContentDisplay(ContentDisplay.BOTTOM);
		vboxRight.setSpacing(600);
		Line line3=new Line(10,10,100,10);
		Label logOut=new Label("LogOut",line3);
		logOut.setContentDisplay(ContentDisplay.BOTTOM);
		vboxRight.getChildren().add(logOut);
		vboxRight.getChildren().add(lbChangePassowrd);
		
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
		lbBecareful.setFont(Font.font("Times New Roman",25));
		hBox.setStyle("-fx-background-color :skyblue");
		logOut.setFont(Font.font("Times New Roman",25));
		lbChangePassowrd.setFont(Font.font("Times New Roman",25));
		lbnewStu.setFont(Font.font("Times New Roman",18));
		lbStuupdate.setFont(Font.font("Times New Roman",18));
		lbStuListing.setFont(Font.font("Times New Roman",18));
		lbStuSearch.setFont(Font.font("Times New Roman",18));
		
		//Amination for Becareful
		FadeTransition ft =new FadeTransition(Duration.millis(1500),lbBecareful);
		 ft.setToValue(1.0);
		 ft.setFromValue(0.0);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		
	logOut.setOnMouseClicked(e->
	{
		StratWelcome stuWelcome=new StratWelcome("show");
		primaryStage1.close();
		
		
		
	});
	
	lbChangePassowrd.setOnMouseClicked(e->{
		try {
			UpdatePassword UpdatePass=new UpdatePassword();
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	});
	lbnewStu.setOnMouseClicked(e->{
		try {
			CheckStudent NewStu=new CheckStudent();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	});
	
	lbStuupdate.setOnMouseClicked(e->{
		try {
			UpdateStudentAdmin stuNew=new UpdateStudentAdmin();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	});
	
	lbStuListing.setOnMouseClicked(e->{
		try {
			StudentDataListing stuList=new StudentDataListing();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	});
	lbStuSearch.setOnMouseClicked(e->{
		SearchStudent searchstu=new SearchStudent();
	});

	
	}
	
	
	public AdminMenu()
	{
		try {
			start(primaryStage1);
			StudnetMenu stuMenu=new StudnetMenu(1);
			
			StratWelcome stu=new StratWelcome (1);
		
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
