package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0;
        int second = 1;
        int next;

        for(int i = 0; i < lastFibonacci; i++) {
            System.out.println(first);

            next = first + second;
            first = second;
            second = next;
        }
    }
}
