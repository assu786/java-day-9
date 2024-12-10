import java.util.*;
class D
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String rev=" ";
        for(int i=0;i<a.length();i++)
        rev=a.charAt(i)+rev;
        System.out.println(rev);
    }
}