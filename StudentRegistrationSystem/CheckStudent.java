package StudentRegistrationSystem;

import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CheckStudent extends Application{
static Stage PrimaryStage=new Stage();
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		
		//AddCenter
		VBox vboxCenter=new VBox();
		FlowPane fpaneTitle=new FlowPane();
		Label lbTitle=new Label("Welcome from University of Computer Studies, Mandalay(UCSM)");
		fpaneTitle.getChildren().add(lbTitle);
		fpaneTitle.setAlignment(Pos.CENTER);
		Label lbRead=new Label("\nPlease read the student agreement! \n\tYou must accept the terms of agreement ,rules and policy of UCSM to Register...");
		Text text = new Text(20, 20, 
				 "Factor-->\t\tStudent Registration form in University of Computer Studies(UCMS)\n"
				+ "1.\tCourse duration time is five year.\n"
				+ "2.\tOne year Course have two semesters.\n"
				+ "3.\tStudent must attend four months in each semesters.\n"
				+ "4.\tDegree(B.C.Sc/B.C.Tech)\n"
				+ "5.\tParents must accept to pay course fee.\n"
				+ "6.\tStudents must pay course fee one-time in one semester.\n"
				+ "7.\tCourse fee(One month=5000Kyats)\n"
				+ "8.\tStudents must obey University Rules.\n"
				+ "9.\tStudents must be apolitical person.\n"
				+ "10.\tIf the students haven't full fill the limited Roll-call(75%),the student will have no chance to answer the final exam.\n"
				+ "11.\t If the Students did  cheating the exam, the student were punished by University Rules.");
		

		
		
		 
		 
		  
		  
		  //Add Button
		  CheckBox chkRule = new CheckBox("I accept all these rule of UCSM");
		  chkRule.setTextFill(Color.RED);
		  chkRule.setSelected(false);
		  chkRule.setPadding(new Insets(10,10,10,10));
		  Button btnNext=new Button("     Next     ");
		  Button btnCancel=new Button("    Cancel   ");
		 
		 //Action for next Button
		 FlowPane fpaneButton=new FlowPane();
		 fpaneButton.setHgap(20); 
		 fpaneButton.getChildren().add(btnNext);
		 btnNext.setVisible(false);
		  fpaneButton.getChildren().add(btnCancel);
		  fpaneButton.setAlignment(Pos.CENTER_RIGHT);
		
		 
		  
		  //Action
		  
		  chkRule.setOnAction(e->{
			if(chkRule.isSelected())
			{	
				
				
				btnNext.setVisible(true);
				
			}
			else
			{
				btnNext.setVisible(false);
			}
			
		});
		  
		  
		  
		//VBox Right
		  VBox vboxRight=new VBox();
		  Label lbContactUcsm=new Label("Contacts to UCSM");
		  Label lbAbout=new Label("About Software");
		  Label lbFeedback=new Label("FeedBack--->");
		  Label lbGmail=new Label("Gmail");
		  Label lbFaceBook=new Label("Facebook");
		  
		  HBox hboxForFeedback=new HBox();
		  hboxForFeedback.setSpacing(20);
		  hboxForFeedback.getChildren().add(lbGmail);
		  hboxForFeedback.getChildren().add(lbFaceBook);
		
		  GridPane gpaneRight=new GridPane();
		  gpaneRight.setHgap(15);
		  gpaneRight.setVgap(30);
		  gpaneRight.add(lbContactUcsm, 0, 0);
		  gpaneRight.add(lbAbout, 0, 1);
		  gpaneRight.add(lbFeedback, 0,2 );
		  gpaneRight.add(hboxForFeedback, 1, 2);
			 

		  vboxRight.setAlignment(Pos.CENTER);
		  vboxRight.getChildren().add(gpaneRight);
		  
		  //Add Center
		  StackPane spaneCenter=new StackPane();
		  Rectangle rec=new Rectangle(0,0,900,450);
		  rec.setStroke(Color.BLACK);
		  rec.setFill(Color.WHITE);
		  spaneCenter.getChildren().add(rec);
		  spaneCenter.getChildren().add(text);
		  vboxCenter.getChildren().add(fpaneTitle);
		  vboxCenter.getChildren().add(lbRead);
		  vboxCenter.getChildren().add(spaneCenter);
		  vboxCenter.getChildren().add(chkRule);
		 vboxCenter.getChildren().add(fpaneButton);
		  
		
		  
		  
		  
		HBox hbox=new HBox();
		hbox.setSpacing(30);
		hbox.getChildren().add(vboxRight);
		hbox.getChildren().add(vboxCenter);
		
		
		
		
			
			Scene scene=new Scene(hbox,1400,700);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Student Agreement");
			primaryStage.show();
			
			
			//Design and Style
			chkRule.setFont(Font.font("Times New Roman",18));
			lbTitle.setFont(Font.font("Times New Roman",25));
			lbRead.setFont(Font.font("Times New Roman",18));
			text.setFont(Font.font("Times New Roman",18));
			lbGmail.setFont(Font.font("Times New Roman",16));
			lbFaceBook.setFont(Font.font("Times New Roman",16));
			lbAbout.setFont(Font.font("Times New Roman",16));
			lbContactUcsm.setFont(Font.font("Times New Roman",16));
			lbFeedback.setFont(Font.font("Times New Roman",16));
			lbContactUcsm.setTextFill(Color.BLUEVIOLET);
			lbAbout.setTextFill(Color.BLUEVIOLET);
			lbGmail.setTextFill(Color.BLUEVIOLET);
			lbFaceBook.setTextFill(Color.BLUEVIOLET);
			btnCancel.setFont(Font.font("Times New Roman",18));
			btnNext.setFont(Font.font("Times New Roman",18));
			hbox.setStyle("-fx-background-color : skyblue");
			//Action
			lbGmail.setOnMouseClicked(e->
			{
				Runtime rTime=Runtime.getRuntime();
				String url="https://myaccount.google.com/?pli=1";
				String browser="C:/Program Files/Internet Explorer/iexplore.exe ";
				Process pc;
				
				try {
					pc = rTime.exec(browser+url);
					pc.waitFor();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			
			
			lbFaceBook.setOnMouseClicked(e->{
				Runtime rTime=Runtime.getRuntime();
				String url="https://m.facebook.com/tharhtet.san.902?refid=46&sld=eyJzZWFyY2hfc2lkIjoiZTJlYWVjYTJiNThmYmRjNjAwYjY0NTdjM2Q4YzJhY2MiLCJxdWVyeSI6InRoYXIgaHRldCBzYW4iLCJzZWFyY2hfdHlwZSI6IlNlYXJjaCIsInNlcXVlbmNlX2lkIjo5NzU2NTI0NDUsInBhZ2VfbnVtYmVyIjoxLCJmaWx0ZXJfdHlwZSI6IlNlYXJjaCIsImVudF9pZCI6MTAwMDExNTUyMjk4MDI3LCJwb3NpdGlvbiI6MCwicmVzdWx0X3R5cGUiOjIwNDh9&fref=search";
				String browser="C:/Program Files/Internet Explorer/iexplore.exe ";
				Process pc;
				
				try {
					pc = rTime.exec(browser+url);
					pc.waitFor();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			
			lbAbout.setOnMouseClicked(e->
			{
				try {
					AboutSoftWare aboutSoftWare=new AboutSoftWare();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			
			lbContactUcsm.setOnMouseClicked(e->{
				Runtime rTime=Runtime.getRuntime();
				String url="http://www.ucsm.edu.mm/";
				String browser="C:/Program Files/Internet Explorer/iexplore.exe ";
				Process pc;
				
				try {
					pc = rTime.exec(browser+url);
					pc.waitFor();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			
			btnCancel.setOnAction(e->{
				primaryStage.close();
			});
			
			btnNext.setOnAction(e->{
				try {
					NewStudentEntry newStu=new NewStudentEntry();
					PrimaryStage.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			
	}
	
	public CheckStudent() throws Exception
	{
		start(PrimaryStage);
	}
}
