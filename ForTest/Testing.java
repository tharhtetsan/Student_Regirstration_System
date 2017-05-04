package ForTest;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Testing {
public static void main(String[] args) throws FileNotFoundException, IOException {
	try(DataInputStream in=new DataInputStream(new FileInputStream("D:/StudentData.dat"));)
	{
		while(true)
		{
			String stra="";
		stra=in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t";
		System.out.println(stra);
		}
		
	}
	catch(Exception e)
	{
		System.out.println("end file");
	}

	Testing1 stuData=new Testing1();
	
	String input=stuData.getStudentDataArray();
	String[] AllStuData=input.split("!");
	for(int i=0;i<AllStuData.length;i++)
	{
		System.out.println(AllStuData[i]);
	}
	String studentData[][]=new String[AllStuData.length][10];
	for(int i=0;i<AllStuData.length;i++)
	{
		String line[]=AllStuData[i].split(",");
		for(int j=0;j<10;j++)
		{
		studentData[i][j]=line[j];
		}
	}
	System.out.println("-----------------------------------");
	studentData[0][8]="oooooo11111";
	stuData.setStudentDataArray(studentData);
	try(DataInputStream in=new DataInputStream(new FileInputStream("D:/StudentData.dat"));)
	{
		while(true)
		{
			String stra="";
		stra=in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t";
		System.out.println(stra);
		}
		
	}
	catch(Exception e)
	{
		System.out.println("end file");
	}
	
	
}
}
