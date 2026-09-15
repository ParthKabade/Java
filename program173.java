//Input:5
//Output:1 * 2 *  3 *  4 *  5

import java.util.*;

class Program173
{

    public static void Display(int iNo)
    {
        int iCnt=0;

        for(iCnt=1;iCnt<=iNo;iCnt++)        //initalize iCnt=0 only wile working on array not in genral ccase
        {
            System.out.print(iCnt+"\t");
            System.out.print("*\t");
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