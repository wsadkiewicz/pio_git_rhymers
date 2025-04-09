package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int EMPTY_VALUE = -1;
    private static final int DEFAULT_VALUE = -1;
    private final int[] numbers = new int[CAPACITY];

    public static int getCAPACITY() {
        return CAPACITY;
    }

    public static int getEmptyValue() {
        return EMPTY_VALUE;
    }

    public static int getDefaultValue() {
        return DEFAULT_VALUE;
    }

    public int getTotal() {
        return total;
    }

    private int total = EMPTY_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == EMPTY_VALUE;
    }

    public boolean isFull() {
        return total == CAPACITY-1;
    }

    protected int peekTop() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }

}
