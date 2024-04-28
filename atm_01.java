import java.io.*;
import java.util.*;

class atm
{
    long balance,withdraw,deposite;
    Scanner sc = new Scanner(System.in);

    void deposite()
    {
        System.out.println("Enter money to deposited :-");
        deposite = sc.nextLong();

        balance = balance + deposite;
        System.out.println("Your money has been deposited sucessfully..!");
        System.out.println(" ");


    }

    void withdraw()
    {
        System.out.println("Enter money to be withdrawn :-");
        withdraw = sc.nextLong();

        if(balance>=withdraw)
        {
            balance = balance - withdraw;
            System.out.println("Please collect your money..");

        }
        else
        {
            System.out.println("INSUFFICIENT BALANCE IN YOUR ACCOUNT ..! ");

        }
        System.out.println();
    }

    void total()
    {
        System.out.println("The total balance remaining is :- "+balance);
        System.out.println();
    }
}

class gauravkathe extends atm
{
    public boolean logIn() throws IOException
    {
        int a = 1;
        try
        {
            String user , pass ;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("\n \t \t \t \t Enter your ATM card number : ");
            user = br.readLine();

            System.out.print("\n \t \t \t \t Enter pin : ");
            pass = br.readLine();

            if(user.equals("865-7218-488") && pass.equals("2004")) {
                System.out.println("\n \t \t \t \t LOGIN SUCCESSFULLY...");
            }
            else
            {
                a = -1;
                throw new IOException("Invalid Login");
            }
        }
        catch (Exception e)
        {
            System.out.println();
        }
        if(a ==  1)
            return true;
        else
            System.out.println("Invalid Login..!");
            return false;
    }

    public static void main(String[] args)throws IOException
    {
        Scanner sc1 = new Scanner (System.in);
        gauravkathe a = new gauravkathe();

        if(!(a.logIn()))
            return;

        do
        {
            System.out.println("ATM MACHINE \n");
            System.out.println(" 1.Deposite cash ");
            System.out.println(" 2.Widthdraw cash ");
            System.out.println(" 3.Display total amount ");
            System.out.println(" 4.Exit ");

            int ch = sc1.nextInt();
            switch(ch)
            {
                case 1 :
                    a.deposite();
                    break;


                case 2 :
                    a.withdraw();
                    break;


                case 3 :
                    a.total();
                    break;


                case 4 :
                    System.exit(0);
                    break;

                default:

                    System.out.println("Invalid option ...!");
                    System.out.println("please select right option .");
            }
        }while(true);
    }
}