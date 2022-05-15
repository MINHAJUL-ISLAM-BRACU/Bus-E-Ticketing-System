public class passengerInfo {
    String shortCode;
    String name;
    int i;
    
    passengerInfo(String s,String n,int j){
       shortCode=n;
        name=s;
        i=j;
        
    }
    public String toString(){
        return "Name: " + name +" Seat Number:"+shortCode+"-"+i;
    }
}