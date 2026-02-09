package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int age = 19;

        if (age < 15) {
            System.out.println("Categoria Infantil.");
        }else if (age >= 15 && age< 18){
            System.out.println("Categoria Juvenil.");
        }else {
            System.out.println("Categoria Adulta");
        }
    }
}
