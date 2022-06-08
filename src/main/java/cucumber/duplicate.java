package cucumber;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int i,j,count=0;
	//char[] x = null;
	String str;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter String");
	str=s.next();
	char[] ch=str.toCharArray();
	for(i=0;i<str.length();i++)
	{
		for(j=i+1;j<str.length();j++)
		{
			if(ch[i]==ch[j])
			{
				System.out.println(""+ch[i]);
				count++;
				
			}
		}
		
	
	
	}
	System.out.println("number of duplicate"+count);
}
}
