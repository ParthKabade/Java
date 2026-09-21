//Input:7
//Output:a	b	c	d	e	f	g

import java.util.*;

class Program179
{

    public static void Display(int iNo)
    {
        int iCnt=0;
        char cH='a';

        for(iCnt=1;iCnt<=iNo;iCnt++)        //initalize iCnt=0 only wile working on array not in genral ccase
        {
            System.out.print(cH+"\t");
            cH++;
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