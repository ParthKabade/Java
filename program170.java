import java.util.*;

class ArrayX
{
    private:
        int *Arr;
        int iSize;

    public:         
        
        
        ArrayX(int X=5) //Parametrised constructor with default argument
        {
            iSize = X;               
            Arr =new int[iSize];    
        }

        void Accept()
        {
            System.out.println("Enter the elementa :");

            for(iCnt=0;iCnt<iSize;iCnt++)
            {
                cin>>Arr[iCnt];
            }
        }
}

public static void main(String A[])
{
    Scanner sobj=new Scanner(System.in);
    ArrayX *aobj=new aobj;

    //FUNCTION CALL

    int iLength=0;
    
    System.out.println("Enter the. number of elements:");
    iLegthn=sobj.nextInt();

    aobj=new ArrayX(ArrayX(iLength));

    aobj->Accept();
    aobj->(Display);
}

/*
import java.util.*;

class ArrayX
{
    private int Arr[];
    private int iSize;

    public ArrayX(int X)
    {
        iSize = X;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements :");

        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements are :");

        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

class Demo
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements :");
        int iLength = sobj.nextInt();

        ArrayX aobj = new ArrayX(iLength);

        aobj.Accept();
        aobj.Display();
    }
}
 */