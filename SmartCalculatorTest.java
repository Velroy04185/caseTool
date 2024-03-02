package assignment;

public class SmartCalculatorTest {

    private double principal;
    private double rate;
    private double time;
    private double amount;
    private double[] numbers;
    private double totalMarks;
    private double marksObtained;

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double[] getNumbers() {
        return numbers;
    }

    public void setNumbers(double[] numbers) {
        this.numbers = numbers;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    public double getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(double marksObtained) {
        this.marksObtained = marksObtained;
    }

    public double calculateSimpleInterest() {
        return (principal * rate * time) / 100;
    }

    public double calculateCompoundInterest() {
        return principal * Math.pow(1 + rate / 100, time) - principal;
    }

    public double calculateMean() {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public double calculatePercentage() {
        return (marksObtained / totalMarks) * 100;
    }
}
