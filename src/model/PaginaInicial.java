package model;

import java.util.ArrayList;
import java.util.Scanner;

public class PaginaInicial extends Usuario{

    public static Scanner sc = new Scanner(System.in);
    public static Usuario usuarioLogado = null; 

    public static void paginaInicial() {  
        ArrayList<Usuario> usuarios = new ArrayList();

        boolean rodando = true;
        while(rodando) {
        System.out.println("=== PAGINA INICIAL ===");
        System.out.println("1 Fazer cadastro");
        System.out.println("2 Fazer Login");
        System.out.println("3 Sair");
        System.out.println("4- listar usuarios");
        System.out.println("Digite a opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
            System.out.println("*** CADASTRO ***");
            System.out.println("Digite o usuário: ");
            String user = sc.nextLine();
            System.out.println("Digite senha: ");
            String senha = sc.nextLine();

            Usuario u = new Usuario();
            u.setUser(user);
            u.setSenha(senha);
            usuarios.add(u);

            System.out.println("Usuario cadastrado");
                
            break;

            case 2: {
            System.out.println("*** LOGIN ***");
            System.out.println("Digite o usuario: ");
            String userLog = sc.nextLine();
            System.out.println("Digite senha: ");
            String senhaLog = sc.nextLine();

            break;

            } 

            case 3: {
                rodando = false;
                System.out.println("encerrando...");
                break;
            }

            default:
                break;
            }

        }

        System.out.println("Programa encerrado.");
        sc.close();
    } 
}
