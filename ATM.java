import java.util.*;


public class ATM{
    public static void main(String args []){

    System.out.println(" ");
    
    System.out.println("          Welcome on ATM Machine");
    System.out.println(" ");
    System.out.println(" ");

  
     System.out.print("1. Banking");
     System.out.println("                    2. Yono");
     System.out.println(" ");
     System.out.println(" ");

     Scanner sc = new Scanner (System.in);
     System.out.print("enter here ");
     int var = sc.nextInt();
     System.out.println(" ");  
     System.out.println(" ");  
     
     System.out.println(" ");  
     System.out.println(" ");
     System.out.println(" ");
     System.out.println(" ");  
     System.out.println(" ");  
     System.out.println(" ");  
     System.out.println(" ");
     System.out.println(" ");
    // Banking
    switch (var){
    case 1:  
    System.out.println(" ");  
    System.out.println(" ");  
    System.out.println(" ");  
    System.out.println(" ");  
    System.out.println(" ");  
    System.out.println(" ");
    System.out.println(" ");  
    System.out.println(" ");  
    System.out.print("1. Withdrawal");
    System.out.println("   2. FAST CASH");
    System.out.println(" ");
    System.out.println("3. CHECK BALANCE");
    System.out.println(" ");  
    System.out.println(" ");  
    System.out.println(" ");
    System.out.print("enter here  ");
  


    //1.withdrawal process
    int press = sc.nextInt();
    System.out.println(" ");  
    System.out.println(" ");  
    System.out.println(" ");  
    System.out.println(" ");  
    System.out.println(" ");
    System.out.println(" ");  
    System.out.println(" ");  
    System.out.println(" ");  
    System.out.println(" ");
    System.out.println(" ");
    if(press == 1){
        System.out.println(" ");
        System.out.print("enter amount ");
        int amount = sc.nextInt();
        System.out.println(" ");  
        System.out.println(" ");  
        System.out.println(" ");  
        System.out.println(" ");  
        System.out.println(" ");
        System.out.println(" ");  
        System.out.println(" ");  
        System.out.println(" ");  
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
         System.out.print("enter your pin ");
         int pin = sc.nextInt();
         System.out.println(" ");  
         System.out.println(" ");  
         System.out.println(" ");  
         System.out.println(" ");  
         System.out.println(" ");
         System.out.println(" ");  
         System.out.println(" ");  
         System.out.println(" ");  
         System.out.println(" ");
         System.out.println(" ");
        if (pin == 1234){
            
        if ( amount<1000000){
            System.out.println(" ");
            System.out.println("Withdrawal successfull, Take money = " + amount);
            int curramount = 1000000-amount;
            System.out.println(" ");
            System.out.println("Current amount = " + curramount);
            System.out.println(" ");  
            System.out.println(" ");  
            System.out.println(" ");  
          
            


        }
        else {
            System.out.println("Insufficient balance");
            System.out.println(" ");
            System.out.println(" ");
        }

  
        }
        else  {
            System.out.println(" ");
                System.out.println("Wrong pin retry");
                System.out.println(" ");
                System.out.println(" ");
        }
           
    }

    //2.Fast cash process 
    else if (press == 2){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
     
        
        System.out.println("                                Fast cash");
        System.out.println(" ");
        System.out.print("               1. 500");
        System.out.println("                                       2. 1000");
        System.out.print("               3. 2000");
        System.out.println("                                      4. 4000");
        System.out.println(" ");
       System.out.println(" ");
       System.out.println(" ");
       System.out.print("enter here ");
       int press2 = sc.nextInt();
       System.out.println(" ");
       System.out.println(" ");
       System.out.println(" ");
       System.out.println(" ");
       System.out.println(" ");
       System.out.println(" ");
       System.out.println(" ");
       System.out.println(" ");
       System.out.println(" ");
       if (1 == press2){
        System.out.println(" ");
        System.out.print("enter your pin ");
        int pin2 = sc.nextInt();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

       
       
        if(pin2 == 1234){
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Fast cash withdrawal successfull, Take amount 500");
            System.out.println(" ");
            System.out.println(" ");
        }
            else{
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Wrong pin");
                System.out.println(" ");
                System.out.println(" ");
            }
        }

        else if (2 == press2){
            System.out.println(" ");
            System.out.print("enter your pin ");
            int pin3 = sc.nextInt();
            if(pin3 == 1234){
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Fast cash withdrawal successfull, Take amount 1000");
                System.out.println(" ");
                System.out.println(" ");

            }
            else {
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Wrong pin");
                System.out.println(" ");
                System.out.println(" ");
            }
        }

        else if (3 == press2){
            System.out.print(" ");
            System.out.println(" ");
            System.out.print("enter your pin ");
            int pin3 = sc.nextInt();
            if(pin3 == 1234){
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Fast cash withdrawal successfull, Take amount 2000");
                System.out.println(" ");
                System.out.println(" ");

            }
            else {
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Wrong pin");
                System.out.println(" ");
                System.out.println(" ");
            }
        }

        else if (4 == press2){
            System.out.println(" ");
            System.out.print("enter your pin  ");
            int pin3 = sc.nextInt();
            if(pin3 == 1234){
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Fast cash withdrawal successfull, Take amount 4000");
                System.out.println(" ");
                System.out.println(" ");

            }
            else {
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Wrong pin retry");
                System.out.println(" ");
                System.out.println(" ");
            }
        }

        else{
            System.out.println("Wrong selection retry");
            System.out.println(" ");
            System.out.println(" ");
        }

    }

    //Check balance process
    else if (press == 3){

        System.out.println(" ");
        System.out.print("enter your pin ");

        int pin4 = sc.nextInt();
    if(pin4 == 1234){
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Balance = 1000000");
            System.out.println(" ");
            
        }
        else {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Wrong pin retry ");
            System.out.println(" ");
            System.out.println(" ");
         
        }
      
    }

    else {
     
      
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");  
        System.out.println(" ");  
        System.out.println(" ");  
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Wrong selection retry");
        System.out.println(" ");  
        System.out.println(" "); 
      

      }
   
    break;

    case 2:
    System.out.println(" ");
    System.out.println("Currently not available");
    System.out.println(" ");
    System.out.println(" ");
    
    break;
    
   default:
   System.out.println(" ");
   System.out.println("Wrong selection retry");
   System.out.println(" ");
   System.out.println(" ");
}
    }
    }
   
    



