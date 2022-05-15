public class ListQueue implements Queue{
    int size;
    Node front;
    Node rear;
    
   public ListQueue(){
        size = 0;
        front = null;
        rear = null;
    }
    public int size(){
        return size; 
    } 
   
    public boolean isEmpty(){
        if(size==0){
            return true;
        }else
            return false;
    }
    
  
    public void enqueue(Object o) throws QueueOverflowException{
        Node n=new Node(o,null);
        if(size==0){
            front=n;
            rear=n;
        }else{
            rear.next=n;
            rear=rear.next;
        }
        size++;
    }
    
    public Object dequeue() throws QueueUnderflowException{
        if(size==0){
            throw new  QueueUnderflowException();
        }else{
            Object n=front.val;
            front=front.next;
            size--;
            return n;
        }
        
    }
    
    public Object peek() throws QueueUnderflowException{
        if(size==0){
            throw new  QueueUnderflowException();
        }else
            return front.val;
    }
    
    public Object[] toArray(){
        Object [] array=new Object[size];
        Node n=front;
        for(int j=0;j<size;j++){
            array[j]=n.val;
            n=n.next;
        }
        return array;
    }
}