import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.PaginaInicial;


public class Main {
    public static void main(String[] args) {

        // PaginaInicial.paginaInicial();

        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        ContaCorrente.imprimirExtrato();
        ContaPoupanca.imprimirExtrato();


    
        
    }   
}
