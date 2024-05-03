package redesocial;

import java.util.Scanner;
import redesocial.classes.Pessoa;
import redesocial.classes.Empresa;
import redesocial.classes.Usuario;

public class RedeSocial {
    public static void main(String[] args) {
        boolean estado = true;
        Usuario adm = new Usuario();
        GuiTerminal tela = new GuiTerminal();
        Scanner entrada = new Scanner(System.in);
        int opcao;
        while (estado){
            estado = tela.isSta();
            tela.printar();
            tela.setPag_atual(entrada.nextInt());
        }
    }
    
}
