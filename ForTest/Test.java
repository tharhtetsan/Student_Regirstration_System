package ForTest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Test {
public static void main(String[] args) throws FileNotFoundException, IOException {
	
	int id=0;
	String str[][]=new String[3][10];
	str[0][0]="1";
	str[0][1]="a";
	str[0][2]="a";
	str[0][3]="a";
	str[0][4]="a";
	str[0][5]="a";
	str[0][6]="a";
	str[0][7]="a";
	str[0][8]="a";
	str[0][9]="2";
	
	str[1][0]="2";
	str[1][1]="b";
	str[1][2]="b";
	str[1][3]="b";
	str[1][4]="b";
	str[1][5]="b";
	str[1][6]="b";
	str[1][7]="b";
	str[1][8]="b";
	str[1][9]="3";
	
	str[2][0]="3";
	str[2][1]="b";
	str[2][2]="b";
	str[2][3]="b";
	str[2][4]="9090909";
	str[2][5]="b";
	str[2][6]="b";
	str[2][7]="6";
	str[2][8]="5";
	str[2][9]="4";
	
	
	setStudentDataArray(str);
	try(DataInputStream in=new DataInputStream(new FileInputStream("D:/StudentData.dat"));)
	{
		while(true)
		{	id=Integer.parseInt(in.readUTF());
			String stra="";
		stra=id+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t";
		System.out.println(stra);
		}
		
	}
	catch(Exception e)
	{
		System.out.println("end file");
	}
	
	System.out.println("-----------");
	String input= new String(getStudentDataArray());
	String[] letter=input.split("!");
	for(int i=0;i<letter.length;i++)
	{
		System.out.println(letter[i]);
	}
	System.out.println(letter.length);
	String stdentData[][]=new String[letter.length][10];
	System.out.println("----------------");
	for(int i=0;i<letter.length;i++)
	{
		String line[]=letter[i].split(",");
		for(int j=0;j<10;j++)
		{
		stdentData[i][j]=line[j];
		}
	}
	
	for(int i=0;i<letter.length;i++)
	{

		for(int j=0;j<10;j++)
		{
		System.out.print(stdentData[i][j]+"\t");
		}
		System.out.println();
	}
	System.out.println("111111111111111111111");
	stdentData[2][9]="uuuuuuu123";
	setStudentDataArray(stdentData);
	System.out.println("-------------------------------");
	try(DataInputStream in=new DataInputStream(new FileInputStream("D:/StudentData.dat"));)
	{
		while(true)
		{	id=Integer.parseInt(in.readUTF());
			String stra="";
		stra=id+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t"+in.readUTF()+"\t";
		System.out.println(stra);
		}
		
	}
	catch(Exception e)
	{
		System.out.println("end file");
	}
	System.out.println("1------------------------------------------");
	String input1=getStudentDataArray();
	String[] AllStuData=input1.split("!");
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
	
	for(int i=0;i<AllStuData.length;i++)
	{
		for(int j=0;j<10;j++)
		{
		System.out.print(studentData[i][j]+"\t|");
		}
		System.out.println();
	}
	studentData[0][0]="tharhtet";
	setStudentDataArray(studentData);
	System.out.println("set success");
	System.out.println("-------------------------------");
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
		System.out.println("end file1");
	}
	
}







public static void setStudentDataArray(String [][]stuData) throws FileNotFoundException, IOException
{
	

	try(DataOutputStream output=new DataOutputStream(new FileOutputStream("D:/StudentData.dat"));)
	{
		
		for(int i=0;i<stuData.length;i++)
		{
			for(int j=0;j<10;j++)
			{
				output.writeUTF(stuData[i][j]);
			}
			System.out.println(i);
		}
		}
	catch(Exception e)
	{
		System.out.println("end file error");
	}
	
}


public static String getStudentDataArray() throws FileNotFoundException, IOException
{
	
	String str="";
	try(DataInputStream input=new DataInputStream(new FileInputStream("D:/StudentData.dat")))
	{
		
		while(true)
		{
			for(int j=0;j<10;j++)
			{
				str+=input.readUTF()+",";
			}
			str=str+"!";
		}
		
		
		
		
		
		}
	catch(Exception e)
	{
		System.out.println("end file error");
	}
	
	return str;
}
}
