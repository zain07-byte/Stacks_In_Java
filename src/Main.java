public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);

        stack.printStack();

        stack.pop();
        stack.pop();
        stack.printStack();
    }
}
