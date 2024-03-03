import java.text.DecimalFormat;
public class BmiService {
    public int calculate(int weightInKg, double heightInMeters) {
        double bmi = weightInKg / heightInMeters / heightInMeters;
        return (int) bmi;
    }
}
