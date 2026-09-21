//Input:7
//Output:a	b	c	d	e	f	g

import java.util.*;

class Program180
{

    public static void Display(int iNo)
    {
        int iCnt=0;
        char cH='\0';

        for(iCnt=1,cH='a';iCnt<=iNo;iCnt++,cH++)       
        {
        }

        System.out.println();
    }

    
    public static void main(String A[])
{
    Scanner sobj=new Scanner(System.in);

    int iValue=0;

    System.out.println("Enter the number of elements :");
    iValue=sobj.nextInt();

    Display(iValue);
}

}