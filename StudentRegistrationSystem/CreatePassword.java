package StudentRegistrationSystem;
import java.io.*;
public class CreatePassword {
public static void main(String[] args) throws FileNotFoundException, IOException {
	
	try(DataOutputStream output=new DataOutputStream(new FileOutputStream("D:/key.dat"));)
	{
		output.writeUTF("user");
		output.writeUTF("password");
		System.out.println("Your username is now >>user and Password >>password");
	}catch(Exception e)
	{
		System.out.println("Reset password fail");
	}
	
}
}
