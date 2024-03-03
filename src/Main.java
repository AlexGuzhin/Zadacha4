public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 112; // вес в килограммах
        double height = 1.82; // рост в метрах
        double bmi = service.calculate(weight, height); // считаем ИМТ
        String bmiResult = String.format("%.2f",bmi); // округляем до 2-х знаков
        System.out.println("Ваш вес: " + weight + " кг.");
        System.out.println("Ваш рост: " + height*100 + " см.");
        System.out.println("Ваш индекс массы тела: " + bmiResult);
    }
}
