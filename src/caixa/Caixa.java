package caixa;

import java.util.Scanner;

public class Caixa {
    Scanner input = new Scanner(System.in);
    double saldo;
    double credito;
    double debito;

    public Caixa(double saldo, double credito, double debito) {
        this.saldo = saldo;
        this.credito = credito;
        this.debito = debito;
    }

    public int lancamentos(){
        System.out.println("Quantos lançamentos deseja fazer?");
        int qtdLancamentos = input.nextInt();
        if (qtdLancamentos <1){
            System.out.println("Impossível, digite quantidade maior que um");
            lancamentos();
        }else{
        }
        return qtdLancamentos;
    }

    public double credito(){
        System.out.println("Qual valor da entrada?");
        double valorEntrada = input.nextDouble();
        saldo = saldo + valorEntrada;
        return saldo;
    }
    public double debito(){
        System.out.println("Qual o valor da saída: ");
        double valorSaida = input.nextDouble();
        if (valorSaida < saldo){
            System.out.println("Saldo indisponível para o débito");
        }else{
            saldo = saldo - valorSaida;
        }
        return saldo;
    }
}
