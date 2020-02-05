public class IntStack {
    private int[] arr;
    private int position = 0;

    public IntStack(int maxSize) {
        arr = new int[maxSize];
    }

    public int size() {
        return position;
    }

    public boolean isEmpty() {
        return position == 0;
    }

    public int peek() {
        return arr[position - 1];
    }

    public void push(int value) {
        arr[position++] = value;
    }

    public int pop() {
        return arr[--position];
    }

    public static void main(String args[]) {
        IntStack stack = new IntStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        benchMarkTest();
    }

    private static void benchMarkTest() {
        int n = 10000000;
        IntStack intStack = new IntStack(n);

        long start = System.nanoTime();
        for (int index = 0; index < n; index++) {
            intStack.push(index);
        }
        for (int index = 0; index < n; index++) {
            intStack.pop();
        }
        long end = System.nanoTime();
        System.out.println("InStrack Time: " + (end - start) / 1e9);

        java.util.ArrayDeque<Integer> arrayDeque = new java.util.ArrayDeque<>();
        start =System.nanoTime();
        for (int index = 0; index < n; index++) {
            arrayDeque.push(index);
        }
        for (int index = 0; index < n; index++) {
            arrayDeque.pop();
        }
        end = System.nanoTime();
        System.out.println("ArrayDeque Time: " + (end - start) / 1e9);
    }
}