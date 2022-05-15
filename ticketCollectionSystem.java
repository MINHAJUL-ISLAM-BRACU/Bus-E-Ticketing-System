import java.util.Scanner;
public class ticketCollectionSystem {
    public static int s=0;
    public static int f=0;
    public static int n=0;
    Scanner sc=new Scanner(System.in);
    Queue queue;
    public ticketCollectionSystem(int i){
        if(i==1){
            queue=new ArrayQueue();
       }
        else{
            queue =new ListQueue();
            
        }
    }
    public void seatAppoint(){
        boolean m=true;
        passengerInfo r =null;
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter ShortCode: \n1.s for Emergency Case\n2.f for Female Seat\n1.n for Ordinary Seat");
        String shortCode = sc.next();
        
        if(shortCode.equals("s") && s<4){
            r = new passengerInfo (name , shortCode,++s);  
        }
        else if(shortCode.equals("f") && f<6){
            r = new passengerInfo (name , shortCode,++f);  
        }
        else if(shortCode.equals("n") && n<20){
            r = new passengerInfo (name , shortCode,++n);  
        }
        else {
            m=false;
        }
        while(m)
            try{
            
            queue.enqueue(r);
            System.out.println(r.name+" Added as a passenger");
            m=false;
            
            
        }
        catch(QueueOverflowException e){
            System.err.println("Seats are full! Wait For another Bus\n");
            m=false;
            
        }
        ;
    }
    
//    public void ShowAllPatient(){
//        try{
//            if(queue.isEmpty()){
//                System.out.println("Khali"); 
//            }
//            System.out.println(queue.dequeue());
//        }
//        catch(QueueUnderflowException e){
//            System.err.println("Wait For another Bus\n");
//        }
//    }
    public void ShowAllPassenger(){
       
       Object [] array = queue.toArray();
        
        for(int count1 = 0 ; count1<queue.size() ; count1++){
            for(int count2 = count1+1 ; count2 <queue.size() ; count2 ++){
                passengerInfo a = (passengerInfo) array[count1];
                passengerInfo b = (passengerInfo) array[count2];
                if(a.name.compareTo(b.name)>0){
                    Object temp = array[count1];
                    array[count1] = array[count2];
                    array[count2] = temp;
                }
            }
        }
        if(queue.size()==0){
            System.err.println("No Seat");
        }
        else{
            for(int count = 0 ; count<array.length ; count++){
                System.out.println(array[count]);
            }
        }
        
    }
}