

/***********************************************************************************
Authors Name: Jenny Hayes
Date: 1/14/21
Program: First Homework
Description: Counting Hello to  100 and printing 10 Hellos on each line.
************************************************************************************/
import java.util.*;

public class FirstHW
{
	public static void main(String[] args)
	{

//declare the variables

int i;

//Add a loop to count to 100
for(i = 1; i <= 100; i++)
//Add a loop to put 10 numbers on a line.
 if(i % 10 ==0 && i <= 100)
   System.out.println("Hello" + i + " ");
 else
//print out Hello
 System.out.print("Hello" + i + " ");

}
}