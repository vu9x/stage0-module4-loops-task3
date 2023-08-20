package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int max = first;
        int result = 1;

        if (second > first) {
            max = second;
        }

        for(int iterator = 1; iterator <= max; iterator++) {
            if (first % iterator == 0 && second % iterator == 0)
                result = iterator;
        }

        System.out.println(result);
    }
}
