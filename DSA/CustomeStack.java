package DSA;
class CustomeStack {

    protected int pointer = 0;
    protected int[] data;

    protected static final int DEFAULT_SIZE = 5;

    public CustomeStack() {
        this(DEFAULT_SIZE);
    }

    public CustomeStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        // if (isFull()) {
        // System.out.println("Array is full");
        // return false;
        // }
        data[pointer] = item;
        pointer++;
        return true;
    }

    public int pop() {
        pointer--;
        int removed = data[pointer];
        return removed;
    }

}
