package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int num01 = 10;
        double num02 = 20;
        double soma = num01 / num02;
        System.out.println(soma);

        int resto = 21 % 7;
        System.out.println(resto);

         boolean isDezMaiorQueVinte = 10 > 20;
         boolean isDezMenorQueVinte = 10 <20;
         boolean isDezIgualVinte = 10 == 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);

        int age = 35;
        float wage = 3500f;
        boolean isDentroDaLei = age > 30 && wage >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && wage >= 3381;
    }
}
