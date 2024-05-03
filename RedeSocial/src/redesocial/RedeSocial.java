package redesocial;

import java.util.Scanner;
import redesocial.classes.Pessoa;
import redesocial.classes.Empresa;
import redesocial.classes.Usuario;

public class RedeSocial {
    public static void main(String[] args) {
        boolean estado = true;
        Usuario adm = new Usuario();
        GuiTerminal tela = new GuiTerminal(adm);
        Scanner entrada = new Scanner(System.in);
        int opcao;
        Pessoa taed = new Pessoa("Gustavo", "programador", "yamatomate", "Gustavo@gmail.com", "bolinho_fr1t0");
        Pessoa pessoainha = new Pessoa("jose", "trabalhador", "josezin", "jose@gmail.com", "12###34");
        adm.adicinar(taed);
        adm.adicinar(pessoainha);
        adm.adicinar(pessoainha);
        adm.adicionarPessoa("Joselito", "Professor", "Joselito_NaVara", "Joselito@gmail.com", "shjaks33");
        adm.adicionarEmpresa("Lojinha so Seu Zé", "Bar_do_ze", "Bardoze@gmail.com", "pinga12boa");
        String produtos[]={"banana", "agua"};
        adm.adicionarProduto("Bar_do_ze", produtos);
        tela.setPag_atual(-1);
        tela.printar();
        adm.removerPessoa(pessoainha);
        tela.printar();
        /*while (estado){
            estado = tela.isSta();
            tela.printar();
            tela.setPag_atual(entrada.nextInt());
        }*/
    }
    
}
