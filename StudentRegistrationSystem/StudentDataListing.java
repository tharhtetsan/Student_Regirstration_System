package StudentRegistrationSystem;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
 
public class StudentDataListing extends Application {
 static Stage sta=new Stage();
	public StudentDataListing() throws FileNotFoundException, IOException
	{
		FillData();
		start(sta);
	}
    private TableView<Student> table = new TableView<Student>();
   
    private final static ObservableList<Student> data =FXCollections.observableArrayList();
   
    
 
    @Override
    public void start(Stage stage) {
       
       
 
        final Label label = new Label("Students Listing");
 
        table.setEditable(true);
        table.setMinSize(1150, 500);
        table.setMaxSize(1300, 800);
        TableColumn colid = new TableColumn("    ID   ");
        colid.setMinWidth(50);
        colid.setCellValueFactory(
                new PropertyValueFactory<Student, String>("id"));


        TableColumn colName = new TableColumn("   Name   ");
        colName.setMinWidth(150);
        colName.setCellValueFactory(
                new PropertyValueFactory<Student, String>("name"));


        @SuppressWarnings("rawtypes")
		TableColumn colNrc = new TableColumn("     NRC     ");
        colNrc.setMinWidth(150);
        colNrc.setCellValueFactory(
                new PropertyValueFactory<Student, String>("nrc"));


        TableColumn colFName = new TableColumn("    Father Name   ");
        colFName.setMinWidth(150);
        colFName.setCellValueFactory(
                new PropertyValueFactory<Student, String>("fname"));


        TableColumn colGender = new TableColumn("   Gender   ");
        colGender.setMinWidth(100);
        colGender.setCellValueFactory(
                new PropertyValueFactory<Student, String>("gender"));


        TableColumn colBirthday = new TableColumn("    BirthDay    ");
        colBirthday.setMinWidth(100);
        colBirthday.setCellValueFactory(
                new PropertyValueFactory<Student, String>("birthday"));


        TableColumn colYear = new TableColumn("    Year     ");
        colYear.setMinWidth(100);
        colYear.setCellValueFactory(
                new PropertyValueFactory<Student, String>("year"));


        TableColumn colSpecial = new TableColumn("     Specialization     ");
        colSpecial.setMinWidth(200);
        colSpecial.setCellValueFactory(
                new PropertyValueFactory<Student, String>("special"));


        TableColumn colAddress = new TableColumn("    Address     ");
        colAddress.setMinWidth(120);
        colAddress.setCellValueFactory(
                new PropertyValueFactory<Student, String>("Address"));


        TableColumn colQualification = new TableColumn("  Qualification  ");
        colQualification.setMinWidth(170);
        colQualification.setCellValueFactory(
                new PropertyValueFactory<Student, String>("Qualification"));


      
 
       
        table.setItems(data);
        table.getColumns().addAll(colid,colName,colNrc,colFName,colGender,colBirthday,colYear,colSpecial,colAddress,colQualification);
        
        //Add close button
        Button btnClose=new Button("    Close  ");
        FlowPane  fpane=new FlowPane();
        fpane.getChildren().add(btnClose);
        fpane.setAlignment(Pos.CENTER);
        		
        
        final VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table,fpane);
        
      
        Scene scene = new Scene(vbox,1400,700);
        stage.setTitle("Table View Sample");
        
 
        stage.setScene(scene);
        stage.show();
        
        btnClose.setOnAction(e->{
        	sta.close();
        });
        //Design
        table.setStyle("-fx-color :lightgreen;");
       vbox.setStyle("-fx-background-color : skyblue;");
       label.setFont(new Font("Times New Roman", 22));
       btnClose.setFont(new Font("Times New Roman", 18));
       
    }
    public static void FillData() throws FileNotFoundException, IOException
    {
    	data.clear();
    	try{
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
    		for(int i=0;i<AllStuData.length;i++)
    		{
    			data.add(new Student(studentData[i][0],studentData[i][1],studentData[i][2],studentData[i][3],studentData[i][4],studentData[i][5],studentData[i][6],studentData[i][7],studentData[i][8],studentData[i][9]));
    		}
    	}catch(Exception e)
    	{
    		System.out.println("No data in StudentDataListing class");
    	}
    	
    }
 
    public static class Student{
 
    	private final SimpleStringProperty id;
    	private final SimpleStringProperty name;
    	private final SimpleStringProperty nrc;
    	private final SimpleStringProperty fname;
    	private final SimpleStringProperty gender;
    	private final SimpleStringProperty birthday;
    	private final SimpleStringProperty year;
    	private final SimpleStringProperty special;
    	private final SimpleStringProperty Address;
    	private final SimpleStringProperty Qualification;
    	
    	
        
  Student(String id, String name,String nrc,String fname,String gender,String birthday,String year,String special,String Address,String Qualification) {
            this.id=new SimpleStringProperty(id);
            this.name=new SimpleStringProperty(name);
            this.nrc=new SimpleStringProperty(nrc);
            this.fname=new SimpleStringProperty(fname);
            this.gender=new SimpleStringProperty(gender);
            this.birthday=new SimpleStringProperty(birthday);
            this.year=new SimpleStringProperty(year);
            this.special=new SimpleStringProperty(special);
            this.Address=new SimpleStringProperty(Address);
            this.Qualification=new SimpleStringProperty(Qualification);
            
  }



public String getBirthday() {
	return birthday.get();
}



public String getAddress() {
	return Address.get();
}



public String getId() {
	return id.get();
}



public String getName() {
	return name.get();
}



public String getNrc() {
	return nrc.get();
}



public String getFname() {
	return fname.get();
}



public String getGender() {
	return gender.get();
}



public String getYear() {
	return year.get();
}



public String getSpecial() {
	return special.get();
}



public String getQualification() {
	return Qualification.get();
}

 }
} 
