package StudentRegistrationSystem;



import java.awt.image.PixelInterleavedSampleModel;
import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

public class StratWelcome extends Application{
static Stage primaryStage1=new Stage();


	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		
		//Add Top

		Image imgLogo=new Image("ProjectImage/8.jpg");
		ImageView imgvLogo=new ImageView(imgLogo);
		imgvLogo.setFitHeight(100);
		imgvLogo.setFitWidth(100);
		Line liucsm=new Line(0,0,680,0);
		Label lbUcsm=new Label("Welcome from,\n\tUniversity of Computer Studies Mandalay(UCSM)",liucsm);
		lbUcsm.setContentDisplay(ContentDisplay.BOTTOM);
		
		
		
		Label lbBotton=new Label("Administrator or Student");
		Button btnAdmin=new Button(" Admin ");
		Button btnStu=new Button(" Student ");


		////Add buttom
		FlowPane xboxButtom=new FlowPane();
		Line  liContactus=new Line(0,0,150,0);
		Label lbContactus=new Label("www.ucsm.edu.mm",liContactus);
		lbContactus.setContentDisplay(ContentDisplay.BOTTOM);
		Label lbAboutSW=new Label(" About..            ");
		xboxButtom.getChildren().add(lbAboutSW);
		xboxButtom.setAlignment(Pos.BASELINE_RIGHT);
		
		
		//add Center
		
		GridPane gpaneCenter=new GridPane();
		gpaneCenter.setHgap(20);
		
		Image img=new Image("ProjectImage/6.png");
		ImageView imgv=new ImageView(img);
		imgv.setFitHeight(200);
		imgv.setFitWidth(300);
		Label lbAbout=new Label("On 18th September 1997, \n the University of Computer Studies, Mandalay \n was established under the Ministry of Science \n and Technology  to conduct teaching and research \n in various branches of computer science \n and technology.");
		
		Image img1=new Image("ProjectImage/7.jpg");
		ImageView imgv1=new ImageView(img1);
		imgv1.setFitHeight(200);
		imgv1.setFitWidth(300);
		Label lbAbout1=new Label("To help meet the growing need for and \n advanced computer education in Myanmar, \n UCSM offers both undergraduate and postgraduate degrees \n as well as diploma programs in computer studies.\n On 27th January 2009, the Ph.D. program was started. ",imgv1);
		lbAbout1.setContentDisplay(ContentDisplay.LEFT);
		
		Image img2=new Image("ProjectImage/2.png");
		ImageView imgv2=new ImageView(img2);
		imgv2.setFitHeight(200);
		imgv2.setFitWidth(250);
		Label lbAbout2=new Label("\t\tThe Main Purpose of the UCSM are \n\t---------------------------------------------------------\n -To help meet the growing need for general and advanced computer education in Myanmar. \n -To train Information Technology (IT) professionals, leaders and entrepreneurs for Myanmar \n -To advance research and development in both the academic and professional disciplines \n -To offer both undergraduate and post graduate degrees as well as diploma programs in computer studies. \n -To foster the outstanding products of the University to become high caliber experts.",imgv2);
		lbAbout2.setContentDisplay(ContentDisplay.LEFT);
		
		
		
		
		HBox xboxpane=new HBox();
		xboxpane.setSpacing(200);
		xboxpane.getChildren().add(btnAdmin);
		xboxpane.getChildren().add(btnStu);
		xboxpane.setAlignment(Pos.CENTER);
		
		
		gpaneCenter.add(lbAbout, 0,0);
		gpaneCenter.add(lbAbout1, 1,0);
		VBox vboxCenter=new VBox();
		vboxCenter.setSpacing(20);
		vboxCenter.getChildren().add(gpaneCenter);
		vboxCenter.getChildren().add(lbAbout2);
		
		Label lbAdmin=new Label("\tLets Started To Register To Our University!");
		vboxCenter.getChildren().add(lbAdmin);
		vboxCenter.getChildren().add(xboxpane);
		vboxCenter.getChildren().add(xboxButtom);
		
		
		//Add Left
		VBox vboxleft=new VBox();
		vboxleft.getChildren().add(imgv);
		vboxleft.setSpacing(333);
		vboxleft.getChildren().add(lbContactus);
		
		
		
		//Design
		BorderPane bpane=new BorderPane();
		HBox hbox=new HBox();
		hbox.setSpacing(60);
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().addAll(imgvLogo,lbUcsm);
		bpane.setTop(hbox);
		bpane.setAlignment(lbUcsm, Pos.CENTER);
		bpane.setCenter(vboxCenter);
		bpane.setAlignment(vboxCenter, Pos.CENTER);
		bpane.setLeft(vboxleft);
		
		
		
		//Set Style
		bpane.setStyle("-fx-background-color:skyblue");
		lbUcsm.setFont(Font.font("Times New Roman",30));
		lbAbout.setFont(Font.font("Times New Roman",16));
		lbAbout1.setFont(Font.font("Times New Roman",16));
		lbAbout2.setFont(Font.font("Times New Roman",17));
		lbAdmin.setFont(Font.font("Times New Roman",20));
		btnAdmin.setFont(Font.font("Times New Roman",18));
		btnStu.setFont(Font.font("Times New Roman",18));
		lbAboutSW.setFont(Font.font("Times New Roman",18));
		lbContactus.setFont(Font.font("Times New Roman",18));
		lbContactus.setTextFill(Color.BLUEVIOLET);
		lbAboutSW.setTextFill(Color.BLUEVIOLET);
		
		
		//Add Amination
				//Amination for title
				PathTransition pt=new PathTransition();
				pt.setNode(lbUcsm);
				Line li=new Line(300,700,300,30);
				pt.setPath(li);
				pt.setDuration(Duration.millis(2000));
				pt.setCycleCount(1);
				pt.play();
				
				//Amination for logo
				ImageView imvlog=new ImageView(imgLogo);
				FadeTransition ft =new FadeTransition(Duration.millis(3000), imgvLogo);
				 ft.setToValue(0.1);
				 ft.setFromValue(0.9);
				ft.setCycleCount(Timeline.INDEFINITE);
				ft.setAutoReverse(true);
				ft.play();
				
		
		//Action Admin Button
		btnAdmin.setOnAction(e->
		{
			try {
				AdminLogIn adminLogIn=new AdminLogIn();
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		});
		
		btnStu.setOnAction(e->{
			StudnetMenu stuMenu=new StudnetMenu();
			
		});
		
		lbContactus.setOnMouseClicked(e->{
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
		
		
		lbAboutSW.setOnMouseClicked(e->{
			try {
				
				AboutSoftWare about=new AboutSoftWare();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		
		
		Scene scene=new Scene(bpane,1400,720);
		  primaryStage.setTitle("UCSM"); 
		  primaryStage.setScene(scene);
		  primaryStage.show();
		 ;
			  
		  
	}
	
	
	
	
	
	
	
	
	
	
	//Constuctors
	public StratWelcome()
	{
		
	}
	public StratWelcome(String show)
	{
		try {
			start(primaryStage1);
			StudnetMenu stuMenu=new StudnetMenu(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  StratWelcome(int a)
	{
		primaryStage1.close();
	}
	

}
