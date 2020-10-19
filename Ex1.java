/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.Scanner;
public class Main
{
    public void  arrtocount(String s,int num)
    {
        int n=s.length();
        String rev=s.substring(n-num);
        for(int i=0;i<n-num;i++){
           rev+=s.charAt(i); 
        }
        System.out.println(rev);
    }
	public static void main(String[] args) {
	String s="dfsfdjlfhd";
	
	Scanner myObj = new Scanner(System.in);
	
	System .out.println("Enter the number:");
	int num = myObj.nextInt();
	
	Main acc=new Main();
	acc.arrtocount(s,num);
	}
}
