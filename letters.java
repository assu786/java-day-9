import java.util.*;
class D 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);
        if((a&32)==0)
        System.out.println("UPPER CASE");
        else
        System.out.println("lower case");
    }
}