package lofo.forkjointask;

import org.springframework.util.StopWatch;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class ComputeLargeArrayMain {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] tasks = new int[819_200_000];
        Arrays.fill(tasks, 1);
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        SumAction sumAction = new SumAction(tasks, 0, tasks.length);
        stopWatch.start();
        int result = forkJoinPool.invoke(sumAction);
        stopWatch.stop();
        System.out.println("Concurrent compute compute => Cost Time： "  + stopWatch.getTotalTimeMillis() + "\nresult:" + result);
        sumAction = new SumAction(tasks, 0, tasks.length);
        stopWatch.start();
        result = sumAction.computeDirect();
        stopWatch.stop();
        System.out.println("Direct compute => Cost Time： " + stopWatch.getTotalTimeMillis() + "\nresult:" + result);
    }
}
