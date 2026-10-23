import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sue salario?");

        double salario = leitor.nextDouble();

        if (salario > 2000)
        {
            double salarioofc = salario * 0.11;
            System.out.println(salarioofc);
        }else if
            (salario < 1500 && salario > 2000){
            double salarioofc = salario * 0.9;
            System.out.println(salarioofc);
        }else; {
            double salarioofc = salario * 0.8;
            System.out.println(salarioofc);}


    }
}
//se for maior ou igual a 2000 11% de taxa
//entre 1500 e 2000 9% de taxa
//menor que 8% de taxa