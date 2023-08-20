package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number){
        int sum = 0;
        int updatedNumber = number;

        for(int iterator = 0; iterator < (number + "").length(); iterator++) {
            sum += updatedNumber % 10;
            updatedNumber /= 10;
        }

        if (sum < 0) {
            sum *= -1;
        }
        System.out.println(sum);
    }
}
