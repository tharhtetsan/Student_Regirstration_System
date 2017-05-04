package StudentRegistrationSystem;

import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AboutSoftWare extends Application{
static Stage primaryStage1=new Stage();
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Label lbTr=new Label("Tr Daw Lwin Lwin Nyo");
		Label lbLeader=new Label("Thar Htet San");
		Label lbm1=new Label("Wai Yan Oo");
		Label lbm2=new Label("Ye Yint Myint");
		Label lbm3=new Label("Nyi Nyi Htet");
		Label lbm4=new Label("Naing Htun Lin");
		Label lbVersion=new Label("Software Version-1.0");
		Label lbContactus=new Label("Feedback->->->->");
		Label lbGmail=new Label("Gmail");
		Label lbFacebook=new Label("Facebook");
		
		Line li=new Line(0,0,400,0);
		Label lbTitle=new Label("Modern Self-Student Registration System",li);
		lbTitle.setContentDisplay(ContentDisplay.BOTTOM);
		Label lbsupervise=new Label("Supervise By-");
		Label lbl=new Label("Leader        -");
		Label lbm=new Label("Members     -");
		
		GridPane gpane=new GridPane();
		gpane.setHgap(10);
		gpane.setVgap(10);
		gpane.add(lbsupervise, 0, 0);
		gpane.add(lbTr,1,0);
		gpane.add(lbl,0,1);
		gpane.add(lbLeader,1,1);
		gpane.add(lbm,0,2);
		gpane.add(lbm1,1,2);
		gpane.add(lbm2,1,3);
		gpane.add(lbm3,1,4);
		gpane.add(lbm4,1,5);
		
		VBox vbox=new VBox();
		vbox.setSpacing(15);
		vbox.getChildren().add(lbVersion);
		vbox.getChildren().add(gpane);
		
		HBox hbox=new HBox();
		hbox.setSpacing(20);
		hbox.getChildren().add(lbContactus);
		hbox.getChildren().add(lbGmail);
		hbox.getChildren().add(lbFacebook);
		hbox.setSpacing(20);
		
		vbox.getChildren().add(hbox);
		VBox vboxcenter=new VBox();
		vboxcenter.setSpacing(50);
		vboxcenter.getChildren().add(lbTitle);
		vboxcenter.getChildren().add(vbox);
		vboxcenter.setAlignment(Pos.TOP_CENTER);
		
		
		Scene scene=new Scene(vboxcenter,700,400);
		primaryStage.setTitle("About Developers ");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		//Desing and style
		lbTitle.setFont(Font.font("Times New Roman",24));
		lbl.setFont(Font.font("Times New Roman",18));
		lbTr.setFont(Font.font("Times New Roman",18));
		lbLeader.setFont(Font.font("Times New Roman",18));
		lbm.setFont(Font.font("Times New Roman",18));
		lbm1.setFont(Font.font("Times New Roman",18));
		lbm2.setFont(Font.font("Times New Roman",18));
		lbm3.setFont(Font.font("Times New Roman",18));
		lbm4.setFont(Font.font("Times New Roman",18));
		lbVersion.setFont(Font.font("Times New Roman",18));
		lbsupervise.setFont(Font.font("Times New Roman",18));
		lbFacebook.setFont(Font.font("Times New Roman",18));
		lbFacebook.setTextFill(Color.BLUEVIOLET);
		lbGmail.setTextFill(Color.BLUEVIOLET);
		lbGmail.setFont(Font.font("Times New Roman",18));
		lbContactus.setFont(Font.font("Times New Roman",18));
		vboxcenter.setStyle("-fx-background-color : lightgreen");

	//Action
		lbGmail.setOnMouseClicked(e->{
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
		
		lbFacebook.setOnMouseClicked(e->{
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
			
		
	
	
	
	}
	
public AboutSoftWare() throws Exception
{
	
	start(primaryStage1);
}
}
