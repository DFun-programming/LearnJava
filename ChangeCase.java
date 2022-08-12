import java.lang.*;
import java.util.*;
class ChangeCase
{   
   	public static void main(String[] args)
 	{ 
   		System.out.print("Input a String ::::->   ");
  		Scanner sc=new Scanner(System.in);
		int i=0;
		String s1=new String(); 
		s1=sc.nextLine(); 
		
		int n=s1.length();
  		char[] ch=new char[n];
	
		for(int index=0;index<n;index++)
		{
			ch[i]=s1.charAt(index);
       	
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
			 	char t =(char)(ch[i]-32);
				ch[i]=t;
  		 	}
     			else if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
				char t =(char)(ch[i]+32);
				ch[i]=t;
			}
			i++; 
		}
		String s2= new String(ch);
		
		System.out.print("Customised String is ::::->      "+s2);
		
 	}
}    