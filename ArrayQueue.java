 public class ArrayQueue implements Queue{
    int size;
    int front;
    int rear;
    Object [] data;
    
    public ArrayQueue(){
        size=0;
        front = -1;
        rear = -1;
        data = new Object[2];
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
        if(data.length==size){
            throw new QueueOverflowException();
        }else if(size==0){
            data[size]=o;
            size++;
            front++;
            rear++;
        }else{
            rear=(rear+1)%data.length;
            data[rear]=o;
            size++;
        }
    }
    public Object dequeue() throws QueueUnderflowException{
        if(size==0){
            throw new QueueUnderflowException();
        }else{
            Object temp=data[front];
            data[front]=null;
            front=(front+1);
            size--; 
            return temp;
        }
    }
    public Object peek() throws QueueUnderflowException{
        if(size==0){
            throw new QueueUnderflowException();
        }else{
           return data[front];
        }
    }
    
    
    
    public Object[] toArray(){
        Object [] array=new Object[size];
        int i=front;
        for(int j=0;j<size;j++){
          array[j]=data[i];
          i=(i+1)%data.length;
        }
        return array;
    }
}