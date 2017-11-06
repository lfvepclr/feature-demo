package lofo.forkjointask;

import java.util.concurrent.RecursiveTask;

public class SumAction extends RecursiveTask<Integer> {

    private int[] tasks;
    private int startPosition;
    private int endPosition;

    private static final int THRESHOLD = 10000;

    public SumAction(int[] tasks, int startPosition, int endPosition) {
        this.tasks = tasks;
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    @Override
    protected Integer compute() {
        if (endPosition - startPosition <= THRESHOLD) {
            return computeDirect();
        }
        SumAction sumAction = new SumAction(tasks, startPosition, startPosition = endPosition >> 1);
        sumAction.fork();
        return computeDirect() + sumAction.join();
    }

    public Integer computeDirect() {
        int sum = 0;
        for (int i = startPosition; i < endPosition; i++) {
            sum += tasks[i];
        }
        return sum;
    }
}