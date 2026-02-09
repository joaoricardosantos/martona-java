package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int cont = 0;
        while (cont < 10){
            System.out.println(++cont);
        }
        for (int  i = 0; i < 10; ++i){
            System.out.println("For" +i);
        }
        do {
            System.out.println("Dentro do Do-While" + ++cont);
        }while (cont < 10);
    }
}
