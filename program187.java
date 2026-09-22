import java.util.*;

class Program187
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        char cH = '\0';
        char cHH='\0' ;

        for(iCnt = 1, cH = 'A',cHH='a'; iCnt <= iNo; iCnt++, cH++,cHH++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.print(cHH+"\t");
                
            }
            else
            {
                System.out.print(cH + "\t");
            }
        }
        System.out.println();
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the number of elements :");
        iValue = sobj.nextInt();

        Display(iValue);
    }
}