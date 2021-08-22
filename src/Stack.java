import java.util.Arrays;

public class Stack {
    private int MAX = 100;
    private int top;
    int stack[] = new int[MAX];

    public Stack() {
        top = -1;
    }

    public boolean isEmpty(){
        if (top<0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull(){
        if (top>=MAX-1){
            return true;
        }
        else {
            return false;
        }
    }

    public void push(int value){
        if (isFull()){
            System.out.println("Stack is Full");
        }
        else {
            stack[++top] = value;
            System.out.println("Value added into Stack");
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.print("Stack is Empty");
            return 0;
        }
        else {
            int value = stack[top--];
            return value;
        }
    }

    public void printStack(){
        if (isEmpty()){
            System.out.print("Stack is Empty");
        }
        else {
            int iterator = top;
            while (iterator!= -1){
                System.out.println(stack[iterator]);
                iterator--;
            }
        }
    }
}
