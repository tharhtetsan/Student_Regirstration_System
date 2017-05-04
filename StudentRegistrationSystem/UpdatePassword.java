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
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class UpdatePassword extends Application{
	static Stage stage=new Stage();
	@Override
			public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		

		//Including Items
		Label lbusername=new Label  ("User Name           :");
		Label lbCuPassword=new Label("Current Password    :");
		Label lbRePassword=new Label("Reenter Password :");
		Label lbNewPassword=new Label("New Passwod    :");
		
		Label lbAdmin=new Label("..:Change Password:..");
		TextField txtusreName=new TextField();
		PasswordField txtCuPassword=new PasswordField();
		PasswordField txtRePassword=new PasswordField();
		PasswordField txtNewPassword=new PasswordField();
		Button btnChange=new Button("Change");
		Button btnCancle=new Button("Cancle");
	 
		FlowPane fpane=new FlowPane();
		fpane.setHgap(80);
		fpane.getChildren().add(btnChange);
		fpane.getChildren().add(btnCancle);
		fpane.setAlignment(Pos.CENTER);
		
		GridPane gpane=new GridPane();
		gpane.setHgap(20);
		gpane.setVgap(20);
		gpane.add(lbusername, 0, 0);
		gpane.add(txtusreName, 1, 0);
		gpane.add(lbCuPassword, 0, 1);
		gpane.add(txtCuPassword, 1, 1);
		gpane.add(lbNewPassword, 0, 2);
		gpane.add(txtNewPassword, 1, 2);
		gpane.add(lbRePassword, 0, 3);
		gpane.add(txtRePassword, 1, 3);
		gpane.add(fpane, 1, 4);

		VBox vbox=new VBox();
		vbox.setSpacing(20);
		vbox.getChildren().add(lbAdmin);
		vbox.getChildren().add(gpane);





		//Action for Administrator login
		btnChange.setOnAction(e->{
		String CurrentPassowrd=txtCuPassword.getText();
		String NewPassword=txtNewPassword.getText();
		String RePassword=txtRePassword.getText();
		String userName=txtusreName.getText();
		
		GetAndSetPassword pass = null;
		try {
			pass = new GetAndSetPassword();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String  AdminPassword=pass.getPassword();
		System.out.println(AdminPassword);
		try {
			ChangePassword(userName,AdminPassword,CurrentPassowrd,NewPassword,RePassword);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	});
		txtRePassword.setOnAction(e->
		{
			String CurrentPassowrd=txtCuPassword.getText();
			String NewPassword=txtNewPassword.getText();
			String RePassword=txtRePassword.getText();
			String userName=txtusreName.getText();
			GetAndSetPassword pass = null;
			try {
				pass = new GetAndSetPassword();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String  AdminPassword=pass.getPassword();
			System.out.println(AdminPassword);
			try {
				ChangePassword(userName,AdminPassword,CurrentPassowrd,NewPassword,RePassword);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
	
		btnCancle.setOnAction(e->{
			primaryStage.close();
		});
	
	
		FlowPane fpane1=new FlowPane();
	
		fpane1.getChildren().add(vbox);
		fpane1.setAlignment(Pos.CENTER);
		Scene scene=new Scene(fpane1,700,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Change Password");
		primaryStage.show();
		

	
	

	//set Style
		txtCuPassword.setStyle("-fx-border-color: green; -fx-background-color: skyblue;");
		txtNewPassword.setStyle("-fx-border-color: green; -fx-background-color: skyblue;");
		txtRePassword.setStyle("-fx-border-color: green; -fx-background-color: skyblue;");
		txtusreName.setStyle("-fx-border-color: green; -fx-background-color: skyblue;");
		lbAdmin.setFont(Font.font("Times New Roman",20));
		lbCuPassword.setFont(Font.font("Times New Roman",18));
		lbusername.setFont(Font.font("Times New Roman",18));
		lbNewPassword.setFont(Font.font("Times New Roman",18));
		lbRePassword.setFont(Font.font("Times New Roman",18));
		btnChange.setFont(Font.font("Times New Roman",18));
		btnCancle.setFont(Font.font("Times New Roman",18));
		
			
		fpane1.setStyle("-fx-border-color: green; -fx-background-color: skyblue;");

		
		
		
		
}
	//Checking Admin Account
	public  void ChangePassword(String userName,String AdminPassword,String CuPass,String newPass,String RePass) throws IOException 
	{
		GetAndSetPassword pass=new GetAndSetPassword();
		if(AdminPassword.equals(CuPass))
		{
			if(newPass.equals(RePass))
			{
				pass.setUserNameAndPassword(userName, newPass);
				javax.swing.JOptionPane.showMessageDialog(null, "Change Password Successful", "Success", 1);
				stage.close();
				
			}
			else
			{
				javax.swing.JOptionPane.showMessageDialog(null, "The Password you entered don't match\n\tTry Again", "Password Don't Match", 2);
				stage.close();
				stage.show();
				
			}
			
			
		}
		else
		{
			if(javax.swing.JOptionPane.showConfirmDialog(null, "Incorrect Password.\nTry Again","Incorrect Password",javax.swing.JOptionPane.YES_OPTION,javax.swing.JOptionPane.ERROR_MESSAGE)==javax.swing.JOptionPane.YES_OPTION)
			{
				stage.close();
				stage.show();
			}
			else
			{
				stage.close();
			}
		}

	}
	public UpdatePassword() throws Exception
	{
		
		start(stage);
		
	}


}
