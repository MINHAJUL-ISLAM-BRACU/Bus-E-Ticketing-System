import java.util.*;
public class Tester{
    public static void main (String[]args){
        Scanner k = new Scanner(System.in);
        int selection;
        while(true){
            try{
                System.out.println("Please, enter:\n1 to select array based Queue\n2 to select linked list based Queue");
                selection = k.nextInt();
                if(selection!=1 && selection!=2)
                    System.err.println("Wrong Selection! Please, try Again.");
                else break;
            }
            catch(Exception e){
                System.err.println("Input Format Mismatch! Please, try Again.");
                k.next();
            }
        }
        
        ticketCollectionSystem w = new ticketCollectionSystem(selection);
        System.out.println("Enter your Choice:\n1.Register for a Passenger\n2.List of all Passenger");
        int select =0;
        while(select<=3){
            try{
                
                select = k.nextInt();
                if(select == 1){
                   w.seatAppoint();
                    System.out.println("---\n"+"Enter your Choice:\n1.Register for a Passenger\n2.List of all Passenger\n3.Exit");
               }
                
                else if(select == 2){
                   w.ShowAllPassenger();
                   System.out.println("---\n"+"Enter your Choice:\n1.Register for a Passenger\n2.List of all Passenger\n3.Exit");
                }
                else if(select == 3){
                  System.out.println("Thanks for taking Service");
                  select=4;
                }
                
                else{
                    System.out.println("Enter your Choice:\n1.Register for a Passenger\n2.List of all Passenger\n3.Exit");
                }
            }
            
            catch(Exception e){
                System.err.println("Input Format Mismatch! Please, try Again.\n"+"Enter your Choice:\n1.Register for a Passenger\n2.List of all Passenger");
                k.next();
            }
            
        }
    }
}