import java.util.*;
class Queue{
   int[] queue;
   int front=-1,rear=-1;
   int size;
   Scanner sc=new Scanner(System.in);
   Queue(){
    System.out.println("Enter the size of queue: ");
    size=sc.nextInt();
    queue=new int[size];
   }
  public void Enqueue(){
    if(rear==size-1){
        System.out.println("Queue is full");

    }
    else{
        System.out.println("Enter ele to enqueue: ");
        int ele = sc.nextInt();
        if(front==-1);
        queue[++rear]=ele;
    }
   }
  public void Dequeue(){
    if(front==-1||front>rear){
        System.out.println("Queue is empty");

    }
    else{
        System.out.println(" dequeue the element: "+queue[front++]);
       
        
    }
   }
   public void Display(){
    if(front==-1||front>rear){
        System.out.println("Queue is empty");
}
else{
    System.out.println("Elements in queue: ");
    for(int i=front;i<=rear;i++){
    System.out.println(queue[i]+"") ;   
    }
}

   }
}
class QueOp{
    public static void main(String args[]){
        Queue queue = new Queue();
    Scanner sc =new Scanner(System.in);


    while(true){
       
        System.out.println("1.enqueue 2.dequeue 3.display 4.exit");
        int choice=sc.nextInt();
        switch(choice){
            case 1 : queue.Enqueue();
            break;
            case 2 : queue.Dequeue();
            break;
            case 3 : queue.Display();
            break;
            case 4 : System.out.println("Exit..");
            break;
            default:
            System.out.println("Not valid Choice..");
            
        }
    }
    }
}