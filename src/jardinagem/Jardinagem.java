package jardinagem;


import java.util.Scanner;

public class Jardinagem {

    String nomeJardim;
    double qtdMetros;
    double qtdPlantas;
    double qtdMetrosGrama;
    double KilosAdubo;
    double valorMetroGrama;
    double valorConteGrama;
    double valorAdubo;

    public Jardinagem(String nomeJardim, double qtdMetros, double qtdPlantas, double qtdMetrosGrama, double kilosAdubo, double valorMetroGrama, double valorConteGrama, double valorAdubo) {
        this.nomeJardim = nomeJardim;
        this.qtdMetros = qtdMetros;
        this.qtdPlantas = qtdPlantas;
        this.qtdMetrosGrama = qtdMetrosGrama;
        KilosAdubo = kilosAdubo;
        this.valorMetroGrama = valorMetroGrama;
        this.valorConteGrama = valorConteGrama;
        this.valorAdubo = valorAdubo;
    }

    Scanner input = new Scanner(System.in);
   public void entradaDados(){
       System.out.println("Qual o nome do seu jardim?");
       String nomeJardim = input.next();
       System.out.println("Quantos metros tem seu jardim?");
       double qtdMetros = input.nextDouble();
       System.out.println("Qual a quantidade de plantas? ");
       double qtdPlantas = input.nextDouble();
       System.out.println("Qual a quantidade de grama tem no jardim");
       double qtdMetrosGrama = input.nextDouble();
       System.out.println("Qual o preço do adubo?");
       double valorAdubo = input.nextDouble();
       System.out.println("Qual o valor do metro para cortar a grama");
       double valorConteGrama = input.nextDouble();
   }

    public double usarAdubo() {
        System.out.println("Quantos metros de grama será adubado?");
        int metros = input.nextInt();
        double total = 0;
        total = (metros * 0.05);
        System.out.println("quantidade dentro metodo" + total);
        return total;
    }

    public void precoAdubo() {
        System.out.println(" O valor gasto com adubo foi de " +(usarAdubo() * valorAdubo));
    }

    public void precoCorteGrama(){
        System.out.println("O valor total do corte da grama é: " + (this.qtdMetrosGrama * this.valorConteGrama));
    }
}