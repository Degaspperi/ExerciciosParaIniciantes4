//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, x, in=0, out=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor de n: ");
        n = ler.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Informe o valor de x: ");
            x = ler.nextInt();

            if(x >= 10 && x <=20){
                in=in+1;
            }else{
                out=out+1;
            }
        }
        System.out.println(in+" in\n"+out+" out" );
    }
}