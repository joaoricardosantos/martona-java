package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salary = 5000;
        String mensagem = "Eu vou doar 500 para o DevDojo";
        String naoDoar = "Ainda não tenho condições, mas vou ter!";
        String misera = "Tenho dinheiro nem para comer, imagina para doar";
        String resultado;
        if(salary >= 5000){
            resultado = mensagem;
        } else if (salary <= 1500) {
            resultado = misera;
        }else {
            resultado = naoDoar;
        }
        System.out.println(resultado);
    }
}
