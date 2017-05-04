package StudentRegistrationSystem;
import java.io.*;
public class GetAndSetPassword {

	private String userName;
	private String password;
	public GetAndSetPassword() throws IOException
	{
	try(DataInputStream input=new DataInputStream(new FileInputStream("D:/key.dat"));)
	{
		userName=input.readUTF();
		password=input.readUTF();
	}
	
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setUserNameAndPassword(String username,String pass) throws FileNotFoundException, IOException
	{
		try(DataOutputStream out=new DataOutputStream(new FileOutputStream("D:/key.dat"));)
		{
			out.writeUTF(username);
			out.writeUTF(pass);
		}
	}
	
	
}
