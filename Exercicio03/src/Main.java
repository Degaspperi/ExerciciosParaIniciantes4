//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        double valor1, valor2, valor3, media;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor de n:");
        n=ler.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Informe o primeiro valor: ");
            valor1=ler.nextDouble();

            System.out.println("Informe o segundo valor: ");
            valor2= ler.nextDouble();

            System.out.println("Informe o terceiro valor: ");
            valor3 = ler.nextDouble();

            media= (valor1*2+valor2*3+valor3*5)/10;
            System.out.printf("%.1f%n",media);

        }
    }
}