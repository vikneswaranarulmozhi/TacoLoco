/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.Scanner;
public class Main
{
    public void  arrtocount(int[] myNum,int num)
    {
        int n=myNum.length;
        int above=0;
        int below=0;
        for(int i=0;i<n;i++)
        {
            if(num<=myNum[i]){
                below++;
            }else{
                above++;
            }
        }
        System.out.println("Above:"+above);
        System.out.println("Below:"+below);
    
        
    }
	public static void main(String[] args) {
	int[] myNum = {1, 5, 6, 4,9,10};
	
	Scanner myObj = new Scanner(System.in);
	
	System .out.println("Enter the number:");
	int num = myObj.nextInt();
	
	Main acc=new Main();
	acc.arrtocount(myNum,num);
	}
}

