package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int min = firstBoarder;
        int max = secondBoarder;
        int sum = 0;

        if (firstBoarder > secondBoarder) {
            min = secondBoarder;
            max = firstBoarder;
        }

        for(int iterator = min; iterator <= max; iterator++){
            sum +=iterator;
        }
        System.out.println(sum);
    }
}
