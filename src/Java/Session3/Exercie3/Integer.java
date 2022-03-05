package Java.Session3.Exercie3;

public class Integer implements MyInteger{
   public int a;
    @Override
    public void isEven(int a) {
        if ((a %2)==0)
        {
            System.out.println("It's Even");
        }


    }

    @Override
    public void isOdd(int a) {
        if ((a%2)!=0)
        {
            System.out.println("It's Odd");
        }

    }

    @Override
    public void isPosetive(int a) {
        if (a>0)
        {
            System.out.println("It's Posetive");
        }

    }

    @Override
    public void isNegative(int a) {
        if (a<0)
        {
            System.out.println("It's Negative");
        }

    }

    @Override
    public void isZero(int a) {
        if(a==0)
        {
            System.out.println("It's Zero");
        }

    }
}
