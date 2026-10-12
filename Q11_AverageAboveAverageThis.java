import java.util.Scanner;

class NumberAnalyzer {
    private double[] numbers;
    private double average;

    NumberAnalyzer(double[] numbers) {
        this.numbers = numbers;
    }

    void calculateAverage() {
        double sum = 0;
        for (double number : this.numbers) {
            sum += number;
        }
        this.average = sum / this.numbers.length;
    }

    int countAboveAverage() {
        int count = 0;
        for (double number : this.numbers) {
            if (number > this.average) {
                count++;
            }
        }
        return count;
    }

    void displayResult() {
        System.out.printf("Average: %.2f%n", this.average);
        System.out.println("Numbers above average: " + this.countAboveAverage());
    }
}

public class Q11_AverageAboveAverageThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextDouble();
        }

        NumberAnalyzer analyzer = new NumberAnalyzer(numbers);
        analyzer.calculateAverage();
        analyzer.displayResult();
        sc.close();
    }
}
