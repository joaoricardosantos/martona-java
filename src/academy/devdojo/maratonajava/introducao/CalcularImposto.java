package academy.devdojo.maratonajava.introducao;

public class CalcularImposto {
    public static void main(String[] args) {
        double salary = 45000;
        double tax;
        if (salary > 0 && salary < 34713){
            tax = salary * 9.70 / 100;
        } else if (salary > 34712 && salary < 68508) {
            tax = salary * 37.35 / 100;
        }else {
            tax = salary * 49.50 / 100;
        }
        System.out.println(tax);
    }
}
