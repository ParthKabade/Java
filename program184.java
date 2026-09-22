import java.util.*;

class Program180
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        char cH = '\0';

        for(iCnt = 1, cH = 'A'; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.print(cH + "\t");
                cH++;
            }
            else
            {
                System.out.print("*\t");
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