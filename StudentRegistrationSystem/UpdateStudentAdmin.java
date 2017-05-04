package StudentRegistrationSystem;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler;

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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.RadioButton;
public class UpdateStudentAdmin extends Application{

	static Stage sta=new Stage();
	static ComboBox cobStudentID=new ComboBox();
	static TextField txtStudentName=new TextField();
	static TextField txtFatherName=new TextField();
	static TextField txtNRC=new TextField();
	static TextField txtBirthday=new TextField();
	static 	TextArea txtAddress=new TextArea();
	static TextArea txtAQualification=new TextArea();
	static Button btnSubmit=new Button("  Submit   ");
	static Button btnReset=new Button ("   Reset   ");
	static Button btnCalcle=new Button("  Cancel  ");
	static RadioButton rdoMale=new RadioButton("Male");
	static RadioButton rdoFeMale=new RadioButton("FeMale");
	static ComboBox comYear=new ComboBox();
	static ComboBox comSpecialization=new ComboBox();
	
	
	//Constractor
	public UpdateStudentAdmin() throws Exception{
		ClearData();
		FillID();
		start(sta);
		
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
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
		comYear.getItems().clear();
		comYear.getItems().addAll("First Year","Second Year","Third Year","Fourth Year","Final");
		comYear.setValue("First Year");
		
		//Radio Button
		ToggleGroup group=new ToggleGroup();
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
		gpaneCenter1.add(cobStudentID, 1, 0);
		
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
		rdoMale.setFont(Font.font("Times New Roman",15));
		rdoFeMale.setFont(Font.font("Times New Roman",15));
		comYear.setStyle("-fx-color :greenyellow;");
		comSpecialization.setStyle("-fx-color :greenyellow;");
	
		
		
		
		
		//Actino button
		btnSubmit.setOnAction(e->{
			checkData();
		});
		btnReset.setOnAction(e->{
			txtFatherName.clear();
			txtNRC.clear();
			txtBirthday.clear();
			txtStudentName.clear();
			txtAQualification.clear();
			txtAddress.clear();
			comYear.setValue("First Year");
			comSpecialization.setValue("CST");
		});
		btnCalcle.setOnAction(e->{
			primaryStage.close();
		});
		cobStudentID.setOnAction(e->{
			FillData(cobStudentID.getSelectionModel().getSelectedItem()+"");
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
	
	public void checkData() 
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
		else if(txtBirthday.getText().trim().equals(""))
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
			stu[0]=cobStudentID.getSelectionModel().getSelectedItem().toString().trim();
			stu[1]=txtStudentName.getText().toString().trim();
			stu[2]=txtNRC.getText().toString().trim();
			stu[3]=txtFatherName.getText().toString().trim();
			
			
			if(rdoFeMale.isSelected())
				stu[4]="Female";
			else
				stu[4]="Male";
			
			stu[5]=txtBirthday.getText().toString().trim();
			stu[6]=comYear.getSelectionModel().getSelectedItem().toString().trim();
			stu[7]=comSpecialization.getSelectionModel().getSelectedItem().toString().trim();
			stu[8]=txtAddress.getText().toString().trim();
			stu[9]=txtAQualification.getText().toString().trim();
			OldPersonlInformation1 person=new OldPersonlInformation1(stu);
		}
		
		
	}
	
	
	
	
	public void FillID()
	{
		GetAndSetSutdentData stuData=new GetAndSetSutdentData();
		cobStudentID.getItems().clear();
		int id=stuData.getLastID();
		int i=1;
		while(i<=id)
		{
		cobStudentID.getItems().add(""+i);
		i++;
		}
			
	}
	public void FillData(String id)
	{
		GetAndSetSutdentData stu=new GetAndSetSutdentData();
		String stuData[]=stu.SearchID(id).split("@");

		
		txtStudentName.setText(stuData[1]);
		txtNRC.setText(stuData[2]);
		txtFatherName.setText(stuData[3]);
		txtBirthday.setText(stuData[5]);
		txtAddress.setText(stuData[8]);
		txtAQualification.setText(stuData[9]);
			if(stuData[4].equals("Female"))
				{
				rdoMale.setSelected(false);
				rdoFeMale.setSelected(true);
				rdoMale.setDisable(true);
				rdoFeMale.setDisable(false);
				}else
				{
				rdoMale.setSelected(true);
				rdoFeMale.setSelected(false);
				rdoFeMale.setDisable(true);
				rdoMale.setDisable(false);
				}
			comYear.setValue(stuData[6]);
			comSpecialization.setValue(stuData[7]);
				
			
	}
	
	public static  void saveRecord() throws FileNotFoundException, IOException
	{
		
		SetAndGetDataForUpdate stuData=new SetAndGetDataForUpdate();
		String input=stuData.getStudentDataArray();
		String[] AllStuData=input.split("#");
		
		String studentData[][]=new String[AllStuData.length][10];
		for(int i=0;i<AllStuData.length;i++)
		{
			String line[]=AllStuData[i].split("@");
			for(int j=0;j<10;j++)
			{
			studentData[i][j]=line[j];
			}
		}
	
		String stu[]=new String[10];
		stu[0]=cobStudentID.getSelectionModel().getSelectedItem().toString().trim();
		stu[1]=txtStudentName.getText().toString().trim();
		stu[2]=txtNRC.getText().toString().trim();
		stu[3]=txtFatherName.getText().toString().trim();
		
		
		if(rdoFeMale.isSelected())
			stu[4]="Female";
		else
			stu[4]="Male";
		
		stu[5]=txtBirthday.getText().toString().trim();
		stu[6]=comYear.getSelectionModel().getSelectedItem().toString().trim();
		stu[7]=comSpecialization.getSelectionModel().getSelectedItem().toString().trim();
		stu[8]=txtAddress.getText().toString().trim();
		stu[9]=txtAQualification.getText().toString().trim();
		GetAndSetSutdentData getSetStu=new GetAndSetSutdentData();
		String SearchId[]=getSetStu.SearchID(cobStudentID.getSelectionModel().getSelectedItem().toString().trim()).split("@");
		String id=SearchId[0];
		for(int i=0;i<AllStuData.length;i++)
		{
			if((i+1+"").equals(id+""))
			{
				for(int j=0;j<10;j++)
				{
				studentData[i][j]=stu[j];
				}
						
			}
		}
		for(int i=0;i<AllStuData.length;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(studentData[i][j]+"\t");
			}
			System.out.println();
		}
		
	
		
		try{
			stuData.setStudentDataArray(studentData);
			JOptionPane.showMessageDialog(null,"Save Successfully","Success", 1);
			ClearData();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	
	public static void ClearData()
	{
		cobStudentID.setValue("");
		txtFatherName.clear();
		txtNRC.clear();
		txtBirthday.clear();
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
