import java.util.*;

    class ATM{
        int deposite(int bankAccount){
            
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the amount to deposite :");
            int amount=sc.nextInt();
            System.out.println("deposition succesfully");
            System.out.println("your A/C credited by " +amount);
             bankAccount=bankAccount+amount;           
             System.out.println("available balance is :" +bankAccount);

            return bankAccount;
        }
        int withdrow(int bankAccount){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the amount to withdrow :");
            int amount=sc.nextInt();
            if(amount>bankAccount){
                System.out.println("Insufficient Balance");
                return bankAccount;
            }
            System.out.println("your A/C debited by " +amount);
             bankAccount=bankAccount-amount;

             System.out.println("withdrowing succesfully");
             System.out.println("available balance is :" +bankAccount);  
             return bankAccount;
        }
        int checkBalance(int bankAccount){
            System.out.println("you bank balance is :"+bankAccount);
            return bankAccount;
        }
    }

    class usersBankBalance extends ATM{
        void showBalance(int bankAccount){
            System.out.println("account balanace:"+bankAccount);
        }
        

    }

        
    
public class ATMinterface {
    public static void main(String args[]){
        int  bankAccount=0;
        System.out.println("NAMASKAR ! welcome to our bank ");
        for(int i=0;i==i;i++){
           System.out.println("-------welcome---------");
            System.out.println("for deposite type 'one' ");
            System.out.println("for withdrow type 'two' ");
            System.out.println("for checkbalance type 'three' ");
            System.out.println("if you dont want any of this then please type 'exit' ");
            Scanner s1=new Scanner(System.in);
            System.out.println("please select one from above options : ");
        
       
        String options=s1.nextLine();
       	ATM a1=new ATM();
        
        if(options.equalsIgnoreCase("one")){	
            bankAccount=a1.deposite(bankAccount); 
           
        }else if(options.equalsIgnoreCase("two")){
	    	bankAccount =a1.withdrow(bankAccount);    
              
         }else if(options.equalsIgnoreCase("three")){
		   bankAccount =a1.checkBalance(bankAccount);    
       
        }else  if(options.equalsIgnoreCase("exit")){
            break;
        }  

     } 
     System.out.println("thanks for visiting our ATM");
     System.out.println("we hope you have no faced any problem during transition....");
     System.out.println("if you have any problem then call on '91xxxxxxx' ");

        usersBankBalance b1=new usersBankBalance();
        b1.showBalance(bankAccount);


}
}

    