public class Stack {
    int top;
    int maxsize=10;
    int[] a = new int[maxsize];
    boolean isEmpty(){
        return top<0;
    }
    Stack(){
        top = -1;
    }
    boolean push(int number) {
        if(top>=maxsize-1){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            a[++top]=number;
            System.out.println(number+" pushed on to the stack");
            return true;
        }
    }

    int  pop() {
        if(top<0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x = a[top--];
            return x;
        }
    }
    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }

    }
    public void display(){
        System.out.println("Stack Contents");
        for(int i=0;i<=top;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
class Main{
    public static void main(String[] args) {
Stack s = new Stack();

s.push(10);
s.push(20);
        s.display();
s.pop();
s.display();
    }
}

