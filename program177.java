//Input:7
//Output:1	*	3	*	5	*	7	*

import java.util.*;

class Program177
{

    public static void Display(int iNo)
    {
        int iCnt=0,iAnt=1;

        for(iCnt=1;iCnt<=iNo;iCnt++)        //initalize iCnt=0 only wile working on array not in genral ccase
        {
            if(iCnt%2==0)
            {
                System.out.print("\t*\t");
            }
            else
            {
                System.out.print("\t"+iAnt+"\t");
                iAnt++;
            }
            
        
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