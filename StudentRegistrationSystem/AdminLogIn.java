package StudentRegistrationSystem;

import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AdminLogIn extends Application{
	//UserName and Password
	

	
	static Stage primarStage1=new Stage();
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
						 
			//Including Items
				 Label lbUserName=new Label("User Name :");
				 Label lbPassword=new Label("Passwod    :");
				 Label lbAdmin=new Label("..:Administrator Log In :..");			 
				  TextField txtUserName=new TextField();
				 PasswordField txtPassword=new PasswordField();
				 Button btnLogIn=new Button(" Log In ");
				 Button btnCancel=new Button(" Cancel ");
		
				 FlowPane fpaneBtn=new FlowPane();
				 fpaneBtn.setHgap(30);
				 fpaneBtn.getChildren().addAll(btnLogIn,btnCancel);
				 fpaneBtn.setAlignment(Pos.CENTER_RIGHT);
				 
		GridPane gpane=new GridPane();
		gpane.setHgap(20);
		gpane.setVgap(20);
		gpane.add(lbUserName, 0, 0);
		gpane.add(txtUserName, 1, 0);
		gpane.add(lbPassword, 0, 1);
		gpane.add(txtPassword, 1, 1);
		gpane.add(fpaneBtn, 1, 2);
		gpane.setHalignment(fpaneBtn, HPos.RIGHT);
		
		VBox vbox=new VBox();
		vbox.setSpacing(20);
		vbox.getChildren().add(lbAdmin);
		vbox.getChildren().add(gpane);
		
		
		
		
		
		//Action for Administrator login
				btnLogIn.setOnAction(e->{
					String userName=txtUserName.getText();
					String Password=txtPassword.getText();
					GetAndSetPassword pass = null;
					try {
						pass = new GetAndSetPassword();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					String	AdminUserName=pass.getUserName();
					String AdminPassword=pass.getPassword();
					isAdministrator(userName,Password,AdminUserName,AdminPassword);
					
				});
				
				txtPassword.setOnAction(e->{
					String userName=txtUserName.getText();
					String Password=txtPassword.getText();
				GetAndSetPassword pass = null;
				try {
					pass = new GetAndSetPassword();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					String AdminUserName=pass.getUserName();
					String AdminPassword=pass.getPassword();
					isAdministrator(userName,Password,AdminUserName,AdminPassword);
					
				});
				
				btnCancel.setOnAction(e->{
					primaryStage.close();
				});
				
				
				
				
				FlowPane fpane=new FlowPane();
				
				fpane.getChildren().add(vbox);
				fpane.setAlignment(Pos.CENTER);
				Scene scene=new Scene(fpane,600,200);
				primaryStage.setScene(scene);
				primaryStage.setTitle("Admin Log In ");
				primaryStage.initStyle(StageStyle.TRANSPARENT);
				primaryStage.show();
		
				
				

				//set Style
				txtUserName.setStyle("-fx-border-color: green; -fx-background-color: skyblue;");
				txtPassword.setStyle("-fx-border-color: green; -fx-background-color: skyblue;");
				
				lbAdmin.setFont(Font.font("Times New Roman",20));
				lbUserName.setFont(Font.font("Times New Roman",18));
				lbPassword.setFont(Font.font("Times New Roman",18));
				btnLogIn.setFont(Font.font("Times New Roman",18));
				btnCancel.setFont(Font.font("Times New Roman",18));
				
				fpane.setStyle("-fx-border-color: green; -fx-background-color: skyblue;");
				
	}
	//Checking Admin Account
		public static void isAdministrator(String str1,String str2,String AdminUserName,String AdminPassword)
		{
			if(str1.equals(AdminUserName)&&str2.equals(AdminPassword))
			{
				javax.swing.JOptionPane.showMessageDialog(null, "Welcome "+AdminUserName, "Success", 1);
				try {
					AdminMenu newStu=new AdminMenu();
					StratWelcome stuWelcome=new StratWelcome(1);
					primarStage1.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else
			{
				if(javax.swing.JOptionPane.showConfirmDialog(null, "Incorrect User Name or Password.\nTry Again","Incorrect Password",javax.swing.JOptionPane.YES_OPTION,javax.swing.JOptionPane.ERROR_MESSAGE)==javax.swing.JOptionPane.YES_OPTION)
				{
					primarStage1.close();
					primarStage1.show();
				}
				else
				{
					primarStage1.close();
				}
			}
			
		}
		public AdminLogIn() throws Exception
		{
		
			start(primarStage1);
		}
		
		public AdminLogIn(int a)
		{
			
		}
		
		
}
