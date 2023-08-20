package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int nineNumber = 0;

        for (int i = 0; i < lengthOfLastNumber; i++) {
            nineNumber = nineNumber * 10 + 9;
            sum = sum + nineNumber;
        }
        System.out.println(sum);
    }
}
