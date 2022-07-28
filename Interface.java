package com.company;
import java.util.Scanner;
interface display {
    void Tamil();

    void English();

    void Maths();

    void Science();

    void Social();
}
class mark implements display{
    Scanner in = new Scanner(System.in);
    public void Tamil()
    {
       System.out.println("Enter the Tamil Mark");
       int mark = in.nextInt();
       System.out.println("Registered Succesfully!");
    }
    public void English()
    {
        System.out.println("Enter the English Mark");
        int mark = in.nextInt();
        System.out.println("Registered Succesfully!");
    }
    public void Maths()
    {
        System.out.println("Enter the Maths Mark");
        int mark = in.nextInt();
        System.out.println("Registered Succesfully!");
    }
    public void Science()
    {
        System.out.println("Enter the Science Mark");
        int mark = in.nextInt();
        System.out.println("Registered Succesfully!");
    }
    public void Social()
    {
        System.out.println("Enter the Science Mark");
        int mark = in.nextInt();
        System.out.println("Registered Succesfully!");
    }
}

class Main
{
    public static void main(String [] args)
    {
         mark m = new mark();
         Scanner in = new Scanner(System.in);
         System.out.println("1.Tamil Mark" +"\n"+
                            "2.English Mark " +"\n"+
                            "3.Maths Mark" +"\n"+
                            "4.Science Mark" +"\n"+
                            "5.Social Mark");
         System.out.println("Enter your choice : ");
         int i=in.nextInt();
         switch(i)
         {
             case 1:
                 m.Tamil();
                 break;
             case 2:
                 m.English();
                 break;
             case 3 :
                 m.Maths();
                 break;
             case 4:
                 m.Science();
                 break;
             case 5 :
                 m.Social();
                 break;
             default:
                 System.out.println("Invalid choice");
         }
    }
}