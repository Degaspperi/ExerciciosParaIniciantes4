//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int n;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o número:");
        n = ler.nextInt();

        for (int i=1; i<=n; i++){
            int quadrado, cubo;
            quadrado=i*i;
            cubo=i*i*i;
            System.out.println(i+" "+quadrado+" "+cubo);
            


        }

    }

}