public class Stack {//Stack is LIFO and here we Implemented Stack Using an Array.
    int size = 6;
    int top = -1;
    int arr[] = new int[size];
     
     public void push(int x) {
        //stack full condition
        if( top == size-1) {
            System.out.println("Stack is Full...");
            return;
        }

        top++;
        arr[top] = x;
     }

     public int pop() {
        //if there is no element in a stack
        if(top == -1) {
            System.out.println("Stack is Empty...");
        return -1;
        }

        int temp = arr[top];
        top--;
        System.out.println("Pop element is :"+temp);
      return temp;
     }

     public void peek() {
        int temp = arr[top];
        System.out.println("Top/Peek Element in an Stack is : "+temp);
        return ;
     }

     public void display() {
        //as Stack Follow LIFO Operation...
        for(int i=top; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
     }
    public static void main(String[] args) {
    
        Stack s = new Stack();
           s.push(3);
           s.display();
           s.push(5);
           s.display();
           s.push(2);
           s.display();/* 
           s.push(45);
           s.push(12);
           s.push(67);
           s.display();
           s.peek();
           s.display();
           s.pop();
           s.display();*/
           s.pop();
           s.display();
           s.peek();
       
    }
}
