import java.util.*;
class Stack{
    int[]stk;
    int top=-1;
    int size;
    Scanner sc=new Scanner(System.in);
    Stack(){
       
        System.out.println("Enter the size: ");
        size=sc.nextInt();
        stk=new int[size];
    }
    public void push(){
        if(top==size-1){
            System.out.println("Stack is Full.");
        }
        else{
            System.out.println("Enter element to push: ");
          int  ele=sc.nextInt();
          stk[++top]=ele;
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack is empty.");
        }
        else{
            System.out.println("popped element: "+stk[top--]);
         
          
        }
    }
    public void display(){
        if(top==-1){
            System.out.println("Stack is empty.");
        }
      else{
        System.out.println("Stack elements: ");
        for(int i=0;i<=top;i++){
            System.out.println(stk[i]+" ");
        }
      }
    }
}
class StackOp{
    public static void main(String args[]){
        Stack stack = new Stack();
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("Enter menu:1.push  2.pop 3.display 4.exit");
            int choice = sc.nextInt();
            switch(choice){
            case 1:stack.push();
            break;
            case 2:stack.pop();
            break;
            case 3:stack.display();
            break;
            case 4:System.out.println("Exit");
            break;
            default:
            System.out.println("choice is not valid.");


            }
        }
    }
}