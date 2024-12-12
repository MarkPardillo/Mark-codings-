public class BMICalculator {
    public static void main(String[] args) {
        double weight = 54;
        double height = 1.64;
        double minimumBMI = 18.5;

        calculateBMI(weight, height, minimumBMI);
    }

    public static void calculateBMI(double weight, double height, double minimumBMI) {
        double BMI = weight / (height * height);
        System.out.println("BMI = " + Math.round(BMI));

        if (BMI < minimumBMI) {
            System.out.println("Underweight");
        } else if (BMI >= minimumBMI && BMI <= 25.0) {
            System.out.println("Normal");
        } else if (BMI > 25.0 && BMI <= 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}