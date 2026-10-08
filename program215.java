/*
    iRow=6;
    iCol=6;

    %	%	%	%	%	%	
    %	            	%		
    %	            	%		
    %	            	%		
    %	            	%	
    %	%	%	%	%	%
 */
import java.util.*;

class Pattern
{
    public void Display(int iRow,int iCol)
    {
        int i=0,j=0;

        //Filter for digonal parameters
        if(iRow!=iCol)
        {
            System.out.println("Invalid parameters");
            System.out.println("Number of Row and Column should be same");
            return ;
        }
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(i==0 || j==0 || i==iRow || j==iCol)
                {
                    System.out.print("%\t");                //Not appropriate result
                }
                
            }
            System.out.println();
        }
        
    }
}


class program215
{
    public static void main(String A[])
    {
        int iValue1=0,iValue2=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter Number of Rows :");
        iValue1=sobj.nextInt();

        System.out.println("Enter Number of Colums :");
        iValue2=sobj.nextInt();

        Pattern pobj=new Pattern();

        pobj.Display(iValue1,iValue2);
    }
}