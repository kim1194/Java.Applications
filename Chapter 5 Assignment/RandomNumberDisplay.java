import java.util.Random;

public class RandomNumberDisplay {
    public static void main(String[] args) {
        Random random = new Random();

        int[] setA = {2, 4, 6, 8, 10};
        int randomIndexA = random.nextInt(setA.length);
        System.out.println("Random number from set a: " + setA[randomIndexA]);

        int[] setB = {3, 5, 7, 9, 11};
        int randomIndexB = random.nextInt(setB.length);
        System.out.println("Random number from set b: " + setB[randomIndexB]);

        int[] setC = {6, 10, 14, 18, 22};
        int randomIndexC = random.nextInt(setC.length);
        System.out.println("Random number from set c: " + setC[randomIndexC]);
    }
}