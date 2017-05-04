package StudentRegistrationSystem;

import java.io.FileNotFoundException;
import java.io.IOException;
//for database
import java.sql.*;
import javax.swing.*;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.RadioButton;
public class NewStudentEntry extends Application{

	static Stage sta=new Stage();
	
	//Static Data Type
	static TextField txtStudentID=new TextField();
	static TextField txtStudentName=new TextField();
	static TextField txtFatherName=new TextField();
	static TextField txtNRC=new TextField();
	static DatePicker txtBirthday=new DatePicker();
	static TextArea txtAQualification=new TextArea();
	static TextArea txtAddress=new TextArea();
	static RadioButton rdoMale=new RadioButton("Male");
	static RadioButton rdoFeMale=new RadioButton("FeMale");
	ToggleGroup group=new ToggleGroup();
	static ComboBox comYear=new ComboBox();
	
	static ComboBox comSpecialization=new ComboBox();
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception,NullPointerException {
		// TODO Auto-generated method stub
		
		//including Items 
		Label lbStudentID=new Label("Student ID : ");
		Label lbName=new Label("Student Name : ");
		Label lbNRC=new Label("NRC    : ");
		Label lbFName=new Label("Father Name : ");
		Label lbGender=new Label("Gender : ");
		Label lbAddress=new Label("Address : ");
		Label lbSpecializtion=new Label("Specialization :");
		Label lbQualification=new Label("Qualification :");
		
		Image imgLogo=new Image("ProjectImage/8.jpg");
		ImageView imgvLogo=new ImageView(imgLogo);
		imgvLogo.setFitHeight(100);
		imgvLogo.setFitWidth(100);
		Label lbUcsm=new Label("University of Computer Studies Mandalay\n----------------------------------------------------",imgvLogo);
		lbUcsm.setContentDisplay(ContentDisplay.LEFT);
		
		
		Label lbBirthday=new Label("Birth Day :");
		
		//Set Data Field
		txtStudentID.setEditable(false);
		txtAQualification.setPrefColumnCount(23);
		txtAQualification.setPrefRowCount(5);
		txtAQualification.setWrapText(true);
		txtAQualification.setStyle("-fx-text-fill: black;");
		txtAQualification.setFont(Font.font("Times New Roman",15));
		
		txtAddress.setPrefColumnCount(23);
		txtAddress.setPrefRowCount(3);
		txtAddress.setWrapText(true);
		txtAddress.setStyle("-fx-text-fill: black;");
		txtAddress.setFont(Font.font("Times New Roman",15));
		
		Button btnSubmit=new Button("  Submit   ");
		Button btnReset=new Button ("   Reset   ");
		Button btnCalcle=new Button("  Cancel  ");
		comYear.getItems().clear();
		comSpecialization.getItems().clear();
		comYear.getItems().addAll("First Year","Second Year","Third Year","Fourth Year","Final");
		comYear.setValue("First Year");
		
		//Radio Button
		rdoMale.setToggleGroup(group);
		rdoFeMale.setToggleGroup(group);
		FlowPane fpaneRdo=new FlowPane();
		fpaneRdo.setHgap(200);
		fpaneRdo.getChildren().add(rdoMale);
		fpaneRdo.getChildren().add(rdoFeMale);
		fpaneRdo.setAlignment(Pos.CENTER);
		
		
		
		GridPane gpaneCenter1=new GridPane();
		gpaneCenter1.setHgap(20);
		gpaneCenter1.setVgap(30);
		gpaneCenter1.add(lbStudentID, 0, 0);
		gpaneCenter1.add(txtStudentID, 1, 0);
		
		gpaneCenter1.add(lbName, 0, 1);
		gpaneCenter1.add(txtStudentName, 1, 1);
		
		gpaneCenter1.add(lbNRC, 0,2 );
		gpaneCenter1.add(txtNRC, 1, 2);
		
		gpaneCenter1.add(lbFName, 0, 3);
		gpaneCenter1.add(txtFatherName, 1, 3);
		
		gpaneCenter1.add(lbGender, 0, 4);
		gpaneCenter1.add(fpaneRdo, 1, 4);
		
		//ComboBox
		FlowPane fpaneCombo=new FlowPane();
		fpaneCombo.setHgap(80);
		fpaneCombo.setVgap(20);
		fpaneCombo.getChildren().add(comYear);
		fpaneCombo.getChildren().add(comSpecialization);
		gpaneCenter1.add(lbBirthday, 0, 5);
		gpaneCenter1.add(txtBirthday, 1, 5);
		
		
		GridPane gpaneCenter2=new GridPane();
		gpaneCenter2.setHgap(10);
		gpaneCenter2.setVgap(20);
		gpaneCenter2.add(lbAddress, 0, 0);
		gpaneCenter2.add(txtAddress, 1,0);
		
		gpaneCenter2.add(lbSpecializtion, 0, 1);
		gpaneCenter2.add(fpaneCombo, 1, 1);
		
		gpaneCenter2.add(lbQualification, 0, 2);
		gpaneCenter2.add(txtAQualification, 1, 2);
		
		
		//Add Button
		FlowPane fpaneBotton=new FlowPane();
		fpaneBotton.setHgap(200);
		fpaneBotton.setVgap(300);
		fpaneBotton.setPadding(new Insets(7));
		fpaneBotton.getChildren().add(btnSubmit);
		fpaneBotton.getChildren().add(btnReset);
		fpaneBotton.getChildren().add(btnCalcle);
		fpaneBotton.setAlignment(Pos.TOP_CENTER);
	
		FlowPane fpaneCenter=new FlowPane();
		fpaneCenter.setVgap(20);
		fpaneCenter.setHgap(20);
		fpaneCenter.getChildren().add(gpaneCenter1);
		fpaneCenter.getChildren().add(gpaneCenter2);
		fpaneCenter.getChildren().add(fpaneBotton);
		
		
		
		//Add Top
		
		FlowPane fpaneTop=new FlowPane();
		fpaneTop.getChildren().add(lbUcsm);
		fpaneTop.setAlignment(Pos.TOP_CENTER);
		
		
		//AddLeft
		
		
		
		
		//Design
		BorderPane bpane=new BorderPane();
		bpane.setTop(fpaneTop);
		//bpane.setLeft(vboxLeft);
		bpane.setCenter(fpaneCenter);
		bpane.setBottom(fpaneBotton);
		
		
		
		//Set Style
		lbUcsm.setFont(Font.font("Times New Roman",30));
		
		fpaneBotton.setStyle("-fx-background-color: royalblue;");
		bpane.setStyle("-fx-border-color: green; -fx-background-color: skyblue");
		btnCalcle.setFont(Font.font("Times New Roman",20));
		btnReset.setFont(Font.font("Times New Roman",20));
		btnSubmit.setFont(Font.font("Times New Roman",20));
		lbStudentID.setFont(Font.font("Times New Roman",20));
		lbName.setFont(Font.font("Times New Roman",20));
		lbFName.setFont(Font.font("Times New Roman",20));
		lbAddress.setFont(Font.font("Times New Roman",20));
		lbGender.setFont(Font.font("Times New Roman",20));
		lbQualification.setFont(Font.font("Times New Roman",20));
		lbSpecializtion.setFont(Font.font("Times New Roman",20));
		lbBirthday.setFont(Font.font("Times New Roman",20));
		lbNRC.setFont(Font.font("Times New Roman",20));
		txtStudentID.setStyle("-fx-border-color: green; -fx-background-color: skyblue;");
		rdoMale.setFont(Font.font("Times New Roman",15));
		rdoFeMale.setFont(Font.font("Times New Roman",15));
		comYear.setStyle("-fx-color :greenyellow;");
		comSpecialization.setStyle("-fx-color :greenyellow;");
	
		
		
		
		
		//Actino button
		btnSubmit.setOnAction(e->{
			try {
				checkData();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		});
		btnReset.setOnAction(e->{
			clearData();
		});
		btnCalcle.setOnAction(e->{
			clearData();
			sta.close();
		});
		
		comSpecialization.setValue("CST");
		comYear.setOnAction(e->
		{
			
		if(comYear.getValue().equals("First Year"))
		{	
		
			comSpecialization.getItems().clear();
			comSpecialization.setValue("CST");
			comSpecialization.getItems().add("CST");
		}
		else if(comYear.getValue().equals("Second Year"))
			{	comSpecialization.getItems().clear();
			
				comSpecialization.getItems().addAll("Software(CS)" ,"Hardware(CT)");
				comSpecialization.setValue("Hardware(CT)");
				
			}
			else if(comYear.getValue().equals("Third Year"))
			{
			
			comSpecialization.getItems().clear();
				comSpecialization.getItems().addAll("Software(CS)","Hardware(CT)");
				comSpecialization.setValue("Hardware(CT)");
				}
			else if(comYear.getValue().equals("Fourth Year"))
			{
				comSpecialization.getItems().clear();
			
				comSpecialization.getItems().addAll("Business Information System(BIS)","Knowledge Engineering(KE)","High Performance Computing(HPC)","Embedded System");
				comSpecialization.setValue("Embedded System");
					
			}
			else{
				comSpecialization.getItems().clear();
				comSpecialization.setValue("Specialication");
			}
			
				
				
				
		});
		
		Scene scene=new Scene(bpane,1400,700);
		primaryStage.setTitle("..:New Student Entry:..");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	
	public NewStudentEntry() throws Exception{
		AutoID();
		clearData();
	start(sta);
		
	}
	
	
	

	
	
	//Section of Data input and output
	
	public static void AutoID()
	{
		try{
		
			GetAndSetSutdentData studata=new GetAndSetSutdentData();
			int id=0;
			id=studata.getLastID();
			System.out.println(id);
			if(id==0)
			{
				txtStudentID.setText("1");
			}
			else
			{
				txtStudentID.setText(""+(id+1));
			}
				
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	
	
	
	
	public void checkData() throws FileNotFoundException, IOException
	{
		String gender="";
		if(rdoFeMale.isSelected())
			gender="Female";
		
		if(rdoMale.isSelected())
			gender="Male";
		
		if(txtStudentName.getText().trim().equals(""))
		{
			JOptionPane.showMessageDialog(null,"You must enter Student Name","Student Name Error", 0);
			txtStudentName.requestFocus();
		}
		else if(txtFatherName.getText().trim().equals(""))
		{
			JOptionPane.showMessageDialog(null,"You must enter Student's Father Name","Father Name Error", 0);
			txtFatherName.requestFocus();
		}
		else if(txtNRC.getText().trim().equals(""))
		{
			JOptionPane.showMessageDialog(null,"You must enter Student's NRC","NRC Error", 0);
			txtNRC.requestFocus();
		}
		else if(txtBirthday.toString().trim().equals(""))
		{
			JOptionPane.showMessageDialog(null,"You must enter Student's Birthday","Student's BirthDay Error", 0);
			txtBirthday.requestFocus();
		}
		else if(txtAQualification.getText().trim().equals(""))
		{
			JOptionPane.showMessageDialog(null,"You must enter Student's Qualification if don't have anything type <normal>","Qualification Error", 0);
			txtAQualification.requestFocus();
		}
		else if(txtAddress.getText().trim().equals(""))
		{
			JOptionPane.showMessageDialog(null,"You must enter Student's Address","Student Address Error", 0);
			txtAddress.requestFocus();
		}
		else if(gender.equals(""))
		{
			JOptionPane.showMessageDialog(null,"You must choose Gender","Gender Error", 0);
		}
		else{
			String stu[]=new String[10];
			stu[0]=txtStudentID.getText().toString().trim();
			stu[1]=txtStudentName.getText().toString().trim();
			stu[2]=txtNRC.getText().toString().trim();
			stu[3]=txtFatherName.getText().toString().trim();
			
			
			if(rdoFeMale.isSelected())
				stu[4]="Female";
			else
				stu[4]="Male";
			
			stu[5]=txtBirthday.getValue().toString().trim();
			stu[6]=comYear.getSelectionModel().getSelectedItem().toString().trim();
			stu[7]=comSpecialization.getSelectionModel().getSelectedItem().toString().trim();
			stu[8]=txtAddress.getText().toString().trim();
			stu[9]=txtAQualification.getText().toString().trim();
			PersonalInformation person=new PersonalInformation(stu);
		}
		
		
	}
	
	
	
	
	
	public static void saveRecord(String[] stu) throws FileNotFoundException, IOException
	{
		
		String stuNrc=txtNRC.getText().toString().trim();
		GetAndSetSutdentData stuData=new GetAndSetSutdentData();
		
		try{
			if(!stuData.isAlradyExist(stuNrc))
		
		{
			stuData.setStudentData(stu);
			JOptionPane.showMessageDialog(null,"Save Successfully","Success", 1);
			AutoID();
			clearData();
		}
		else
		{
			JOptionPane.showMessageDialog(null,"This record is already exist","Alrady Exist Error", 0);
			txtNRC.requestFocus();
			txtNRC.selectAll();
			return ;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	public static void clearData()
	{
		txtFatherName.clear();
		txtNRC.clear();
	
		txtStudentName.clear();
		txtAQualification.clear();
		txtAddress.clear();
		comYear.setValue("First Year");
		comSpecialization.setValue("CST");
		rdoFeMale.setSelected(false);
		rdoMale.setSelected(false);
		rdoFeMale.setDisable(false);
		rdoMale.setDisable(false);
	}
	
}
