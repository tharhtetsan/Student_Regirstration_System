package StudentRegistrationSystem;

import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class OldPersonlInformation1 {
	static Stage primaryStage1=new Stage();
	String str1="";
	String str2="";
	String str3="";
	String str4="";
	String str5="";
	String str6="";
	String str7="";
	String str8="";
	String str9="";
	String str10="";
	String[] stuData=new String[10];
	
	public void start(Stage primaryStage)  {
		// TODO Auto-generated method stub
		Label lbn=new Label  ("Name              :");
		Label lbid=new Label ("ID                   :");
		Label lbnrc=new Label("NRc               :");
		Label lbFn=new Label ("Father Name  :");
		Label lbG=new Label  ("Gender          :");
		Label lbB=new Label  ("Birth Day      :");
		Label lby=new Label  ("Year             :");
		Label lbS=new Label  ("Specializtion  :");
		Label lbA=new Label  ("Address         :");
		Label lbQ=new Label  ("Qualification  :");
		
		Label lbID=new Label(str1);
		Label lbName=new Label(str2);
		Label lbNrc=new Label(str3);
		Label lbFname=new Label(str4);
		Label lbGender=new Label(str5);
		Label lbBirthDay=new Label(str6);
		Label lbYear=new Label(str7);
		Label lbSpecialization=new Label(str8);
		Label lbAddress=new Label(str9);
		Label lbQualification=new Label(str10);
		
		
		
		
		GridPane gpane=new GridPane();
		gpane.setHgap(20);
		gpane.setVgap(20);
		gpane.add(lbid, 0, 0);
		gpane.add(lbID, 1, 0);
		gpane.add(lbn, 0, 1);
		gpane.add(lbName, 1, 1);
		gpane.add(lbnrc, 0, 2);
		gpane.add(lbNrc, 1, 2);
		gpane.add(lbFn, 0, 3);
		gpane.add(lbFname, 1, 3);
		gpane.add(lbG, 0, 4);
		gpane.add(lbGender, 1, 4);
		gpane.add(lby, 0, 5);
		gpane.add(lbYear, 1, 5);
		gpane.add(lbS, 0, 6);
		gpane.add(lbSpecialization, 1, 6);
		gpane.add(lbA, 0, 7);
		gpane.add(lbAddress, 1, 7);
		gpane.add(lbQ, 0, 8);
		gpane.add(lbQualification, 1, 8);
		
		Button btnOK=new Button("      OK      ");
		Button btnCancle=new Button("    Cancel   ");
		HBox hboxButton=new HBox();
		hboxButton.setSpacing(20);
		hboxButton.getChildren().add(btnOK);
		hboxButton.getChildren().add(btnCancle);
		gpane.add(hboxButton, 1, 9);
		Line li=new Line(0,0,250,0);
		Label lbTitle=new Label("Registration Form",li);
		lbTitle.setContentDisplay(ContentDisplay.BOTTOM);
		
		
		VBox vbox=new VBox();
		vbox.setSpacing(30);
		vbox.setAlignment(Pos.TOP_CENTER);
		vbox.getChildren().add(lbTitle);
		vbox.getChildren().add(gpane);
		Scene scene=new Scene(vbox,500,600);
		primaryStage.setTitle("Persnonal Infromation");
		primaryStage.setScene(scene);
		primaryStage.show();
	
		
		btnOK.setOnAction(e->{
			try {
				UpdateStudentAdmin.saveRecord();
				primaryStage1.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		btnCancle.setOnAction(e->{
			primaryStage1.close();
		});
		
		
		//Design 
		lbid.setFont(Font.font("Times New Roman",18));
		lbID.setFont(Font.font("Times New Roman",18));
		lbn.setFont(Font.font("Times New Roman",18));
		lbName.setFont(Font.font("Times New Roman",18));
		lbnrc.setFont(Font.font("Times New Roman",18));
		lbNrc.setFont(Font.font("Times New Roman",18));
		lbFn.setFont(Font.font("Times New Roman",18));
		lbFname.setFont(Font.font("Times New Roman",18));
		lbG.setFont(Font.font("Times New Roman",18));
		lbGender.setFont(Font.font("Times New Roman",18));
		lbB.setFont(Font.font("Times New Roman",18));
		lbBirthDay.setFont(Font.font("Times New Roman",18));
		lby.setFont(Font.font("Times New Roman",18));
		lbYear.setFont(Font.font("Times New Roman",18));
		lbS.setFont(Font.font("Times New Roman",18));
		lbSpecialization.setFont(Font.font("Times New Roman",18));
		lbA.setFont(Font.font("Times New Roman",18));
		lbAddress.setFont(Font.font("Times New Roman",18));
		lbQ.setFont(Font.font("Times New Roman",18));
		lbQualification.setFont(Font.font("Times New Roman",18));
		lbTitle.setFont(Font.font("Times New Roman",20));
		btnCancle.setFont(Font.font("Times New Roman",20));
		btnOK.setFont(Font.font("Times New Roman",18));
		vbox.setStyle("-fx-background-color: lightgreen;");
	
	}
	
	
	public void setData(String str[])
	{
		str1=str[0];
		str2=str[1];
		str3=str[2];
		str4=str[3];
		str5=str[4];
		str6=str[5];
		str7=str[6];
		str8=str[7];
		str9=str[8];
		str10=str[9];
		
		stuData[0]=str[0];
		stuData[1]=str[1];
		stuData[2]=str[2];
		stuData[3]=str[3];
		stuData[4]=str[4];
		stuData[5]=str[5];
		stuData[6]=str[6];
		stuData[7]=str[7];
		stuData[8]=str[8];
		stuData[9]=str[9];
		
	}
	public OldPersonlInformation1(String str[]) 
	{
		setData(str);
		start(primaryStage1);
	}
	
	
}
