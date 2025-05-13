import java.util.Scanner;

interface Stack {
    void push();
    void pop();
    void display();
    void overflow();
    void underflow();
}

class IntegerStack implements Stack {
    int[] stack;
    int top = -1;
    int size = 5;
    Scanner sc = new Scanner(System.in);

    IntegerStack() {
        stack = new int[size];
    }

    public void push() {
        if (top == size - 1) {
            System.out.println("Stack is Full");
        } else {
            System.out.print("Enter element to push: ");
            int ele = sc.nextInt();
            stack[++top] = ele;
            System.out.println(ele + " pushed into stack.");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Popped element: " + stack[top--]);
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public void overflow() {
        if (top == size - 1) {
            System.out.println("Stack Overflow.");
        } else {
            System.out.println("Stack is not full.");
        }
    }

    public void underflow() {
        if (top == -1) {
            System.out.println("Stack Underflow.");
        } else {
            System.out.println("Stack has elements.");
        }
    }
}

public class Operation1 {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option: 1.Push 2.Pop 3.Display 4.Overflow 5.Underflow 6.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    stack.push();
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    stack.overflow();
                    break;
                case 5:
                    stack.underflow();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
