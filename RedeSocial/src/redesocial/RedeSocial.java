package redesocial;

import redesocial.clases.Pessoa;
import redesocial.clases.Empresa;
import redesocial.clases.Usuario;
import redesocial.clases.ListaUsuario;

public class RedeSocial {
    public static void main(String[] args) {
        ListaUsuario principal = new ListaUsuario();
        Pessoa t1 = new Pessoa("Jose", 19, "Programador broxa");
        Pessoa t2 = new Pessoa("Josefino", 45, "Programador broxa abigobado");
        String prds[] = {"abaixaqui", "suco de limonations"};
        Empresa p1 = new Empresa("Jotinha montes",prds);
        principal.adicionar(t1);
        principal.adicionar(t2);
        principal.adicionar(p1);
        principal.listar();
    }
    
}
