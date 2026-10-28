import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero de entrada: ");
        int entrada = input.nextInt();
        double cem = entrada /100;
        double cinquenta = entrada /50;
        double vinte = entrada /20 ;
        System.out.printf("Valor: %d%n",(int)  cem);
        System.out.println("Valor: %d%n",(int) cinquenta);
        System.out.println("Valor: %d%n",(int) vinte);
    }
}


//Exercício 3 – Caixa eletrônico
        //Leia um valor inteiro de saque. Mostre a menor quantidade de cédulas de R$ 100, 50, 20,
        //10, 5 e 2 e de moedas de R$ 1 para pagar esse valor.
       // Entrada: 388
       // Saída: 100: 3 | 50: 1 | 20: 1 | 10: 1 | 5: 1 | 2: 1 | 1: 1
      //  Dica: use uma variável restante que é atualizada com % depois de cada tipo de cédula.