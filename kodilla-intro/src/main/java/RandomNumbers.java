import java.util.Random;

public class RandomNumbers {
    private int number = 0;
    private int minNumber = 0;
    private int maxNumber = 0;
    private int sum = 0;
    private Random generator = new Random();

    public void isFinished() {
        for (int i = 0; sum < 5000; i++) {
            number = generator.nextInt(31);
            sum = sum + number;
            System.out.println("Loop: " + (i + 1) +
                    " sum: " + sum + " generated number: " + number);
            if (validateMinNumber(number)) {
                minNumber = number;
            }
            if (validateMaxNumber(number)) {
                maxNumber = number;
            }
        }
    }

    public boolean validateMinNumber(int number) {
        if (number < this.minNumber) {
            return true;
        }
        return false;
    }

    public boolean validateMaxNumber(int number) {
        if (number > this.maxNumber) {
            return true;
        }
        return false;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }
}
