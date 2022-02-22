package model;

import java.util.Scanner;

public class PaginaLogado {
    public static Scanner sc = new Scanner(System.in);

    public static void paginaLogado() {
        boolean rodando = true;
        while (rodando) {
            System.out.println("*** LOGADO ***");
            System.out.println("1- Extrato.");
            System.out.println("2- Deposito.");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("*** EXTRATO ***");
                    
                    break;
            
                default:
                    break;
            }
            
        }

    }

    
}
