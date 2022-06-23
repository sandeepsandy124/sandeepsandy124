import java.util.*;
public class Bank
    {
        public static void main(String args[] )
        {
            int withdraw, deposit,balance = 100000;
            Scanner sc = new Scanner(System.in);
            String userId="1234",pin="9990";
            System.out.print("Enter your ATM pin: ");
            String in=sc.nextLine();

            if(in.equals(pin))
            {
                while(true)
                {
                    System.out.println("ATM INTERFACE");

                    System.out.println(" 1.For Check Balance \n 2.For Withdraw \n 3.For Deposit");
                    System.out.println(" 4.For Transfer \n 5.For Quit");
                    System.out.print("Choose the operation you want to perform:");

                    int choice = sc.nextInt();
                    switch(choice)
                    {
                        case 1:
                            //displaying the total balance of the user
                            System.out.println(" Balance : "+balance);
                            System.out.println("");
                            break;

                        case 2:
                            System.out.print("Enter money to be withdrawn:");
                            withdraw = sc.nextInt();
                            if(balance >= withdraw)
                            {
                                balance = balance - withdraw;
                                System.out.println("Please collect your money");
                            }
                            else
                                System.out.println("Insufficient Balance");
                            System.out.println("");
                            break;

                        case 3:

                            System.out.print("Enter money to be deposited:");
                            deposit = sc.nextInt();
                            balance = balance + deposit;
                            System.out.println("Your Money has been successfully deposited");
                            System.out.println("");
                            break;

                        case 4:
                            System.out.println("Account Based Transfer");
                            System.out.print("Enter Amount : ");
                            int amount = sc.nextInt();

                            if(amount > balance)
                                System.out.println("Balance is not sufficient");
                            else {
                                System.out.println("The amount transfer successfully");
                                balance = balance - amount;
                            }
                            System.out.println("");
                            break;

                        case 5:
                            //exit from the menu
                            System.exit(0);
                    }  //sc.close();
                }
            }//pin
            else
                System.out.println("Invalid PIN");
        }
   }
