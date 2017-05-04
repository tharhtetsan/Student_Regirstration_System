package StudentRegistrationSystem;



import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SearchStudent extends Application{
	static Stage primaryStage1=new Stage();
	
	static TextField txtSearchNrc=new TextField();
	static Button btnnrc=new Button("   Search Nrc  ");
	static ComboBox cobStudentID=new ComboBox();
	static Button btnId=new Button("  Search ID  ");
	Label lbID=new Label("");
	Label lbName=new Label("");
	Label lbNrc=new Label("");
	Label lbFname=new Label("");
	Label lbGender=new Label("");
	Label lbBirthDay=new Label("");
	Label lbYear=new Label("");
	Label lbSpecialization=new Label("");
	Label lbAddress=new Label("");
	Label lbQualification=new Label("");
	

@Override
public void start(Stage primaryStage){
	HBox hboxTop=new HBox();
	
	HBox hboxid=new HBox();
	hboxid.setSpacing(20);
	hboxid.setAlignment(Pos.CENTER);
	hboxid.getChildren().addAll(cobStudentID,btnId);
	
	HBox hboxNrc=new HBox();
	hboxNrc.setSpacing(20);
	hboxNrc.setAlignment(Pos.CENTER);
	hboxNrc.getChildren().addAll(txtSearchNrc, btnnrc);
	
	hboxTop.getChildren().addAll(hboxid,hboxNrc);
	hboxTop.setSpacing(50);
	
	
	Label lbn=new Label  ("Name              :");
	Label lbid=new Label ("ID                   :");
	Label lbnrc=new Label("NRc               :");
	Label lbFn=new Label ("Father Name  :");
	Label lbG=new Label  ("Gender          :");
	Label lbB=new Label  ("Birth Day      :");
	Label lbS=new Label  ("Class              :");
	Label lbA=new Label  ("Address         :");
	Label lbQ=new Label  ("Qualification  :");
	
	

	GridPane gpaneCenter1=new GridPane();
	gpaneCenter1.setHgap(20);
	gpaneCenter1.setVgap(30);
	gpaneCenter1.add(lbid, 0, 0);
	gpaneCenter1.add(lbID, 1, 0);
	
	gpaneCenter1.add(lbn, 0, 1);
	gpaneCenter1.add(lbName, 1, 1);
	
	gpaneCenter1.add(lbnrc, 0,2 );
	gpaneCenter1.add(lbNrc, 1, 2);
	
	gpaneCenter1.add(lbFn, 0, 3);
	gpaneCenter1.add(lbFname, 1, 3);
	
	gpaneCenter1.add(lbG, 0, 4);
	gpaneCenter1.add(lbGender, 1, 4);
	
	//ComboBox
	FlowPane fpaneCombo=new FlowPane();
	fpaneCombo.setHgap(80);
	fpaneCombo.getChildren().add(lbYear);
	fpaneCombo.getChildren().add(lbSpecialization);
	gpaneCenter1.add(lbB, 0, 5);
	gpaneCenter1.add(lbBirthDay, 1, 5);
	
	
	GridPane gpaneCenter2=new GridPane();
	gpaneCenter2.setHgap(10);
	gpaneCenter2.setVgap(20);
	gpaneCenter2.add(lbA, 0, 0);
	gpaneCenter2.add(lbAddress, 1,0);
	
	gpaneCenter2.add(lbS, 0, 1);
	gpaneCenter2.add(fpaneCombo, 1, 1);
	
	gpaneCenter2.add(lbQ, 0, 2);
	gpaneCenter2.add(lbQualification, 1, 2);
	
	FlowPane fpaneCenter=new FlowPane();
	fpaneCenter.setVgap(50);
	fpaneCenter.setHgap(100);
	fpaneCenter.getChildren().add(gpaneCenter1);
	fpaneCenter.getChildren().add(gpaneCenter2);
	fpaneCenter.setAlignment(Pos.CENTER);
	
	
	 StackPane spaneCenter=new StackPane();
	  Rectangle rec=new Rectangle(0,0,1000,450);
	  rec.setStroke(Color.BLACK);
	  rec.setFill(Color.LEMONCHIFFON);
	  spaneCenter.getChildren().add(rec);
	  spaneCenter.getChildren().add(fpaneCenter);
	
	
	  HBox hboxbutton=new HBox();
	  hboxbutton.setSpacing(20);
	  Button btnClose=new Button("   Close    ");
	  Button btnReset=new Button("   Clear    ");
	  hboxbutton.getChildren().add(btnReset);
	  hboxbutton.getChildren().add(btnClose);
	  hboxbutton.setPadding(new Insets(0,0,100,950));
	  Label lbTitle=new Label("..:Student Data Searching:...");
	  VBox vbox=new VBox();
	  vbox.setSpacing(40);
	  vbox.setAlignment(Pos.TOP_CENTER);
	  vbox.setPadding(new Insets(0,0,100,100));
	  vbox.getChildren().addAll(lbTitle,hboxTop,spaneCenter,hboxbutton);
	  
	  
	  Scene scene=new Scene(vbox,1400,700);
	  primaryStage.setTitle("Search Student");
	  primaryStage.setScene(scene);
	  primaryStage.show();
	  
	  
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
		lbYear.setFont(Font.font("Times New Roman",18));
		lbS.setFont(Font.font("Times New Roman",18));
		lbSpecialization.setFont(Font.font("Times New Roman",18));
		lbA.setFont(Font.font("Times New Roman",18));
		lbAddress.setFont(Font.font("Times New Roman",18));
		lbQ.setFont(Font.font("Times New Roman",18));
		lbQualification.setFont(Font.font("Times New Roman",18));
		vbox.setStyle("-fx-background-color: skyblue;");
		btnId.setFont(Font.font("Times New Roman",16));
		btnnrc.setFont(Font.font("Times New Roman",16));
		btnClose.setFont(Font.font("Times New Roman",16));
		btnReset.setFont(Font.font("Times New Roman",16));
		
		lbTitle.setFont(Font.font("Times New Roman",22));
		
		btnId.setOnAction(e->{
			
			txtSearchNrc.clear();
			String id=cobStudentID.getSelectionModel().getSelectedItem().toString().trim();
			FillDataID(id);
		});
		btnnrc.setOnAction(e->{
			cobStudentID.setValue("");
			String nrc=txtSearchNrc.getText().toString().trim();
			FillDataNRC(nrc);
		});
		btnReset.setOnAction(e->{
			ClearData();
		});
		btnClose.setOnAction(e->{
			primaryStage.close();
		});
		
}
public SearchStudent() {
	FillID();
	ClearData();
	start(primaryStage1);
}
	
public static void FillID()
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
public void FillDataID(String id)
{
	GetAndSetSutdentData stu=new GetAndSetSutdentData();
	String stuData[]=stu.SearchID(id).split("@");
	lbID.setText(stuData[0]);
	lbName.setText(stuData[1]);
	lbNrc.setText(stuData[2]);
	lbFname.setText(stuData[3]);
	lbGender.setText(stuData[4]);
	lbBirthDay.setText(stuData[5]);
	lbAddress.setText(stuData[8]);
	lbYear.setText(stuData[6]);
	lbSpecialization.setText(stuData[7]);
	lbQualification.setText(stuData[9]);
	
}
public void FillDataNRC(String nrc)
{
	try{
	GetAndSetSutdentData stu=new GetAndSetSutdentData();
	String stuData[]=stu.SearchNRC(nrc).split("@");
	lbID.setText(stuData[0]);
	lbName.setText(stuData[1]);
	lbNrc.setText(stuData[2]);
	lbFname.setText(stuData[3]);
	lbGender.setText(stuData[4]);
	lbBirthDay.setText(stuData[5]);
	lbAddress.setText(stuData[8]);
	lbYear.setText(stuData[6]);
	lbSpecialization.setText(stuData[7]);
	lbQualification.setText(stuData[9]);
	}
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(null,"Invalid NRC","Error",0);
		txtSearchNrc.selectAll();
	}
}
public  void ClearData()
{
	txtSearchNrc.clear();
	cobStudentID.setValue("");
	lbID.setText("");
	lbName.setText("");
	lbNrc.setText("");
	lbFname.setText("");
	lbGender.setText("");
	lbBirthDay.setText("");
	lbAddress.setText("");
	lbYear.setText("");
	lbSpecialization.setText("");
	lbQualification.setText("");
	
}

}
