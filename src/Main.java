//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//X, se for o caso

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 0;
        double sobra;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor de x:");
        x = ler.nextInt();
        int condicao = x;

        for (int i=1; i<=condicao; i++){
            sobra = x % 2;

            if (sobra != 0){
                System.out.println(x);
                x=x-1;
            }else{
                x=x-1;
            }

        }



    }
}