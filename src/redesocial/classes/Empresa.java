
package redesocial.classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa extends Usuario{
    public String nomeComercial;
    public ArrayList<String> produtos = new ArrayList();//!!reformular vai ser produtos mesmo ou só strings!!
    private Scanner entrada;
    //construtor
    public Empresa(){
        this.entrada = new Scanner(System.in);
    }

    public Empresa(String nomeComercial, ArrayList<String> produtos){
        this.nomeComercial = nomeComercial;
        this.produtos = produtos;
    }
    
    public Empresa(String nomeComercial,String nomeUsuario, String email, String senha) {
        super(nomeUsuario, email, senha);
        this.entrada = new Scanner(System.in);
        this.nomeComercial = nomeComercial;
        
    }
    //metodos
    public void adicionar(String prod){
        produtos.add(prod);
    }
    //
    @Override
    public String toString() {
        return "Empresa{" + "NomeComercial=" + nomeComercial + ", produtos=" + produtos + ", email="+ super.email
                + ", nome usuario=" + super.nomeUsuario + ", senha=" + super.senha + '}';
    }
    
}
