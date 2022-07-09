package jardinagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Jardinagem jardim = new Jardinagem("",0,0,0,0,0,0,0);

        jardim.entradaDados();

        jardim.usarAdubo();
            System.out.println("O valor gasto com adubo em quilos foi de "+ jardim.usarAdubo());

        jardim.precoAdubo();

        jardim.precoCorteGrama();
       // System.out.println("precocorte" + (valorConteGrama * qtdGrama));


    }
}
