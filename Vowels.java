# Vowels
import java.io.*;
import java.util.*;
public class Vowels
{ 
  public static void main(String args[])
  {
     Scanner s=new Scanner(System.in);
     char ch;
     System.out.println("Enter the letter");
     ch=s.next().charAt(0);
     if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
     {
        System.out.println(ch+"is a vowels");
     }
     else
     {
       System.out.println(ch+"is a consonant");
     }
  }
}  
  
  
