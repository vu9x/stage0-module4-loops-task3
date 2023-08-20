package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        char a = 'a';
        char z = 'z';

        for (int iterator = a; iterator <= z; iterator++)
            System.out.println((char)iterator);
    }
}
