//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        double numerador, denominador, resultado;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número: ");
        n = ler.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Informe o dividendo:");
            numerador = ler.nextDouble();

            System.out.println("Informe o divisor:");
            denominador=ler.nextDouble();

            resultado= numerador/denominador;

            if (denominador==0){
                System.out.println("Divisão impossível");
            }
            System.out.printf("%.1f%n", resultado);
        }

    }
}