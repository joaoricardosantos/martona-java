package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        byte dia = 6;
        String diaUtil = "É um dia útil.";
        String diaNaoUtil = "Não é um dia útil.";
        switch (dia){
            case 1:
                System.out.println("Dom");
                System.out.println(diaNaoUtil);
                break;
            case 2:
                System.out.println("Seg");
                System.out.println(diaUtil);
                break;
            case 3:
                System.out.println("Ter");
                System.out.println(diaUtil);
                break;
            case 4:
                System.out.println("Qua");
                System.out.println(diaUtil);
                break;
            case 5:
                System.out.println("Qui");
                System.out.println(diaUtil);
                break;
            case 6:
                System.out.println("Sex");
                System.out.println(diaUtil);
                break;
            case 7:
                System.out.println("Sab");
                System.out.println(diaNaoUtil);
                break;
        }
    }
}
