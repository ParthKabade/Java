//input:11
//output:

import java.util.*;

class Program187
{
    public static void Display(int iRow,int iCol)
    {
       int i=0,j=0;

       for(i=1;i<=iRow;i++)
       {
            for(j=1;j<=iCol;j++)
            {
            System.out.print("*\t");
            }
            System.out.println();
       }
       
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0,iValue2=0;

        System.out.println("Enter the number of Row :");
        iValue = sobj.nextInt();

        System.out.println("Enter the number of Coloum :");
        iValue2 = sobj.nextInt();

        Display(iValue,iValue2);
    }
}