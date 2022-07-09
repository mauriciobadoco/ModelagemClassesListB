package caixa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Caixa caixa = new Caixa(1000,0,0);


        System.out.println("quantos lançamentos");
        int lanc = input.nextInt();


        for (int i =0;i <= lanc; i++){
            System.out.println("Deseja qual operação? \n Crédito = digite 1. \n Débito = digite 2");
            int tipo = input.nextInt();
            switch (tipo){
                case 1: caixa.credito();
                    break;
                case 2: caixa.debito();
                    break;
                default:
                    System.out.println("Não é opção válida");
            }
        }
        System.out.println(" O saldo final é:" + caixa.saldo);

    }

}
