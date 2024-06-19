//Ler um número inteiro N e calcular todos os seus divisores

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        double divisao;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o número:");
        n = ler.nextInt();

        for (int i = 1; i <= n; i++) {

            divisao = n % i;

            if (divisao == 0) {
                System.out.println(i);
            }

        }
    }
}