import java.lang.*;
import java.util.*;
class Reverse	
{
  String stringrev(String s)
 {
  int n=s.length();
  int index=0; 
  char[] ch=new char[n];
  for(int i=n-1;i>=0;i--)
     ch[index++]=s.charAt(i);
  String s2=new String(ch);
  return s2;  
 }
 
}
class StringRev
{ 
 public static void main(String[] args)
  { 
     Scanner a=new Scanner(System.in);
     System.out.print("The word you want to reverse is :  ");
     String s=a.nextLine();
     Reverse obj=new Reverse();
     String s1=obj.stringrev(s);
     System.out.println("The word you want to reverse is :  " +s1);
  }     

}

  