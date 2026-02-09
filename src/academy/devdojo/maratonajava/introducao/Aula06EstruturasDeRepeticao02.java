package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        int cont = 0;
        for (cont=0; cont < 1000000; ++cont){
            int resto = cont % 2;
            if (resto == 1){
                System.out.println(cont+ " Número Ímpar");
            }else {

                System.out.println(cont+ " Número Par");
            }
        }
    }
}
