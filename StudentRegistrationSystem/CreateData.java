package StudentRegistrationSystem;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class CreateData {
public static void main(String[] args) {
	try(DataOutputStream stufile=new DataOutputStream(new FileOutputStream("D:/StudentData.dat"));)
	{
		System.out.println("Student Data file have been created ");
	}catch(Exception e)
	{
		System.out.println("Fail in Creating Student data file ");
	}
}
}
